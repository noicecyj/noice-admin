package com.example.cyjentitycreater.service.custom;

import com.example.cyjcommon.dao.QuestionBaseDao;
import com.example.cyjcommon.dao.QuestionInstanceDao;
import com.example.cyjcommon.dao.TestPaperDao;
import com.example.cyjcommon.entity.QQuestion;
import com.example.cyjcommon.entity.QTestPaperConfig;
import com.example.cyjcommon.entity.Question;
import com.example.cyjcommon.entity.QuestionBase;
import com.example.cyjcommon.entity.QuestionInstance;
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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class TestPaperInstanceCustomService extends BaseService {

    private TestPaperDao testPaperDao;
    private QuestionBaseDao questionBaseDao;
    private QuestionInstanceDao questionInstanceDao;

    @Autowired
    public void setTestPaperDao(TestPaperDao testPaperDao) {
        this.testPaperDao = testPaperDao;
    }

    @Autowired
    public void setQuestionBaseDao(QuestionBaseDao questionBaseDao) {
        this.questionBaseDao = questionBaseDao;
    }

    @Autowired
    public void setQuestionInstanceDao(QuestionInstanceDao questionInstanceDao) {
        this.questionInstanceDao = questionInstanceDao;
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
            int testPaperScore = 0;
            int testQuestionIndex = 1;
            for (TestPaperConfig testPaperConfig : testPaperConfigList) {
                //获取试卷配置题目数量
                Integer testPaperConfigNumber = testPaperConfig.getTestPaperConfigNumber();
                //获取试卷配置题目分值
                Integer testPaperConfigScore = testPaperConfig.getTestPaperConfigScore();
                testPaperScore = testPaperScore + testPaperConfigNumber * testPaperConfigScore;
                Optional<QuestionBase> questionBaseOptional = questionBaseDao.findById(testPaperConfig.getQuestionBaseId());
                if (questionBaseOptional.isPresent()) {
                    QuestionBase questionBase = questionBaseOptional.get();
                    List<Question> questionList = queryFactory
                            .selectFrom(QQuestion.question)
                            .where(QQuestion.question.questionBaseId.eq(questionBase.getId()))
                            .fetch();
                    List<Question> questionLinkedList = new LinkedList<>(questionList);
                    for (int i = 0; i < testPaperConfigNumber; i++) {
                        Random random = new Random();
                        int n = random.nextInt(questionLinkedList.size());
                        Question question = questionLinkedList.get(n);
                        HashMap<String, Boolean> optionMap = new HashMap<>();
                        if (question.getQuestionOptionA() != null) {
                            optionMap.put(question.getQuestionOptionA(), "true".equals(question.getQuestionOptionAKey()));
                        }
                        if (question.getQuestionOptionB() != null) {
                            optionMap.put(question.getQuestionOptionB(), "true".equals(question.getQuestionOptionBKey()));
                        }
                        if (question.getQuestionOptionC() != null) {
                            optionMap.put(question.getQuestionOptionC(), "true".equals(question.getQuestionOptionCKey()));
                        }
                        if (question.getQuestionOptionD() != null) {
                            optionMap.put(question.getQuestionOptionD(), "true".equals(question.getQuestionOptionDKey()));
                        }
                        if (question.getQuestionOptionE() != null) {
                            optionMap.put(question.getQuestionOptionE(), "true".equals(question.getQuestionOptionEKey()));
                        }
                        if (question.getQuestionOptionF() != null) {
                            optionMap.put(question.getQuestionOptionF(), "true".equals(question.getQuestionOptionFKey()));
                        }
                        QuestionInstance questionInstance = new QuestionInstance();
                        int tip = 1;
                        StringBuilder answer = new StringBuilder();
                        for (String questionContent : optionMap.keySet()) {
                            if (tip == 1) {
                                questionInstance.setQuestionInstanceOptionA(questionContent);
                                if (optionMap.get(questionContent)) {
                                    answer.append("A");
                                }
                            }
                            if (tip == 2) {
                                questionInstance.setQuestionInstanceOptionB(questionContent);
                                if (optionMap.get(questionContent)) {
                                    answer.append("B");
                                }
                            }
                            if (tip == 3) {
                                questionInstance.setQuestionInstanceOptionC(questionContent);
                                if (optionMap.get(questionContent)) {
                                    answer.append("C");
                                }
                            }
                            if (tip == 4) {
                                questionInstance.setQuestionInstanceOptionD(questionContent);
                                if (optionMap.get(questionContent)) {
                                    answer.append("D");
                                }
                            }
                            if (tip == 5) {
                                questionInstance.setQuestionInstanceOptionE(questionContent);
                                if (optionMap.get(questionContent)) {
                                    answer.append("E");
                                }
                            }
                            if (tip == 6) {
                                questionInstance.setQuestionInstanceOptionF(questionContent);
                                if (optionMap.get(questionContent)) {
                                    answer.append("F");
                                }
                            }
                            tip++;
                        }
                        questionInstance.setQuestionInstanceContent(question.getQuestionName());
                        questionInstance.setQuestionInstanceIndex(String.valueOf(testQuestionIndex));
                        questionInstance.setQuestionInstanceAnswer(answer.toString());
                        questionInstance.setSortCode(String.valueOf(testQuestionIndex));
                        questionInstance.setStatus("有效");
                        questionInstance.setTestPaperInstance(testPaperInstance);
                        questionInstanceDao.save(questionInstance);
                        testQuestionIndex++;
                    }

                }
            }
            testPaper.setTestPaperScore(testPaperScore);
            testPaperDao.save(testPaper);
        }
    }

}
