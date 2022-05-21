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
public class AppServiceCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(AppServiceCustomAop.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.AppServiceService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("AppServiceCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.AppServiceService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("AppServiceCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.AppServiceService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("AppServiceCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.AppServiceService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("AppServiceCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.AppServiceService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("AppServiceCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.AppServiceService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("AppServiceCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.AppServiceService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("AppServiceCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.AppServiceService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("AppServiceCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.AppServiceService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("AppServiceCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.AppServiceService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("AppServiceCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
