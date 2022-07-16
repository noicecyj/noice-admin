package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.QuestionBaseDao;
import com.example.cyjcommon.dao.QuestionDao;
import com.example.cyjcommon.entity.QuestionBase;
import com.example.cyjcommon.entity.Question;
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
public class QuestionService extends BaseService implements autoService<Question> {

    private QuestionDao dao;
    private QuestionBaseDao questionBaseDao;

    @Autowired
    public void setDao(QuestionDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setQuestionBaseDao(QuestionBaseDao questionBaseDao) {
        this.questionBaseDao = questionBaseDao;
    }

    @Override
    public Question addOne(Question po) {
        if (po.getQuestionBaseId() != null) {
            QuestionBase questionBase = questionBaseDao.getOne(po.getQuestionBaseId());
            po.setQuestionBase(questionBase);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(Question po) {
        dao.delete(po);
    }

    @Override
    public Question updateOne(Question po) {
        if (po.getQuestionBaseId() != null) {
            QuestionBase questionBase = questionBaseDao.getOne(po.getQuestionBaseId());
            po.setQuestionBase(questionBase);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Question> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

}
