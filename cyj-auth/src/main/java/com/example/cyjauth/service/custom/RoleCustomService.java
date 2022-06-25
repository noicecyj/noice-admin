package com.example.cyjauth.service.custom;

import com.alibaba.fastjson2.JSON;
import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.entity.Role;
import com.example.cyjcommon.entity.User;
import com.example.cyjcommon.service.BaseService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.identity.Group;
import org.camunda.bpm.engine.rest.dto.identity.GroupDto;
import org.camunda.bpm.engine.rest.dto.identity.UserCredentialsDto;
import org.camunda.bpm.engine.rest.dto.identity.UserProfileDto;
import org.camunda.bpm.engine.rest.exception.InvalidRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.core.Response;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-02-07
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleCustomService extends BaseService {

    private IdentityService identityService;

    @Autowired
    public void setIdentityService(IdentityService identityService) {
        this.identityService = identityService;
    }

    private static final Logger logger = LoggerFactory.getLogger(RoleCustomService.class);

    @Before(value = "execution(* com.example.cyjauth.service.auto.RoleService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Role role = (Role) params[0];
        logger.info("RoleService.addOneBefore.role:{}", JSON.toJSONString(role));
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.RoleService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Role role = (Role) params[0];
        logger.info("RoleService.addOneAfter.role:{}", JSON.toJSONString(role));
        if (identityService.isReadOnly()) {
            throw new InvalidRequestException(Response.Status.FORBIDDEN, "Identity service implementation is read-only.");
        } else {
            GroupDto groupDto = new GroupDto();
            groupDto.setId(role.getRoleName());
            groupDto.setName(role.getRoleValue());
            Group newGroup = identityService.newGroup(role.getRoleName());
            groupDto.update(newGroup);
            identityService.saveGroup(newGroup);
        }
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.RoleService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Role role = (Role) params[0];
        logger.info("RoleService.deleteOneAfter.role:{}", JSON.toJSONString(role));
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.RoleService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Role role = (Role) params[0];
        logger.info("RoleService.deleteOneAfter.role:{}", JSON.toJSONString(role));
        if (identityService.isReadOnly()) {
            throw new InvalidRequestException(Response.Status.FORBIDDEN, "Identity service implementation is read-only.");
        } else {
            identityService.deleteGroup(role.getRoleName());
        }
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.RoleService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Role role = (Role) params[0];
        logger.info("RoleService.updateOneBefore.role:{}", JSON.toJSONString(role));
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.RoleService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Role role = (Role) params[0];
        logger.info("RoleService.updateOneAfter.role:{}", JSON.toJSONString(role));
        if (identityService.isReadOnly()) {
            throw new InvalidRequestException(Response.Status.FORBIDDEN, "Identity service implementation is read-only.");
        } else {
            GroupDto groupDto = new GroupDto();
            groupDto.setId(role.getRoleName());
            groupDto.setName(role.getRoleValue());
            Group newGroup = identityService.createGroupQuery().groupId(role.getRoleName()).singleResult();
            groupDto.update(newGroup);
            identityService.saveGroup(newGroup);
        }
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.RoleService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Integer pageNumber = (Integer) params[0];
        logger.info("RoleService.findAllBefore.pageNumber:{}", pageNumber);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.RoleService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        Object[] params = joinPoint.getArgs();
        Integer pageNumber = (Integer) params[0];
        logger.info("RoleService.findAllAfter.pageNumber:{}", pageNumber);
    }

}
