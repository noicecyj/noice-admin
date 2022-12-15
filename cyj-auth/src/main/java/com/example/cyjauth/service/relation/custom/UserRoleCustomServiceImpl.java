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

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.roleByUserId(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("UserRoleService.roleByUserIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.roleByUserId(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("UserRoleService.roleByUserIdAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.roleSaveUserId(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("UserRoleService.roleSaveUserBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.roleSaveUserId(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("UserRoleService.roleSaveUserIdAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.userByRoleId(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("UserRoleService.userByRoleIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.userByRoleId(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("UserRoleService.userByRoleIdAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.userSaveRoleId(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("UserRoleService.userSaveRoleIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.userSaveRoleId(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("UserRoleService.userSaveRoleIdAfter:{}", joinPoint);
    }

}
