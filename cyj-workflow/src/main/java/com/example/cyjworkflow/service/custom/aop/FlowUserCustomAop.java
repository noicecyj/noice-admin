package com.example.cyjworkflow.service.custom.aop;

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
public class FlowUserCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(FlowUserCustomAop.class);

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("FlowUserCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("FlowUserCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("FlowUserCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("FlowUserCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("FlowUserCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("FlowUserCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("FlowUserCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("FlowUserCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("FlowUserCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("FlowUserCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
