package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.TestPaperDao;
import com.example.cyjcommon.dao.TestDao;
import com.example.cyjcommon.entity.TestPaper;
import com.example.cyjcommon.entity.Test;
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
public class TestService extends BaseService implements autoService<Test> {

    private TestDao dao;
    private TestPaperDao testPaperDao;

    @Autowired
    public void setDao(TestDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setTestPaperDao(TestPaperDao testPaperDao) {
        this.testPaperDao = testPaperDao;
    }

    @Override
    public Test addOne(Test po) {
        if (po.getTestPaperId() != null) {
            TestPaper testPaper = testPaperDao.getOne(po.getTestPaperId());
            po.setTestPaper(testPaper);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(Test po) {
        dao.delete(po);
    }

    @Override
    public Test updateOne(Test po) {
        if (po.getTestPaperId() != null) {
            TestPaper testPaper = testPaperDao.getOne(po.getTestPaperId());
            po.setTestPaper(testPaper);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Test> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
