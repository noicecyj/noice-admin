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
public class TestInstanceCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(TestInstanceCustomService.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("TestInstanceService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("TestInstanceService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("TestInstanceService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("TestInstanceService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("TestInstanceService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("TestInstanceService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("TestInstanceService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("TestInstanceService.findAllAfter:{}", joinPoint);
    }

}
