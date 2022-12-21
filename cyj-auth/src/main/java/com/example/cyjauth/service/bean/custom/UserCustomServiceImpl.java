package com.example.cyjauth.service.bean.custom;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjauth.entity.bo.AuthUserDetails;
import com.example.cyjcommon.entity.bean.UserBean;
import com.example.cyjcommon.entity.relation.UserRoleRelation;
import com.example.cyjcommon.mapper.bean.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
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

import java.util.List;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class UserCustomServiceImpl
        extends ServiceImpl<UserMapper, UserBean>
        implements IService<UserBean>, UserDetailsService {

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

    private static final Logger logger = LoggerFactory.getLogger(UserCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.UserServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("UserService.addOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.UserServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("UserService.addOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.UserServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("UserService.deleteOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.UserServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("UserService.deleteOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.UserServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("UserService.updateOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.UserServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("UserService.updateOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.UserServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("UserService.findAll.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.UserServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("UserService.findAll.After:{}", joinPoint);
    }

}
