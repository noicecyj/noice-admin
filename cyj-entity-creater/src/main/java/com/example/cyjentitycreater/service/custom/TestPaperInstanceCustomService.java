package com.example.cyjentitycreater.service.custom;

import com.alibaba.fastjson2.JSONObject;
import com.example.cyjcommon.dao.QuestionBaseDao;
import com.example.cyjcommon.dao.QuestionInstanceDao;
import com.example.cyjcommon.dao.TestPaperDao;
import com.example.cyjcommon.dao.TestPaperInstanceDao;
import com.example.cyjcommon.entity.QQuestion;
import com.example.cyjcommon.entity.QQuestionInstance;
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

import java.util.ArrayList;
import java.util.Collections;
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
    private TestPaperInstanceDao testPaperInstanceDao;
    private QuestionBaseDao questionBaseDao;
    private QuestionInstanceDao questionInstanceDao;

    @Autowired
    public void setTestPaperDao(TestPaperDao testPaperDao) {
        this.testPaperDao = testPaperDao;
    }

    @Autowired
    public void setTestPaperInstanceDao(TestPaperInstanceDao testPaperInstanceDao) {
        this.testPaperInstanceDao = testPaperInstanceDao;
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
        List<QuestionInstance> questionInstanceList = queryFactory
                .selectFrom(QQuestionInstance.questionInstance)
                .where(QQuestionInstance.questionInstance.testPaperInstanceId.eq(testPaperInstance.getId()))
                .fetch();
        if (!questionInstanceList.isEmpty()){
            return;
        }
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
                    Collections.shuffle(questionList);
                    List<Question> questionSelectList = questionList.subList(0, testPaperConfigNumber);
                    for (Question question : questionSelectList) {
                        List<JSONObject> optionList = new ArrayList<>();
                        if (question.getQuestionOptionA() != null) {
                            JSONObject optionA = new JSONObject();
                            optionA.put("optionContent", question.getQuestionOptionA());
                            optionA.put("optionCode", "true".equals(question.getQuestionOptionAKey()));
                            optionList.add(optionA);
                        }
                        if (question.getQuestionOptionB() != null) {
                            JSONObject optionB = new JSONObject();
                            optionB.put("optionContent", question.getQuestionOptionB());
                            optionB.put("optionCode", "true".equals(question.getQuestionOptionBKey()));
                            optionList.add(optionB);
                        }
                        if (question.getQuestionOptionC() != null) {
                            JSONObject optionC = new JSONObject();
                            optionC.put("optionContent", question.getQuestionOptionC());
                            optionC.put("optionCode", "true".equals(question.getQuestionOptionCKey()));
                            optionList.add(optionC);
                        }
                        if (question.getQuestionOptionD() != null) {
                            JSONObject optionD = new JSONObject();
                            optionD.put("optionContent", question.getQuestionOptionD());
                            optionD.put("optionCode", "true".equals(question.getQuestionOptionDKey()));
                            optionList.add(optionD);
                        }
                        if (question.getQuestionOptionE() != null) {
                            JSONObject optionE = new JSONObject();
                            optionE.put("optionContent", question.getQuestionOptionE());
                            optionE.put("optionCode", "true".equals(question.getQuestionOptionEKey()));
                            optionList.add(optionE);
                        }
                        if (question.getQuestionOptionF() != null) {
                            JSONObject optionF = new JSONObject();
                            optionF.put("optionContent", question.getQuestionOptionF());
                            optionF.put("optionCode", "true".equals(question.getQuestionOptionFKey()));
                            optionList.add(optionF);
                        }
                        QuestionInstance questionInstance = new QuestionInstance();
                        int tip = 1;
                        StringBuilder answer = new StringBuilder();
                        Collections.shuffle(optionList);
                        for (JSONObject option : optionList) {
                            if (tip == 1) {
                                questionInstance.setQuestionInstanceOptionA(option.getString("optionContent"));
                                if (option.getBoolean("optionCode") != null && option.getBoolean("optionCode")) {
                                    answer.append("A");
                                }
                            }
                            if (tip == 2) {
                                questionInstance.setQuestionInstanceOptionB(option.getString("optionContent"));
                                if (option.getBoolean("optionCode") != null && option.getBoolean("optionCode")) {
                                    answer.append("B");
                                }
                            }
                            if (tip == 3) {
                                questionInstance.setQuestionInstanceOptionC(option.getString("optionContent"));
                                if (option.getBoolean("optionCode") != null && option.getBoolean("optionCode")) {
                                    answer.append("C");
                                }
                            }
                            if (tip == 4) {
                                questionInstance.setQuestionInstanceOptionD(option.getString("optionContent"));
                                if (option.getBoolean("optionCode") != null && option.getBoolean("optionCode")) {
                                    answer.append("D");
                                }
                            }
                            if (tip == 5) {
                                questionInstance.setQuestionInstanceOptionE(option.getString("optionContent"));
                                if (option.getBoolean("optionCode") != null && option.getBoolean("optionCode")) {
                                    answer.append("E");
                                }
                            }
                            if (tip == 6) {
                                questionInstance.setQuestionInstanceOptionF(option.getString("optionContent"));
                                if (option.getBoolean("optionCode") != null && option.getBoolean("optionCode")) {
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
            testPaperInstance.setTestPaperInstanceScore(testPaperScore);
            testPaperInstanceDao.save(testPaperInstance);
            testPaper.setTestPaperScore(testPaperScore);
            testPaperDao.save(testPaper);
        }
    }

}
