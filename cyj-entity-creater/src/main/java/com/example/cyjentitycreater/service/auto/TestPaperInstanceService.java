package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.TestPaperDao;
import com.example.cyjcommon.dao.QuestionInstanceDao;
import com.example.cyjcommon.dao.TestPaperInstanceDao;
import com.example.cyjcommon.entity.TestPaper;
import com.example.cyjcommon.entity.QuestionInstance;
import com.example.cyjcommon.entity.TestPaperInstance;
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
public class TestPaperInstanceService extends BaseService implements autoService<TestPaperInstance> {

    private TestPaperInstanceDao dao;
    private TestPaperDao testPaperDao;
    private QuestionInstanceDao questionInstanceDao;

    @Autowired
    public void setDao(TestPaperInstanceDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setTestPaperDao(TestPaperDao testPaperDao) {
        this.testPaperDao = testPaperDao;
    }

    @Autowired
    public void setQuestionInstanceDao(QuestionInstanceDao questionInstanceDao) {
        this.questionInstanceDao = questionInstanceDao;
    }

    @Override
    public TestPaperInstance addOne(TestPaperInstance po) {
        if (po.getTestPaperId() != null) {
            TestPaper testPaper = testPaperDao.getOne(po.getTestPaperId());
            po.setTestPaper(testPaper);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(TestPaperInstance po) {
        dao.delete(po);
    }

    @Override
    public TestPaperInstance updateOne(TestPaperInstance po) {
        if (po.getTestPaperId() != null) {
            TestPaper testPaper = testPaperDao.getOne(po.getTestPaperId());
            po.setTestPaper(testPaper);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<TestPaperInstance> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

    public Page<QuestionInstance> pageQuestionInstanceByTestPaperInstance(Integer pageNumber, String id) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
        TestPaperInstance po = dao.getOne(id);
        QuestionInstance questionInstance = new QuestionInstance();
        questionInstance.setTestPaperInstance(po);
        Example<QuestionInstance> example = Example.of(questionInstance);
        return questionInstanceDao.findAll(example, pageable);
    }

}
