package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.QuestionInstanceDao;
import com.example.cyjcommon.dao.TestInstanceDao;
import com.example.cyjcommon.dao.QuestionInstanceAnswerDao;
import com.example.cyjcommon.entity.QuestionInstance;
import com.example.cyjcommon.entity.TestInstance;
import com.example.cyjcommon.entity.QuestionInstanceAnswer;
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
public class QuestionInstanceAnswerService extends BaseService implements autoService<QuestionInstanceAnswer> {

    private QuestionInstanceAnswerDao dao;
    private QuestionInstanceDao questionInstanceDao;
    private TestInstanceDao testInstanceDao;

    @Autowired
    public void setDao(QuestionInstanceAnswerDao dao) {
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
    public QuestionInstanceAnswer addOne(QuestionInstanceAnswer po) {
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
    public void deleteOne(QuestionInstanceAnswer po) {
        dao.delete(po);
    }

    @Override
    public QuestionInstanceAnswer updateOne(QuestionInstanceAnswer po) {
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
    public Page<QuestionInstanceAnswer> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

}
