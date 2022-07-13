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
public class QuestionInstanceCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(QuestionInstanceCustomService.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceService.findAllAfter:{}", joinPoint);
    }

}
