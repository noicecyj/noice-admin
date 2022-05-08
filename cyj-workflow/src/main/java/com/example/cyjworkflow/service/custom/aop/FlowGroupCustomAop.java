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
public class FlowGroupCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(FlowGroupCustomAop.class);

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
