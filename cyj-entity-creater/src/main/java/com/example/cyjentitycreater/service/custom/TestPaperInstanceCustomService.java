package com.example.cyjentitycreater.service.custom;

import com.example.cyjcommon.dao.QuestionBaseDao;
import com.example.cyjcommon.dao.TestPaperDao;
import com.example.cyjcommon.entity.QTestPaperConfig;
import com.example.cyjcommon.entity.QuestionBase;
import com.example.cyjcommon.entity.TestPaper;
import com.example.cyjcommon.entity.TestPaperConfig;
import com.example.cyjcommon.entity.TestPaperInstance;
import com.example.cyjcommon.service.BaseService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class TestPaperInstanceCustomService extends BaseService {

    private TestPaperDao testPaperDao;

    private QuestionBaseDao questionBaseDao;

    @Autowired
    public void setTestPaperDao(TestPaperDao testPaperDao) {
        this.testPaperDao = testPaperDao;
    }

    @Autowired
    public void setQuestionBaseDao(QuestionBaseDao questionBaseDao) {
        this.questionBaseDao = questionBaseDao;
    }

    private static final Logger logger = LoggerFactory.getLogger(TestPaperInstanceCustomService.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperInstanceService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperInstanceService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperInstanceService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperInstanceService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperInstanceService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperInstanceService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperInstanceService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.TestPaperInstanceService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.findAllAfter:{}", joinPoint);
    }

    public void createTestPaperInstance(TestPaperInstance testPaperInstance) {
        if (testPaperInstance == null) {
            return;
        }
        testPaperInstance(testPaperInstance);
    }

    private void testPaperInstance(TestPaperInstance testPaperInstance) {
        logger.info("TestPaperInstanceService.testPaperInstance:{}", testPaperInstance);
        Optional<TestPaper> testPaperOptional = testPaperDao.findById(testPaperInstance.getTestPaperId());
        if (testPaperOptional.isPresent()) {
            TestPaper testPaper = testPaperOptional.get();
            List<TestPaperConfig> testPaperConfigList = queryFactory
                    .selectFrom(QTestPaperConfig.testPaperConfig)
                    .where(QTestPaperConfig.testPaperConfig.testPaperId.eq(testPaper.getId()))
                    .fetch();
            for (TestPaperConfig testPaperConfig : testPaperConfigList) {

                Optional<QuestionBase> questionBaseOptional = questionBaseDao.findById(testPaperConfig.getQuestionBaseId());
                if (questionBaseOptional.isPresent()) {
                    QuestionBase questionBase = questionBaseOptional.get();

                }
            }
        }
    }

}
