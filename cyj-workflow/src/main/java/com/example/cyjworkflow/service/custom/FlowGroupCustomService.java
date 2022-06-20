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
public class FlowGroupCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(FlowGroupCustomService.class);

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowGroupService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupService.findAllAfter:{}", joinPoint);
    }

}
