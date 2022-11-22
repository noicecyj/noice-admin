package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.TestDao;
import com.example.cyjcommon.dao.QuestionInstanceAnswerDao;
import com.example.cyjcommon.dao.TestPaperInstanceDao;
import com.example.cyjcommon.dao.TestInstanceDao;
import com.example.cyjcommon.entity.Test;
import com.example.cyjcommon.entity.QuestionInstanceAnswer;
import com.example.cyjcommon.entity.TestPaperInstance;
import com.example.cyjcommon.entity.TestInstance;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.service.autoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestInstanceService extends BaseService implements autoService<TestInstance> {

    private TestInstanceDao dao;
    private TestDao testDao;
    private QuestionInstanceAnswerDao questionInstanceAnswerDao;
    private TestPaperInstanceDao testPaperInstanceDao;

    @Autowired
    public void setDao(TestInstanceDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    @Autowired
    public void setQuestionInstanceAnswerDao(QuestionInstanceAnswerDao questionInstanceAnswerDao) {
        this.questionInstanceAnswerDao = questionInstanceAnswerDao;
    }

    @Autowired
    public void setTestPaperInstanceDao(TestPaperInstanceDao testPaperInstanceDao) {
        this.testPaperInstanceDao = testPaperInstanceDao;
    }

    @Override
    public TestInstance addOne(TestInstance po) {
        if (po.getTestId() != null) {
            Test test = testDao.getOne(po.getTestId());
            po.setTest(test);
        }
        if (po.getTestPaperInstanceId() != null) {
            TestPaperInstance testPaperInstance = testPaperInstanceDao.getOne(po.getTestPaperInstanceId());
            po.setTestPaperInstance(testPaperInstance);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(TestInstance po) {
        dao.delete(po);
    }

    @Override
    public TestInstance updateOne(TestInstance po) {
        if (po.getTestId() != null) {
            Test test = testDao.getOne(po.getTestId());
            po.setTest(test);
        }
        if (po.getTestPaperInstanceId() != null) {
            TestPaperInstance testPaperInstance = testPaperInstanceDao.getOne(po.getTestPaperInstanceId());
            po.setTestPaperInstance(testPaperInstance);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<TestInstance> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

    public Page<QuestionInstanceAnswer> pageQuestionInstanceAnswerByTestInstance(Integer pageNumber, String id) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
        TestInstance po = dao.getOne(id);
        QuestionInstanceAnswer questionInstanceAnswer = new QuestionInstanceAnswer();
        questionInstanceAnswer.setTestInstance(po);
        Example<QuestionInstanceAnswer> example = Example.of(questionInstanceAnswer);
        return questionInstanceAnswerDao.findAll(example, pageable);
    }

}