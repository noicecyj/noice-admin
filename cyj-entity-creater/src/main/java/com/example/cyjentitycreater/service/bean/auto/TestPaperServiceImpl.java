package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.TestPaper;
import com.example.cyjcommon.mapper.bean.TestPaperMapper;
import com.example.cyjcommon.service.bean.TestPaperService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestPaperServiceImpl
        extends ServiceImpl<TestPaperMapper, TestPaper>
        implements TestPaperService {

    public TestPaper addOne(TestPaper po) {
        po.insert();
        return po;
    }

    public void deleteOne(TestPaper po) {
        po.deleteById();
    }

    public TestPaper updateOne(TestPaper po) {
        po.updateById();
        return po;
    }

    public Page<TestPaper> findAll(TestPaper po, Integer pageNumber, Integer pageSize) {
        Page<TestPaper> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<TestPaper> queryWrapper = searchHandler(po);
        return new TestPaper().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<TestPaper> searchHandler(TestPaper po) {
        return new QueryWrapper<TestPaper>().lambda()
                .like(StringUtils.isNotEmpty(po.getTestPaperName()),
                        TestPaper::getTestPaperName, po.getTestPaperName())
                .orderByAsc(TestPaper::getSortCode);
    }

//    public Page<TestPaperConfig> pageTestPaperConfigByTestPaper(Integer pageNumber, String id) {
//        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
//        TestPaper po = dao.getOne(id);
//        TestPaperConfig testPaperConfig = new TestPaperConfig();
//        testPaperConfig.setTestPaper(po);
//        Example<TestPaperConfig> example = Example.of(testPaperConfig);
//        return testPaperConfigMapper.findAll(example, pageable);
//    }
//
//    public Page<TestPaperInstance> pageTestPaperInstanceByTestPaper(Integer pageNumber, String id) {
//        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
//        TestPaper po = dao.getOne(id);
//        TestPaperInstance testPaperInstance = new TestPaperInstance();
//        testPaperInstance.setTestPaper(po);
//        Example<TestPaperInstance> example = Example.of(testPaperInstance);
//        return testPaperInstanceMapper.findAll(example, pageable);
//    }

}
