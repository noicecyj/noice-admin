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

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.authorityByRoleId(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.authorityByRoleIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.authorityByRoleId(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.authorityByRoleIdAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.authoritySaveRoleId(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.authoritySaveIdRoleBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.authoritySaveRoleId(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.authoritySaveIdRoleAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.roleByAuthorityId(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.roleByAuthorityIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.roleByAuthorityId(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.roleByAuthorityIdAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.roleSaveAuthorityId(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.roleSaveAuthorityIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.roleSaveAuthorityId(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.roleSaveAuthorityIdAfter:{}", joinPoint);
    }

}
