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
public class FirstMenuCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(FirstMenuCustomAop.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.FirstMenuService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("FirstMenuCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.FirstMenuService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("FirstMenuCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.FirstMenuService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("FirstMenuCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.FirstMenuService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("FirstMenuCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.FirstMenuService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("FirstMenuCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.FirstMenuService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("FirstMenuCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.FirstMenuService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("FirstMenuCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.FirstMenuService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("FirstMenuCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.FirstMenuService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("FirstMenuCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.FirstMenuService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("FirstMenuCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
