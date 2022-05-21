package com.example.cyjquery.service.custom.aop;

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
public class SqlCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(SqlCustomAop.class);

    @Before(value = "execution(* com.example.cyjquery.service.auto.SqlService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("SqlCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.auto.SqlService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("SqlCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.auto.SqlService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("SqlCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.auto.SqlService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("SqlCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.auto.SqlService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("SqlCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.auto.SqlService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("SqlCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.auto.SqlService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("SqlCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.auto.SqlService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("SqlCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.auto.SqlService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("SqlCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.auto.SqlService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("SqlCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
