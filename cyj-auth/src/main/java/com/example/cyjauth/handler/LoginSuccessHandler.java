package com.example.cyjauth.handler;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cyjauth.constant.SecurityConstant;
import com.example.cyjauth.entity.bo.AuthUserDetails;
import com.example.cyjcommon.entity.bean.UserBean;
import com.example.cyjcommon.entity.relation.UserRoleRelation;
import com.example.cyjcommon.utils.ResponseUtil;
import com.example.cyjcommon.utils.ResultCode;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjuser.service.bean.custom.UserCustomServiceImpl;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Noice
 */
@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

    private StringRedisTemplate redisTemplate;
    private UserCustomServiceImpl userCustomServiceImpl;

    @Autowired
    public void setUserCustomService(UserCustomServiceImpl userCustomServiceImpl) {
        this.userCustomServiceImpl = userCustomServiceImpl;
    }

    @Autowired
    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 用户认证成功后 生成token并返回
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        AuthUserDetails authUserDetails = (AuthUserDetails) authentication.getPrincipal();//从内存中获取当前认证用户信息
        String userName = authentication.getName();
        //在redis中查询用户之前是否登入
        String oldToken = redisTemplate.opsForValue().get("token_" + userName);
        if (!StringUtils.isBlank(oldToken)) {
            //清除旧Token
            redisTemplate.delete("token_" + userName);
        }
        String roleInfosMapPermission = redisTemplate.opsForValue().get("authentication:roleinfos:permissions:" + userName);
        if (StringUtils.isBlank(roleInfosMapPermission)) {
            //将角色与权限关系存入redis
            UserBean user = userCustomServiceImpl.findAuthUserByUsername(userName);
            List<UserRoleRelation> userRoleList = new UserRoleRelation().selectList(new QueryWrapper<UserRoleRelation>().lambda()
                    .eq(UserRoleRelation::getUserId, user.getId()));
            redisTemplate.opsForValue()
                    .set("authentication:roleinfos:permissions:" + userName, JSON.toJSONString(userRoleList), 480, TimeUnit.MINUTES);
        }
        //创建token
        String accessToken = createAccessJwtToken(authUserDetails);
        //存入redis
        redisTemplate.opsForValue().set("token_" + userName, accessToken, 480, TimeUnit.MINUTES);
        HashMap<String, String> map = new HashMap<>();
        map.put("accessToken", accessToken);
        map.put("userName", userName);
        ResponseUtil.out(response, JSON.toJSONString(ResultVO.success(ResultCode.LOGIN_SUCCESS, map)));
    }

    /**
     * 生成token
     *
     * @param authUserDetails authUserDetails
     * @return AccessJwtToken
     **/
    public String createAccessJwtToken(AuthUserDetails authUserDetails) {
        if (StringUtils.isBlank(authUserDetails.getUsername())) {
            throw new IllegalArgumentException("用户名为空无法创建token");
        }
        Claims claims = Jwts.claims().setSubject(authUserDetails.getUsername());
        //存入角色信息
        List<String> list = new ArrayList<>();
        List<UserRoleRelation> userRoleList = new UserRoleRelation().selectList(new QueryWrapper<UserRoleRelation>().lambda()
                .eq(UserRoleRelation::getUserId, authUserDetails.getId()));
        for (UserRoleRelation userRole : userRoleList) {
            list.add(userRole.getRoleId());
        }
        claims.put(SecurityConstant.AUTHORITIES, JSON.toJSONString(list));
        LocalDateTime currentTime = LocalDateTime.now();
        return Jwts.builder()
                .setClaims(claims)
                .setIssuer(SecurityConstant.tokenIssuer)
                .setIssuedAt(Date.from(currentTime.atZone(ZoneId.systemDefault()).toInstant()))
                .setExpiration(Date.from(currentTime
                        .plusMinutes(SecurityConstant.tokenExpirationTime)
                        .atZone(ZoneId.systemDefault()).toInstant()))
                .signWith(SignatureAlgorithm.HS512, SecurityConstant.tokenSigningKey)
                .compact();
    }

}
