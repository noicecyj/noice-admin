package com.example.cyjauth.service.custom.Impl;

import com.example.cyjauth.entity.bo.AuthUserDetails;
import com.example.cyjauth.service.custom.UserCustomService;
import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.entity.po.QUserPO;
import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-02-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserCustomServiceImpl extends BaseService implements UserCustomService, UserDetailsService {

    private StringRedisTemplate redisTemplate;
    private UserDao userDao;

    @Autowired
    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserPO findAuthUserByUsername(String username) {
        return queryFactory
                .selectFrom(QUserPO.userPO)
                .where(QUserPO.userPO.userName.eq(username))
                .fetchOne();
    }

    @Override
    public void resetPassword(String userId, String newPassword, String checkPassword) {
        if (newPassword.equals(checkPassword)) {
            Optional<UserPO> userPOOptional = userDao.findById(userId);
            if (userPOOptional.isPresent()) {
                UserPO userPO = userPOOptional.get();
                BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                String password = passwordEncoder.encode(newPassword);
                userPO.setPassword(password);
                userDao.saveAndFlush(userPO);
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
        UserPO po = findAuthUserByUsername(username);
        if (null == po) {
            throw new UsernameNotFoundException("当前用户不存在");
        }
        if (po.getRole() == null || po.getRole().isEmpty()) {
            throw new UsernameNotFoundException("当前用户无角色");
        }
        return new AuthUserDetails(po);
    }

}
