package com.example.cyjauth.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Enterprise;
import com.example.cyjcommon.mapper.bean.EnterpriseMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EnterpriseServiceImpl
        extends ServiceImpl<EnterpriseMapper, Enterprise>
        implements IService<Enterprise> {

    public Enterprise addOne(Enterprise po) {
        po.insert();
        return po;
    }

    public void deleteOne(Enterprise po) {
        po.deleteById();
    }

    public Enterprise updateOne(Enterprise po) {
        po.updateById();
        return po;
    }

    public Page<Enterprise> findAll(Enterprise po, Integer pageNumber, Integer pageSize) {
        Page<Enterprise> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Enterprise> queryWrapper = searchHandler(po);
        return new Enterprise().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<Enterprise> searchHandler(Enterprise po) {
        return new QueryWrapper<Enterprise>().lambda()
                .like(StringUtils.isNotEmpty(po.getEnterpriseName()),
                        Enterprise::getEnterpriseName, po.getEnterpriseName())
                .orderByAsc(Enterprise::getSortCode);
    }

}