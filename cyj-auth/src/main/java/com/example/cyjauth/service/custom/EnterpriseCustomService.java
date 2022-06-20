package com.example.cyjauth.service.custom;

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
 * @version 1.0
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class EnterpriseCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(EnterpriseCustomService.class);

    @Before(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.EnterpriseService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseService.findAllAfter:{}", joinPoint);
    }

}
