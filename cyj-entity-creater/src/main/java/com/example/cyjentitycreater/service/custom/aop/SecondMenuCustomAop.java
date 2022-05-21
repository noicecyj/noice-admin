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
public class SecondMenuCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(SecondMenuCustomAop.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.findOneByIdAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.findListByPid(..))")
    public void findListByPidBefore(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.findListByPidBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.SecondMenuService.findListByPid(..))")
    public void findListByPidAfter(JoinPoint joinPoint) {
        logger.info("SecondMenuCustomAop.findListByPidAfter:{}", joinPoint);
    }

}
