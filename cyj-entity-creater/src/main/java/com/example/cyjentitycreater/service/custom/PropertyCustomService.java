package com.example.cyjentitycreater.service.custom;

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
public class PropertyCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(PropertyCustomService.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("PropertyService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("PropertyService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("PropertyService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("PropertyService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("PropertyService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("PropertyService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("PropertyService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.PropertyService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("PropertyService.findAllAfter:{}", joinPoint);
    }

}
