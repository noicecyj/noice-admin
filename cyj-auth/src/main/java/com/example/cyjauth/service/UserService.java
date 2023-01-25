package com.example.cyjauth.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cyjauth.entity.bo.AuthUserDetails;
import com.example.cyjcommon.entity.bean.UserBean;
import com.example.cyjcommon.entity.relation.UserRoleRelation;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService implements UserDetailsService {

    private StringRedisTemplate redisTemplate;

    @Autowired
    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public UserBean findAuthUserByUsername(String username) {
        return new UserBean().selectOne(new QueryWrapper<UserBean>().lambda()
                .eq(UserBean::getUserName, username));
    }

    public void resetPassword(String userId, String newPassword, String checkPassword) {
        if (newPassword.equals(checkPassword)) {
            UserBean user = new UserBean().selectById(userId);
            if (user != null) {
                BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                String password = passwordEncoder.encode(newPassword);
                user.setUserPassword(password);
                user.updateById();
            }
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String flagKey = "loginFailFlag:" + username;
        String value = redisTemplate.opsForValue().get(flagKey);
        if (StringUtils.isNotBlank(value)) {
            //超过限制次数
            throw new UsernameNotFoundException("登录错误次数超过限制");
        }
        //查询用户信息
        UserBean po = findAuthUserByUsername(username);
        if (null == po) {
            throw new UsernameNotFoundException("当前用户不存在");
        }
        List<UserRoleRelation> userRoleList = new UserRoleRelation()
                .selectList(new QueryWrapper<UserRoleRelation>().lambda()
                        .eq(UserRoleRelation::getUserId, po.getId()));
        if (userRoleList == null || userRoleList.isEmpty()) {
            throw new UsernameNotFoundException("当前用户无角色");
        }
        return new AuthUserDetails(po);
    }

}
