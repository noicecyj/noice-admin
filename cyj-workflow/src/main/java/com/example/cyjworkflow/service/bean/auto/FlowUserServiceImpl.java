package com.example.cyjworkflow.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.FlowUser;
import com.example.cyjworkflow.mapper.bean.FlowUserMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FlowUserServiceImpl
        extends ServiceImpl<FlowUserMapper, FlowUser>
        implements IService<FlowUser> {

    public FlowUser addOne(FlowUser po) {
        po.insert();
        return po;
    }

    public void deleteOne(FlowUser po) {
        po.deleteById();
    }

    public FlowUser updateOne(FlowUser po) {
        po.updateById();
        return po;
    }

    public Page<FlowUser> findAll(FlowUser po, Integer pageNumber, Integer pageSize) {
        Page<FlowUser> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<FlowUser> queryWrapper = searchHandler(po);
        return new FlowUser().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<FlowUser> searchHandler(FlowUser po) {
        return new QueryWrapper<FlowUser>().lambda()
                .like(StringUtils.isNotEmpty(po.getSecondName()), FlowUser::getSecondName, po.getSecondName())
                .orderByAsc(FlowUser::getSortCode);
    }

}
