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
public class TestPaperConfigCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(TestPaperConfigCustomService.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperConfigService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("TestPaperConfigService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperConfigService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("TestPaperConfigService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperConfigService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("TestPaperConfigService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperConfigService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("TestPaperConfigService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperConfigService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("TestPaperConfigService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperConfigService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("TestPaperConfigService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperConfigService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("TestPaperConfigService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperConfigService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("TestPaperConfigService.findAllAfter:{}", joinPoint);
    }

}
