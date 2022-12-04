package com.example.cyjentitycreater.service.bean.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.QuestionInstanceAnswer;
import com.example.cyjentitycreater.mapper.bean.QuestionInstanceAnswerMapper;
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
public class QuestionInstanceAnswerCustomServiceImpl
        extends ServiceImpl<QuestionInstanceAnswerMapper, QuestionInstanceAnswer>
        implements IService<QuestionInstanceAnswer> {

    private static final Logger logger = LoggerFactory.getLogger(QuestionInstanceAnswerCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.QuestionInstanceAnswerServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.QuestionInstanceAnswerServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.QuestionInstanceAnswerServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.QuestionInstanceAnswerServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.QuestionInstanceAnswerServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.QuestionInstanceAnswerServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.QuestionInstanceAnswerServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.QuestionInstanceAnswerServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("QuestionInstanceAnswerService.findAllAfter:{}", joinPoint);
    }

}
