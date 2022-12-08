package com.example.cyjauth.service.relation.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.relation.RoleAuthority;
import com.example.cyjcommon.mapper.relation.RoleAuthorityMapper;
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
public class RoleAuthorityCustomServiceImpl
        extends ServiceImpl<RoleAuthorityMapper, RoleAuthority>
        implements IService<RoleAuthority> {

    private static final Logger logger = LoggerFactory.getLogger(RoleAuthorityCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.authorityByRole(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.authorityByRoleBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.authorityByRole(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.authorityByRoleAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.authoritySaveRole(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.authoritySaveRoleBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.authoritySaveRole(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.authoritySaveRoleAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.roleByAuthority(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.roleByAuthorityBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.roleByAuthority(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.roleByAuthorityAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.roleSaveAuthority(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.roleSaveAuthorityBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.roleSaveAuthority(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.roleSaveAuthorityAfter:{}", joinPoint);
    }

}
