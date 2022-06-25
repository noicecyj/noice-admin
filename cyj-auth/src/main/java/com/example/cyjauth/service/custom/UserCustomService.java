package com.example.cyjauth.service.custom;

import com.alibaba.fastjson2.JSON;
import com.example.cyjauth.entity.bo.AuthUserDetails;
import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.entity.QUser;
import com.example.cyjcommon.entity.User;
import com.example.cyjcommon.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.rest.dto.identity.UserCredentialsDto;
import org.camunda.bpm.engine.rest.dto.identity.UserProfileDto;
import org.camunda.bpm.engine.rest.exception.InvalidRequestException;
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

import javax.ws.rs.core.Response;
import java.util.Optional;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class UserCustomService extends BaseService implements UserDetailsService {


    private IdentityService identityService;
    private StringRedisTemplate redisTemplate;
    private UserDao userDao;

    @Autowired
    public void setIdentityService(IdentityService identityService) {
        this.identityService = identityService;
    }

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

    private static final Logger logger = LoggerFactory.getLogger(UserCustomService.class);

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("UserService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        User user = (User) params[0];
        logger.info("UserService.addOneAfter.user:{}", JSON.toJSONString(user));
        if (identityService.isReadOnly()) {
            throw new InvalidRequestException(Response.Status.FORBIDDEN, "Identity service implementation is read-only.");
        } else {
            UserProfileDto profile = new UserProfileDto();
            profile.setId(user.getUserName());
            profile.setFirstName(user.getFirstName());
            profile.setLastName(user.getSecondName());
            profile.setEmail("");
            UserCredentialsDto userCredentialsDto = new UserCredentialsDto();
            userCredentialsDto.setPassword(user.getPassword());
            if (profile != null && profile.getId() != null) {
                org.camunda.bpm.engine.identity.User newUser = identityService.newUser(profile.getId());
                profile.update(newUser);
                if (userCredentialsDto != null) {
                    newUser.setPassword(userCredentialsDto.getPassword());
                }

                identityService.saveUser(newUser);
            } else {
                throw new InvalidRequestException(Response.Status.BAD_REQUEST, "request object must provide profile information with valid id.");
            }
        }
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        User user = (User) params[0];
        logger.info("UserService.deleteOneBefore.user:{}", JSON.toJSONString(user));
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        User user = (User) params[0];
        logger.info("UserService.findAllAfter.user:{}", JSON.toJSONString(user));
        if (identityService.isReadOnly()) {
            throw new InvalidRequestException(Response.Status.FORBIDDEN, "Identity service implementation is read-only.");
        } else {
            identityService.deleteUser(user.getUserName());
        }
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        User user = (User) params[0];
        logger.info("UserService.updateOneBefore.user:{}", JSON.toJSONString(user));
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        User user = (User) params[0];
        logger.info("UserService.updateOneAfter.user:{}", JSON.toJSONString(user));
        if (identityService.isReadOnly()) {
            throw new InvalidRequestException(Response.Status.FORBIDDEN, "Identity service implementation is read-only.");
        } else {
            UserProfileDto profile = new UserProfileDto();
            profile.setId(user.getUserName());
            profile.setFirstName(user.getFirstName());
            profile.setLastName(user.getSecondName());
            profile.setEmail("");
            if (profile != null && profile.getId() != null) {
                org.camunda.bpm.engine.identity.User newUser = identityService.createUserQuery().userId(user.getUserName()).singleResult();
                profile.update(newUser);
                identityService.saveUser(newUser);
            } else {
                throw new InvalidRequestException(Response.Status.BAD_REQUEST, "request object must provide profile information with valid id.");
            }
        }
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Integer pageNumber = (Integer) params[0];
        logger.info("UserService.findAllBefore.pageNumber:{}", pageNumber);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Integer pageNumber = (Integer) params[0];
        logger.info("UserService.findAllBefore.pageNumber:{}", pageNumber);
    }

}
