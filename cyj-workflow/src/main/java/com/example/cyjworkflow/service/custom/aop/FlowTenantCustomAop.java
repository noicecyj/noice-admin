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
 * @author Noice
 * @version 1.0
 */
@Aspect
@Component
@Transactional(rollbackFor = Exception.class)
public class FlowTenantCustomAop {

    private static final Logger logger = LoggerFactory.getLogger(FlowTenantCustomAop.class);

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("FlowTenantCustomAop.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("FlowTenantCustomAop.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("FlowTenantCustomAop.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("FlowTenantCustomAop.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("FlowTenantCustomAop.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("FlowTenantCustomAop.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("FlowTenantCustomAop.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("FlowTenantCustomAop.findAllAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.findOneById(..))")
    public void findOneByIdBefore(JoinPoint joinPoint) {
        logger.info("FlowTenantCustomAop.findOneByIdBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.findOneById(..))")
    public void findOneByIdAfter(JoinPoint joinPoint) {
        logger.info("FlowTenantCustomAop.findOneByIdAfter:{}", joinPoint);
    }

}
