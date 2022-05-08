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
public class BpmnCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(BpmnCustomAop.class);

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.BpmnService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("BpmnCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.BpmnService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("BpmnCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.BpmnService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("BpmnCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.BpmnService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("BpmnCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.BpmnService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("BpmnCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.BpmnService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("BpmnCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.BpmnService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("BpmnCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.BpmnService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("BpmnCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.BpmnService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("BpmnCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.BpmnService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("BpmnCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
