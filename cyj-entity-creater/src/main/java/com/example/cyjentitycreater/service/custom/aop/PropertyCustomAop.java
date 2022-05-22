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
 */
@Aspect
@Component
@Transactional(rollbackFor = Exception.class)
public class PropertyCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(PropertyCustomAop.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("EntityCustomAop.findAllAfter:{}", joinPoint);
    }

}
