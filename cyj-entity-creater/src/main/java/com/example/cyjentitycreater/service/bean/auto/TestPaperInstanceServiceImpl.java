package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.TestPaperInstance;
import com.example.cyjentitycreater.mapper.bean.TestPaperInstanceMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestPaperInstanceServiceImpl
        extends ServiceImpl<TestPaperInstanceMapper, TestPaperInstance>
        implements IService<TestPaperInstance> {

    public TestPaperInstance addOne(TestPaperInstance po) {
        po.insert();
        return po;
    }

    public void deleteOne(TestPaperInstance po) {
        po.deleteById();
    }

    public TestPaperInstance updateOne(TestPaperInstance po) {
        po.updateById();
        return po;
    }

    public Page<TestPaperInstance> findAll(TestPaperInstance po, Integer pageNumber, Integer pageSize) {
        Page<TestPaperInstance> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<TestPaperInstance> queryWrapper = searchHandler(po);
        return new TestPaperInstance().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<TestPaperInstance> searchHandler(TestPaperInstance po) {
        return new QueryWrapper<TestPaperInstance>().lambda()
                .like(StringUtils.isNotEmpty(po.getTestPaperInstanceName()),
                        TestPaperInstance::getTestPaperInstanceName, po.getTestPaperInstanceName())
                .orderByAsc(TestPaperInstance::getSortCode);
    }

    public Page<TestPaperInstance> pageTestPaperInstanceByTestPaper(TestPaperInstance po, Integer pageNumber, Integer pageSize, String testPaperId) {
        Page<TestPaperInstance> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<TestPaperInstance> queryWrapper = searchHandler(po);
        queryWrapper.eq(TestPaperInstance::getTestPaperId, testPaperId);
        return new TestPaperInstance().selectPage(page, queryWrapper);
    }

}
