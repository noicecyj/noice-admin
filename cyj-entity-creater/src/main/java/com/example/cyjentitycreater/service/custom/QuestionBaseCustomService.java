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
public class QuestionBaseCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(QuestionBaseCustomService.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionBaseService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionBaseService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionBaseService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionBaseService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionBaseService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionBaseService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionBaseService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionBaseService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionBaseService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionBaseService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionBaseService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionBaseService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionBaseService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("QuestionBaseService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionBaseService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("QuestionBaseService.findAllAfter:{}", joinPoint);
    }

}
