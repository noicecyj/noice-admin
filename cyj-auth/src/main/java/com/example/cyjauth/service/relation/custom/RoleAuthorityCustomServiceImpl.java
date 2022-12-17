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

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.getRoleAuthority(..))")
    public void getRoleAuthorityBefore(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.getRoleAuthority.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.getRoleAuthority(..))")
    public void getRoleAuthorityAfter(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.getRoleAuthority.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.setRoleAuthority(..))")
    public void setRoleAuthorityBefore(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.setRoleAuthority.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl.setRoleAuthority(..))")
    public void setRoleAuthorityAfter(JoinPoint joinPoint) {
        logger.info("RoleAuthorityService.setRoleAuthority.After:{}", joinPoint);
    }

}
