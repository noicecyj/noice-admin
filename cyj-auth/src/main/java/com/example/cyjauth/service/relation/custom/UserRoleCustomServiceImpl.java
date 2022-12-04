package com.example.cyjauth.service.relation.custom;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.relation.UserRole;
import com.example.cyjcommon.mapper.relation.UserRoleMapper;
import com.example.cyjcommon.service.relation.UserRoleService;
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
        implements UserRoleService {

    private static final Logger logger = LoggerFactory.getLogger(UserRoleCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.roleByUser(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("UserRoleService.roleByUserBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.roleByUser(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("UserRoleService.roleByUserAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.roleSaveUser(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("UserRoleService.roleSaveUserBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.roleSaveUser(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("UserRoleService.roleSaveUserAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.userByRole(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("UserRoleService.userByRoleBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.userByRole(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("UserRoleService.userByRoleAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.userSaveRole(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("UserRoleService.userSaveRoleBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.UserRoleServiceImpl.userSaveRole(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("UserRoleService.userSaveRoleAfter:{}", joinPoint);
    }

}
