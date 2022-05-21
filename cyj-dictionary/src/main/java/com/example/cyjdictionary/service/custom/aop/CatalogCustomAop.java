package com.example.cyjdictionary.service.custom.aop;

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
public class CatalogCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(CatalogCustomAop.class);

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("CatalogCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("CatalogCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("CatalogCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("CatalogCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("CatalogCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("CatalogCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("CatalogCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("CatalogCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("CatalogCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("CatalogCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
