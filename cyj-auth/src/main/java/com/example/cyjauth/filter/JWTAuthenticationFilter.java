package com.example.cyjauth.filter;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.cyjauth.constant.SecurityConstant;
import com.example.cyjauth.entity.bo.AuthGrantedAuthority;
import com.example.cyjauth.exception.CommonException;
import com.example.cyjcommon.utils.ResultCode;
import com.example.cyjcommon.utils.SpringUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JWT过滤器
 */
public class JWTAuthenticationFilter extends BasicAuthenticationFilter {

    private static final String FILTER_APPLIED = "spring_security_JWTAuthenticationFilter_filterApplied";

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        //解决同一请求，两次经过过滤器  原因：过滤器被加载WebSecurityConfig和spring都加载了
        if (request.getAttribute(FILTER_APPLIED) != null) {
            chain.doFilter(request, response);
            return;
        }
        request.setAttribute(FILTER_APPLIED, true);
        //获取请求头
        String header = request.getHeader(SecurityConstant.HEADER);
        //如果请求头中不存在 或  格式不对  则进入下个过滤器
        if (StringUtils.isBlank(header) || !header.startsWith(SecurityConstant.TOKEN_SPLIT)) {
            chain.doFilter(request, response);
            return;
        }
        try {
            UsernamePasswordAuthenticationToken authentication = getAuthentication(request);
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (Exception e) {

            return;
        }
        chain.doFilter(request, response);
    }

    /**
     * 对token进行解析认证
     */
    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) throws CommonException {
        StringRedisTemplate stringRedisTemplate = SpringUtil.getBean(StringRedisTemplate.class);
        String token = request.getHeader(SecurityConstant.HEADER);
        if (StringUtils.isNotBlank(token)) {
            // 解析token
            Claims claims;
            try {
                claims = Jwts.parser()
                        .setSigningKey(SecurityConstant.tokenSigningKey)
                        .parseClaimsJws(token.replace(SecurityConstant.TOKEN_SPLIT, ""))
                        .getBody();
            } catch (ExpiredJwtException e) {
                throw new CommonException(ResultCode.TOKEN_IS_INVALID);
            } catch (Exception e) {
                throw new CommonException(ResultCode.TOKEN_IS_WRONG);
            }
            //获取用户名
            String userName = claims.getSubject();
            //判定token
            String oldToken = stringRedisTemplate.opsForValue().get("token_" + userName);
            if (StringUtils.isBlank(oldToken)) {
                throw new CommonException(ResultCode.TOKEN_IS_LOGOUT);
            }
            if (!oldToken.equals(token.replace(SecurityConstant.TOKEN_SPLIT, ""))) {
                throw new CommonException(ResultCode.TOKEN_IS_INVALID);
            }
            //获取redis中角色与权限关系
            String roleInfosMapPermission = stringRedisTemplate.opsForValue().get("authentication:roleinfos:permissions:" + userName);
            if (StringUtils.isBlank(roleInfosMapPermission)) {
                throw new CommonException(ResultCode.AUTH_IS_CHANGE);
            }
            List<AuthGrantedAuthority> authorities = new ArrayList<>();
            //获取当前用户角色
            String authority = claims.get(SecurityConstant.AUTHORITIES).toString();
            if (StringUtils.isNotBlank(authority)) {
                JSONArray list = JSONArray.parseArray(authority);
                JSONArray redisData = JSONArray.parseArray(roleInfosMapPermission);
                //循环查找权限
                for (int i = 0; i < list.size(); i++) {
                    String userRoleId = list.getString(i);//jtw取出的角色id
                    for (int j = 0; j < redisData.size(); j++) {
                        JSONObject redisArray = redisData.getJSONObject(j);
                        if (userRoleId.equals(redisArray.getString("id"))) {//对比
                            if ("613cd04b-b988-46d6-af34-76c6e3abdde6".equals(userRoleId)) {
                                authorities.add(new AuthGrantedAuthority("/**", "ALL"));
                            } else {
                                JSONArray redisDataPer = redisArray.getJSONArray("authority");//获取权限
                                for (int z = 0; z < redisDataPer.size(); z++) {
                                    JSONObject jsonObject = redisDataPer.getJSONObject(z);
                                    //加入权限列表
                                    String path = "/**/" + jsonObject.getString("path");
                                    authorities.add(new AuthGrantedAuthority(path, jsonObject.getString("method")));
                                }
                            }
                        }
                    }
                }
            } else {
                throw new CommonException(ResultCode.USER_IS_NULL);
            }
            if (StringUtils.isNotBlank(userName)) {
                //此处password不能为null
                User principal = new User(userName, "", authorities);
                return new UsernamePasswordAuthenticationToken(principal, null, authorities);
            }
        }
        return null;
    }

}

