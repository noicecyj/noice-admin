package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PersistentTableConfigBean;
import com.example.cyjcommon.mapper.bean.PersistentTableConfigMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentTableConfigServiceImpl
        extends ServiceImpl<PersistentTableConfigMapper, PersistentTableConfigBean>
        implements IService<PersistentTableConfigBean> {

    public PersistentTableConfigBean addOne(PersistentTableConfigBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(PersistentTableConfigBean po) {
        po.deleteById();
    }

    public PersistentTableConfigBean updateOne(PersistentTableConfigBean po) {
        po.updateById();
        return po;
    }

    public Page<PersistentTableConfigBean> findAll(PersistentTableConfigBean po, Integer pageNumber, Integer pageSize) {
        Page<PersistentTableConfigBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentTableConfigBean> queryWrapper = searchHandler(po);
        return new PersistentTableConfigBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<PersistentTableConfigBean> searchHandler(PersistentTableConfigBean po) {
        return new LambdaQueryWrapper<PersistentTableConfigBean>()
                .eq(StringUtils.isNotEmpty(po.getPersistentTableId()),
                        PersistentTableConfigBean::getPersistentTableId, po.getPersistentTableId())
                .like(StringUtils.isNotEmpty(po.getPersistentTableConfigName()),
                        PersistentTableConfigBean::getPersistentTableConfigName, po.getPersistentTableConfigName())
                .like(StringUtils.isNotEmpty(po.getPersistentTableConfigCode()),
                        PersistentTableConfigBean::getPersistentTableConfigCode, po.getPersistentTableConfigCode())
                .eq(PersistentTableConfigBean::getStatus, po.getStatus())
                .orderByAsc(PersistentTableConfigBean::getSortCode);
    }

}