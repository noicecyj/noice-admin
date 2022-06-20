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
public class FlowUserCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(FlowUserCustomService.class);

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("FlowUserService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("FlowUserService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("FlowUserService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("FlowUserService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("FlowUserService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("FlowUserService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("FlowUserService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.FlowUserService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("FlowUserService.findAllAfter:{}", joinPoint);
    }

}
