package com.example.cyjworkflow.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.FlowGroup;
import com.example.cyjworkflow.mapper.bean.FlowGroupMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FlowGroupServiceImpl
        extends ServiceImpl<FlowGroupMapper, FlowGroup>
        implements IService<FlowGroup> {

    public FlowGroup addOne(FlowGroup po) {
        po.insert();
        return po;
    }

    public void deleteOne(FlowGroup po) {
        po.deleteById();
    }

    public FlowGroup updateOne(FlowGroup po) {
        po.updateById();
        return po;
    }

    public Page<FlowGroup> findAll(FlowGroup po, Integer pageNumber, Integer pageSize) {
        Page<FlowGroup> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<FlowGroup> queryWrapper = searchHandler(po);
        return new FlowGroup().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<FlowGroup> searchHandler(FlowGroup po) {
        return new QueryWrapper<FlowGroup>().lambda()
                .like(StringUtils.isNotEmpty(po.getGroupName()), FlowGroup::getGroupName, po.getGroupName())
                .orderByAsc(FlowGroup::getSortCode);
    }

}
