package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PersistentBean;
import com.example.cyjcommon.mapper.bean.PersistentMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentServiceImpl
        extends ServiceImpl<PersistentMapper, PersistentBean>
        implements IService<PersistentBean> {

    public PersistentBean addOne(PersistentBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(PersistentBean po) {
        po.deleteById();
    }

    public PersistentBean updateOne(PersistentBean po) {
        po.updateById();
        return po;
    }

    public Page<PersistentBean> findAll(PersistentBean po, Integer pageNumber, Integer pageSize) {
        Page<PersistentBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentBean> queryWrapper = searchHandler(po);
        return new PersistentBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<PersistentBean> searchHandler(PersistentBean po) {
        return new LambdaQueryWrapper<PersistentBean>()
                .eq(StringUtils.isNotEmpty(po.getAppServiceId()),
                        PersistentBean::getAppServiceId, po.getAppServiceId())
                .like(StringUtils.isNotEmpty(po.getPersistentName()),
                        PersistentBean::getPersistentName, po.getPersistentName())
                .eq(PersistentBean::getStatus, po.getStatus())
                .orderByAsc(PersistentBean::getSortCode);
    }

}