package com.example.cyjentitycreater.service.custom.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Aspect
@Component
@Transactional(rollbackFor = Exception.class)
public class EntityCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(EntityCustomAop.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.findOneByIdAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.findListByPid(..))")
    public void findListByPidBefore(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.findListByPidBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.findListByPid(..))")
    public void findListByPidAfter(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.findListByPidAfter:{}", joinPoint);
    }

}
