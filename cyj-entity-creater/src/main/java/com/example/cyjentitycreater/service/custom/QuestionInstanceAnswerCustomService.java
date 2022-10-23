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
public class QuestionInstanceAnswerCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(QuestionInstanceAnswerCustomService.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceAnswerService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceAnswerService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceAnswerService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceAnswerService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceAnswerService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceAnswerService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceAnswerService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.QuestionInstanceAnswerService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.findAllAfter:{}", joinPoint);
    }

}
