package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.TestPaperConfig;
import com.example.cyjcommon.mapper.bean.TestPaperConfigMapper;
import com.example.cyjcommon.service.bean.TestPaperConfigService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestPaperConfigServiceImpl
        extends ServiceImpl<TestPaperConfigMapper, TestPaperConfig>
        implements TestPaperConfigService {

    public TestPaperConfig addOne(TestPaperConfig po) {
        po.insert();
        return po;
    }

    public void deleteOne(TestPaperConfig po) {
        po.deleteById();
    }

    public TestPaperConfig updateOne(TestPaperConfig po) {
        po.updateById();
        return po;
    }

    public Page<TestPaperConfig> findAll(TestPaperConfig po, Integer pageNumber, Integer pageSize) {
        Page<TestPaperConfig> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<TestPaperConfig> queryWrapper = searchHandler(po);
        return new TestPaperConfig().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<TestPaperConfig> searchHandler(TestPaperConfig po) {
        return new QueryWrapper<TestPaperConfig>().lambda()
                .like(StringUtils.isNotEmpty(po.getTestPaperConfigType()),
                        TestPaperConfig::getTestPaperConfigType, po.getTestPaperConfigType())
                .orderByAsc(TestPaperConfig::getSortCode);
    }

    public Page<TestPaperConfig> pageTestPaperConfigByTestPaper(TestPaperConfig po, Integer pageNumber, Integer pageSize, String testPaperId) {
        Page<TestPaperConfig> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<TestPaperConfig> queryWrapper = searchHandler(po);
        queryWrapper.eq(TestPaperConfig::getTestPaperId, testPaperId);
        return new TestPaperConfig().selectPage(page, queryWrapper);
    }

}
