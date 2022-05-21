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
public class EnterpriseCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(EnterpriseCustomAop.class);

    @Before(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
