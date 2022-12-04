package com.example.cyjauth.service.bean.custom;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Enterprise;
import com.example.cyjcommon.mapper.bean.EnterpriseMapper;
import com.example.cyjcommon.service.bean.EnterpriseService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.identity.Tenant;
import org.camunda.bpm.engine.rest.dto.identity.TenantDto;
import org.camunda.bpm.engine.rest.exception.InvalidRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.core.Response;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class EnterpriseCustomServiceImpl
        extends ServiceImpl<EnterpriseMapper, Enterprise>
        implements EnterpriseService {

    private IdentityService identityService;

    @Autowired
    public void setIdentityService(IdentityService identityService) {
        this.identityService = identityService;
    }

    private static final Logger logger = LoggerFactory.getLogger(EnterpriseCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Enterprise enterprise = (Enterprise) params[0];
        logger.info("EnterpriseService.addOneBefore.enterprise:{}", JSON.toJSONString(enterprise));
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Enterprise enterprise = (Enterprise) params[0];
        logger.info("EnterpriseService.addOneAfter.enterprise:{}", JSON.toJSONString(enterprise));
        if (identityService.isReadOnly()) {
            throw new InvalidRequestException(Response.Status.FORBIDDEN, "Identity service implementation is read-only.");
        } else {
            TenantDto tenantDto = new TenantDto();
            tenantDto.setId(enterprise.getEnterpriseName());
            tenantDto.setName(enterprise.getEnterpriseDescription());
            Tenant newTenant = identityService.newTenant(enterprise.getEnterpriseName());
            tenantDto.update(newTenant);
            identityService.saveTenant(newTenant);
        }
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Enterprise enterprise = (Enterprise) params[0];
        logger.info("EnterpriseService.deleteOneBefore.enterprise:{}", JSON.toJSONString(enterprise));
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Enterprise enterprise = (Enterprise) params[0];
        logger.info("EnterpriseService.deleteOneAfter.enterprise:{}", JSON.toJSONString(enterprise));
        if (identityService.isReadOnly()) {
            throw new InvalidRequestException(Response.Status.FORBIDDEN, "Identity service implementation is read-only.");
        } else {
            identityService.deleteTenant(enterprise.getEnterpriseName());
        }
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Enterprise enterprise = (Enterprise) params[0];
        logger.info("EnterpriseService.updateOneBefore.enterprise:{}", JSON.toJSONString(enterprise));
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Enterprise enterprise = (Enterprise) params[0];
        logger.info("EnterpriseService.updateOneAfter.enterprise:{}", JSON.toJSONString(enterprise));
        if (identityService.isReadOnly()) {
            throw new InvalidRequestException(Response.Status.FORBIDDEN, "Identity service implementation is read-only.");
        } else {
            TenantDto tenantDto = new TenantDto();
            tenantDto.setId(enterprise.getEnterpriseName());
            tenantDto.setName(enterprise.getEnterpriseDescription());
            Tenant newTenant = identityService.createTenantQuery().tenantId(enterprise.getEnterpriseName()).singleResult();
            tenantDto.update(newTenant);
            identityService.saveTenant(newTenant);
        }
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Integer pageNumber = (Integer) params[0];
        logger.info("EnterpriseService.findAllBefore.pageNumber:{}", pageNumber);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Integer pageNumber = (Integer) params[0];
        logger.info("EnterpriseService.findAllAfter.pageNumber:{}", pageNumber);
    }

}
