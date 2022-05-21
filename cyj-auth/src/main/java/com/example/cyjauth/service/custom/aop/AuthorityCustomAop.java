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
public class AuthorityCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(AuthorityCustomAop.class);

    @Before(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("AuthorityCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("AuthorityCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("AuthorityCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("AuthorityCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
