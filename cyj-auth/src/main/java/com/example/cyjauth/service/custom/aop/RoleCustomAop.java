package com.example.cyjauth.service.custom.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 * @version 1.0
 */
@Aspect
@Component
@Transactional(rollbackFor = Exception.class)
public class RoleCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(RoleCustomAop.class);

    @Before(value = "execution(* com.example.cyjauth.service.auto.RoleService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("RoleCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.RoleService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("RoleCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.RoleService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("RoleCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.RoleService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("RoleCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.RoleService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("RoleCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.RoleService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("RoleCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.RoleService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("RoleCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.RoleService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("RoleCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.RoleService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("RoleCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.RoleService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("RoleCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
