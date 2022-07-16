package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.SubjectDao;
import com.example.cyjcommon.dao.QuestionDao;
import com.example.cyjcommon.dao.QuestionBaseDao;
import com.example.cyjcommon.entity.Subject;
import com.example.cyjcommon.entity.Question;
import com.example.cyjcommon.entity.QuestionBase;
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
public class QuestionBaseService extends BaseService implements autoService<QuestionBase> {

    private QuestionBaseDao dao;
    private SubjectDao subjectDao;
    private QuestionDao questionDao;

    @Autowired
    public void setDao(QuestionBaseDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setSubjectDao(SubjectDao subjectDao) {
        this.subjectDao = subjectDao;
    }

    @Autowired
    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    @Override
    public QuestionBase addOne(QuestionBase po) {
        if (po.getSubjectId() != null) {
            Subject subject = subjectDao.getOne(po.getSubjectId());
            po.setSubject(subject);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(QuestionBase po) {
        dao.delete(po);
    }

    @Override
    public QuestionBase updateOne(QuestionBase po) {
        if (po.getSubjectId() != null) {
            Subject subject = subjectDao.getOne(po.getSubjectId());
            po.setSubject(subject);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<QuestionBase> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

    public Page<Question> pageQuestionByQuestionBase(Integer pageNumber, String id) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
        QuestionBase po = dao.getOne(id);
        Question question = new Question();
        question.setQuestionBase(po);
        Example<Question> example = Example.of(question);
        return questionDao.findAll(example, pageable);
    }

}
