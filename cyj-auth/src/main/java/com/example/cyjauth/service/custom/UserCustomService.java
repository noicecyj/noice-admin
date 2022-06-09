package com.example.cyjauth.service.custom;

import com.example.cyjauth.entity.bo.AuthUserDetails;
import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.entity.QUser;
import com.example.cyjcommon.entity.User;
import com.example.cyjcommon.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class UserCustomService extends BaseService implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(UserCustomService.class);

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

    public User findAuthUserByUsername(String username) {
        return queryFactory
                .selectFrom(QUser.user)
                .where(QUser.user.userName.eq(username))
                .fetchOne();
    }

    public void resetPassword(String userId, String newPassword, String checkPassword) {
        if (newPassword.equals(checkPassword)) {
            Optional<User> userOptional = userDao.findById(userId);
            if (userOptional.isPresent()) {
                User user = userOptional.get();
                BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                String password = passwordEncoder.encode(newPassword);
                user.setPassword(password);
                userDao.saveAndFlush(user);
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
        User po = findAuthUserByUsername(username);
        if (null == po) {
            throw new UsernameNotFoundException("当前用户不存在");
        }
        if (po.getRole() == null || po.getRole().isEmpty()) {
            throw new UsernameNotFoundException("当前用户无角色");
        }
        return new AuthUserDetails(po);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("UserCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("UserCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("UserCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("UserCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("UserCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("UserCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("UserCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("UserCustomAop.findAllAfter:{}", joinPoint);
    }

}
