package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.TestInstanceAnswerDao;
import com.example.cyjcommon.dao.TestPaperInstanceDao;
import com.example.cyjcommon.dao.TestInstanceDao;
import com.example.cyjcommon.entity.TestInstanceAnswer;
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
    private TestInstanceAnswerDao testInstanceAnswerDao;
    private TestPaperInstanceDao testPaperInstanceDao;

    @Autowired
    public void setDao(TestInstanceDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setTestInstanceAnswerDao(TestInstanceAnswerDao testInstanceAnswerDao) {
        this.testInstanceAnswerDao = testInstanceAnswerDao;
    }

    @Autowired
    public void setTestPaperInstanceDao(TestPaperInstanceDao testPaperInstanceDao) {
        this.testPaperInstanceDao = testPaperInstanceDao;
    }

    @Override
    public TestInstance addOne(TestInstance po) {
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

    public Page<TestInstanceAnswer> pageTestInstanceAnswerByTestInstance(Integer pageNumber, String id) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
        TestInstance po = dao.getOne(id);
        TestInstanceAnswer testInstanceAnswer = new TestInstanceAnswer();
        testInstanceAnswer.setTestInstance(po);
        Example<TestInstanceAnswer> example = Example.of(testInstanceAnswer);
        return testInstanceAnswerDao.findAll(example, pageable);
    }

}
