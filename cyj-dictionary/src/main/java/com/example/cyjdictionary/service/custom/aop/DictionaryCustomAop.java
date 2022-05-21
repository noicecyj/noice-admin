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
public class DictionaryCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(DictionaryCustomAop.class);

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("DictionaryCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("DictionaryCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("DictionaryCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("DictionaryCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
