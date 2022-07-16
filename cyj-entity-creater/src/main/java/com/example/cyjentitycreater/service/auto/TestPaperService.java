package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.TestPaperConfigDao;
import com.example.cyjcommon.dao.TestPaperInstanceDao;
import com.example.cyjcommon.dao.TestPaperDao;
import com.example.cyjcommon.entity.TestPaperConfig;
import com.example.cyjcommon.entity.TestPaperInstance;
import com.example.cyjcommon.entity.TestPaper;
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
public class TestPaperService extends BaseService implements autoService<TestPaper> {

    private TestPaperDao dao;
    private TestPaperConfigDao testPaperConfigDao;
    private TestPaperInstanceDao testPaperInstanceDao;

    @Autowired
    public void setDao(TestPaperDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setTestPaperConfigDao(TestPaperConfigDao testPaperConfigDao) {
        this.testPaperConfigDao = testPaperConfigDao;
    }

    @Autowired
    public void setTestPaperInstanceDao(TestPaperInstanceDao testPaperInstanceDao) {
        this.testPaperInstanceDao = testPaperInstanceDao;
    }

    @Override
    public TestPaper addOne(TestPaper po) {
        return dao.save(po);
    }

    @Override
    public void deleteOne(TestPaper po) {
        dao.delete(po);
    }

    @Override
    public TestPaper updateOne(TestPaper po) {
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<TestPaper> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

    public Page<TestPaperConfig> pageTestPaperConfigByTestPaper(Integer pageNumber, String id) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
        TestPaper po = dao.getOne(id);
        TestPaperConfig testPaperConfig = new TestPaperConfig();
        testPaperConfig.setTestPaper(po);
        Example<TestPaperConfig> example = Example.of(testPaperConfig);
        return testPaperConfigDao.findAll(example, pageable);
    }

    public Page<TestPaperInstance> pageTestPaperInstanceByTestPaper(Integer pageNumber, String id) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
        TestPaper po = dao.getOne(id);
        TestPaperInstance testPaperInstance = new TestPaperInstance();
        testPaperInstance.setTestPaper(po);
        Example<TestPaperInstance> example = Example.of(testPaperInstance);
        return testPaperInstanceDao.findAll(example, pageable);
    }

}
