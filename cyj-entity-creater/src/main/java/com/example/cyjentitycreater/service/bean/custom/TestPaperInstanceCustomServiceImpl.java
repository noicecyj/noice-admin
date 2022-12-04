package com.example.cyjentitycreater.service.bean.custom;

import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Question;
import com.example.cyjcommon.entity.bean.QuestionBase;
import com.example.cyjcommon.entity.bean.QuestionInstance;
import com.example.cyjcommon.entity.bean.TestPaper;
import com.example.cyjcommon.entity.bean.TestPaperConfig;
import com.example.cyjcommon.entity.bean.TestPaperInstance;
import com.example.cyjentitycreater.mapper.bean.TestPaperInstanceMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class TestPaperInstanceCustomServiceImpl
        extends ServiceImpl<TestPaperInstanceMapper, TestPaperInstance>
        implements IService<TestPaperInstance> {

    private static final Logger logger = LoggerFactory.getLogger(TestPaperInstanceCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestPaperInstanceServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestPaperInstanceServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestPaperInstanceServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestPaperInstanceServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestPaperInstanceServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestPaperInstanceServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestPaperInstanceServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("TestPaperInstanceService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.TestPaperInstanceServiceImpl.findAll(..))")
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
        List<QuestionInstance> questionInstanceList = new QuestionInstance()
                .selectList(new QueryWrapper<QuestionInstance>().lambda()
                        .eq(QuestionInstance::getTestPaperInstanceId, testPaperInstance.getId()));
        if (!questionInstanceList.isEmpty()) {
            return;
        }
        TestPaper testPaper = new TestPaper().selectById(testPaperInstance.getTestPaperId());
        if (testPaper != null) {
            List<TestPaperConfig> testPaperConfigList = new TestPaperConfig()
                    .selectList(new QueryWrapper<TestPaperConfig>().lambda()
                            .eq(TestPaperConfig::getTestPaperId, testPaper.getId()));
            int testPaperScore = 0;
            int testQuestionIndex = 1;
            for (TestPaperConfig testPaperConfig : testPaperConfigList) {
                //获取试卷配置题目数量
                Integer testPaperConfigNumber = testPaperConfig.getTestPaperConfigNumber();
                //获取试卷配置题目分值
                Integer testPaperConfigScore = testPaperConfig.getTestPaperConfigScore();
                testPaperScore = testPaperScore + testPaperConfigNumber * testPaperConfigScore;
                QuestionBase questionBase = new QuestionBase().selectById(testPaperConfig.getQuestionBaseId());
                if (questionBase != null) {
                    List<Question> questionList = new Question()
                            .selectList(new QueryWrapper<Question>().lambda()
                                    .eq(Question::getQuestionBaseId, questionBase.getId()));
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
                        questionInstance.setQuestionInstanceType(question.getQuestionType());
                        questionInstance.setQuestionInstanceContent(question.getQuestionName());
                        questionInstance.setQuestionInstanceIndex(String.valueOf(testQuestionIndex));
                        questionInstance.setQuestionInstanceAnswer(answer.toString());
                        questionInstance.setSortCode(String.valueOf(testQuestionIndex));
                        questionInstance.setStatus("有效");
                        questionInstance.setTestPaperInstanceId(testPaperInstance.getId());
                        questionInstance.insert();
                        testQuestionIndex++;
                    }
                }
            }
            testPaperInstance.setTestPaperInstanceScore(testPaperScore);
            testPaperInstance.insert();
            testPaper.setTestPaperScore(testPaperScore);
            testPaper.insert();
        }
    }

}
