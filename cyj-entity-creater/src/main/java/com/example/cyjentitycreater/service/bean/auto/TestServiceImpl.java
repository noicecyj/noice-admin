package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Test;
import com.example.cyjcommon.mapper.bean.TestMapper;
import com.example.cyjcommon.service.bean.TestService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl
        extends ServiceImpl<TestMapper, Test>
        implements TestService {

    public Test addOne(Test po) {
        po.insert();
        return po;
    }

    public void deleteOne(Test po) {
        po.deleteById();
    }

    public Test updateOne(Test po) {
        po.updateById();
        return po;
    }

    public Page<Test> findAll(Test po, Integer pageNumber, Integer pageSize) {
        Page<Test> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Test> queryWrapper = searchHandler(po);
        return new Test().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<Test> searchHandler(Test po) {
        return new QueryWrapper<Test>().lambda()
                .like(StringUtils.isNotEmpty(po.getTestName()),
                        Test::getTestName, po.getTestName())
                .orderByAsc(Test::getSortCode);
    }

}
