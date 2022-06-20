package com.example.cyjdictionary.service.custom;

import com.example.cyjcommon.service.BaseService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class CatalogCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(CatalogCustomService.class);

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("CatalogService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("CatalogService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("CatalogService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("CatalogService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("CatalogService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("CatalogService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("CatalogService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.CatalogService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("CatalogService.findAllAfter:{}", joinPoint);
    }

}
