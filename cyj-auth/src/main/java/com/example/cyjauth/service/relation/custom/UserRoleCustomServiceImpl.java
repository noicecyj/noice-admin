package com.example.cyjauth.service.relation.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.relation.UserRole;
import com.example.cyjcommon.mapper.relation.UserRoleMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class UserRoleCustomServiceImpl
        extends ServiceImpl<UserRoleMapper, UserRole>
        implements IService<UserRole> {

    private static final Logger logger = LoggerFactory.getLogger(UserRoleCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.getUserRole(..))")
    public void getUserRoleBefore(JoinPoint joinPoint) {
        logger.info("UserRoleService.getUserRole.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.getUserRole(..))")
    public void getUserRoleAfter(JoinPoint joinPoint) {
        logger.info("UserRoleService.getUserRole.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.setUserRole(..))")
    public void setUserRoleBefore(JoinPoint joinPoint) {
        logger.info("UserRoleService.setUserRole.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.setUserRole(..))")
    public void setUserRoleAfter(JoinPoint joinPoint) {
        logger.info("UserRoleService.setUserRole.After:{}", joinPoint);
    }

}
