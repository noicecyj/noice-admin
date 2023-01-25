package com.example.cyjuser.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.EnterpriseBean;
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
        extends ServiceImpl<EnterpriseMapper, EnterpriseBean>
        implements IService<EnterpriseBean> {

    public EnterpriseBean addOne(EnterpriseBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(EnterpriseBean po) {
        po.deleteById();
    }

    public EnterpriseBean updateOne(EnterpriseBean po) {
        po.updateById();
        return po;
    }

    public Page<EnterpriseBean> findAll(EnterpriseBean po, Integer pageNumber, Integer pageSize) {
        Page<EnterpriseBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<EnterpriseBean> queryWrapper = searchHandler(po);
        return new EnterpriseBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<EnterpriseBean> searchHandler(EnterpriseBean po) {
        return new LambdaQueryWrapper<EnterpriseBean>()
                .like(StringUtils.isNotEmpty(po.getEnterpriseName()),
                        EnterpriseBean::getEnterpriseName, po.getEnterpriseName())
                .like(StringUtils.isNotEmpty(po.getEnterpriseCode()),
                        EnterpriseBean::getEnterpriseCode, po.getEnterpriseCode())
                .eq(EnterpriseBean::getStatus, po.getStatus())
                .orderByAsc(EnterpriseBean::getSortCode);
    }

}