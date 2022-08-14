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
public class TestInstanceAnswerCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(TestInstanceAnswerCustomService.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceAnswerService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("TestInstanceAnswerService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceAnswerService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("TestInstanceAnswerService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceAnswerService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("TestInstanceAnswerService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceAnswerService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("TestInstanceAnswerService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceAnswerService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("TestInstanceAnswerService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceAnswerService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("TestInstanceAnswerService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceAnswerService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("TestInstanceAnswerService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestInstanceAnswerService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("TestInstanceAnswerService.findAllAfter:{}", joinPoint);
    }

}
