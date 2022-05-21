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
 * @author Noice
 * @version 1.0
 */
@Aspect
@Component
@Transactional(rollbackFor = Exception.class)
public class EntityCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(EntityCustomAop.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("EntityNameCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("EntityNameCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("EntityNameCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("EntityNameCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("EntityNameCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("EntityNameCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("EntityNameCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.EntityService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("EntityNameCustomAop.findAllAfter:{}", joinPoint);
    }

}
