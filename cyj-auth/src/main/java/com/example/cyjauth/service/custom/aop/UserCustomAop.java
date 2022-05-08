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
 * @author 曹元杰
 * @version 1.0
 */
@Aspect
@Component
@Transactional(rollbackFor = Exception.class)
public class UserCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(UserCustomAop.class);

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("UserCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("UserCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("UserCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("UserCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("UserCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("UserCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("UserCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("UserCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.UserService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("UserCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.UserService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("UserCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
