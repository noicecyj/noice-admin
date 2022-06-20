package com.example.cyjworkflow.service.custom;

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
public class FlowTenantCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(FlowTenantCustomService.class);

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("FlowTenantService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("FlowTenantService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("FlowTenantService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("FlowTenantService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("FlowTenantService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("FlowTenantService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("FlowTenantService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowTenantService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("FlowTenantService.findAllAfter:{}", joinPoint);
    }

}
