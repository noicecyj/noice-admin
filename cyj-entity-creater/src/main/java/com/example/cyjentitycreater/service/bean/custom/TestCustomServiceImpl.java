package com.example.cyjentitycreater.service.bean.custom;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.QuestionInstance;
import com.example.cyjcommon.entity.bean.QuestionInstanceAnswer;
import com.example.cyjcommon.entity.bean.Test;
import com.example.cyjcommon.entity.bean.TestInstance;
import com.example.cyjcommon.entity.bean.TestPaperInstance;
import com.example.cyjentitycreater.entity.dto.TestCustomDTO;
import com.example.cyjentitycreater.mapper.bean.TestMapper;
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
public class TestCustomServiceImpl
        extends ServiceImpl<TestMapper, Test>
        implements IService<Test> {

    private static final Logger logger = LoggerFactory.getLogger(TestCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("TestService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("TestService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("TestService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("TestService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("TestService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("TestService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("TestService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("TestService.findAllAfter:{}", joinPoint);
    }

    public TestCustomDTO startTest(Test po) {
        TestCustomDTO testCustomDTO = new TestCustomDTO();
        TestInstance testInstance = new TestInstance().selectOne(new QueryWrapper<TestInstance>().lambda()
                .eq(TestInstance::getTestId, po.getId()));
        testCustomDTO.setTestInstance(testInstance);
        TestPaperInstance testPaperInstance = new TestPaperInstance().selectById(po.getTestPaperInstanceId());
        testCustomDTO.setTestPaperInstance(testPaperInstance);
        List<QuestionInstance> questionInstanceList = new QuestionInstance()
                .selectList(new QueryWrapper<QuestionInstance>().lambda()
                        .eq(QuestionInstance::getTestPaperInstanceId, po.getTestPaperInstanceId()));
        testCustomDTO.setQuestionInstanceList(questionInstanceList);
        List<QuestionInstanceAnswer> questionInstanceAnswerList = new QuestionInstanceAnswer()
                .selectList(new QueryWrapper<QuestionInstanceAnswer>().lambda()
                        .eq(QuestionInstanceAnswer::getQuestionInstanceId, po.getTestPaperInstanceId()));
        testCustomDTO.setQuestionInstanceAnswerList(questionInstanceAnswerList);
        return testCustomDTO;
    }
}
