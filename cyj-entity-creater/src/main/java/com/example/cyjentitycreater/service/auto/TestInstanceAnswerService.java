package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.QuestionInstanceDao;
import com.example.cyjcommon.dao.TestInstanceDao;
import com.example.cyjcommon.dao.TestInstanceAnswerDao;
import com.example.cyjcommon.entity.QuestionInstance;
import com.example.cyjcommon.entity.TestInstance;
import com.example.cyjcommon.entity.TestInstanceAnswer;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.service.autoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestInstanceAnswerService extends BaseService implements autoService<TestInstanceAnswer> {

    private TestInstanceAnswerDao dao;
    private QuestionInstanceDao questionInstanceDao;
    private TestInstanceDao testInstanceDao;

    @Autowired
    public void setDao(TestInstanceAnswerDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setQuestionInstanceDao(QuestionInstanceDao questionInstanceDao) {
        this.questionInstanceDao = questionInstanceDao;
    }

    @Autowired
    public void setTestInstanceDao(TestInstanceDao testInstanceDao) {
        this.testInstanceDao = testInstanceDao;
    }

    @Override
    public TestInstanceAnswer addOne(TestInstanceAnswer po) {
        if (po.getQuestionInstanceId() != null) {
            QuestionInstance questionInstance = questionInstanceDao.getOne(po.getQuestionInstanceId());
            po.setQuestionInstance(questionInstance);
        }
        if (po.getTestInstanceId() != null) {
            TestInstance testInstance = testInstanceDao.getOne(po.getTestInstanceId());
            po.setTestInstance(testInstance);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(TestInstanceAnswer po) {
        dao.delete(po);
    }

    @Override
    public TestInstanceAnswer updateOne(TestInstanceAnswer po) {
        if (po.getQuestionInstanceId() != null) {
            QuestionInstance questionInstance = questionInstanceDao.getOne(po.getQuestionInstanceId());
            po.setQuestionInstance(questionInstance);
        }
        if (po.getTestInstanceId() != null) {
            TestInstance testInstance = testInstanceDao.getOne(po.getTestInstanceId());
            po.setTestInstance(testInstance);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<TestInstanceAnswer> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

}
