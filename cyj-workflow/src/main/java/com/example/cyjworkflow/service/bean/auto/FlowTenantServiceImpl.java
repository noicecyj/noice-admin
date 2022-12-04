package com.example.cyjworkflow.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.FlowTenant;
import com.example.cyjcommon.mapper.bean.FlowTenantMapper;
import com.example.cyjcommon.service.bean.FlowTenantService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FlowTenantServiceImpl
        extends ServiceImpl<FlowTenantMapper, FlowTenant>
        implements FlowTenantService {

    public FlowTenant addOne(FlowTenant po) {
        po.insert();
        return po;
    }

    public void deleteOne(FlowTenant po) {
        po.deleteById();
    }

    public FlowTenant updateOne(FlowTenant po) {
        po.updateById();
        return po;
    }

    public Page<FlowTenant> findAll(FlowTenant po, Integer pageNumber, Integer pageSize) {
        Page<FlowTenant> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<FlowTenant> queryWrapper = searchHandler(po);
        return new FlowTenant().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<FlowTenant> searchHandler(FlowTenant po) {
        return new QueryWrapper<FlowTenant>().lambda()
                .like(StringUtils.isNotEmpty(po.getTenantName()), FlowTenant::getTenantName, po.getTenantName())
                .orderByAsc(FlowTenant::getSortCode);
    }

}
