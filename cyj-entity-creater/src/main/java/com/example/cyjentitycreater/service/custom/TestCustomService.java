package com.example.cyjentitycreater.service.custom;

import com.example.cyjcommon.entity.QQuestionInstance;
import com.example.cyjcommon.entity.QuestionInstance;
import com.example.cyjcommon.entity.Test;
import com.example.cyjcommon.service.BaseService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class TestCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(TestCustomService.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("TestService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("TestService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("TestService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("TestService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("TestService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("TestService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("TestService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("TestService.findAllAfter:{}", joinPoint);
    }

    public List<QuestionInstance> startTest(Test po) {
        return queryFactory
                .selectFrom(QQuestionInstance.questionInstance)
                .where(QQuestionInstance.questionInstance.testPaperInstanceId.eq(po.getTestPaperInstanceId()))
                .fetch();
    }
}
