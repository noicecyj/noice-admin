package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PersistentFormConfigBean;
import com.example.cyjcommon.mapper.bean.PersistentFormConfigMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentFormConfigServiceImpl
        extends ServiceImpl<PersistentFormConfigMapper, PersistentFormConfigBean>
        implements IService<PersistentFormConfigBean> {

    public PersistentFormConfigBean addOne(PersistentFormConfigBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(PersistentFormConfigBean po) {
        po.deleteById();
    }

    public PersistentFormConfigBean updateOne(PersistentFormConfigBean po) {
        po.updateById();
        return po;
    }

    public Page<PersistentFormConfigBean> findAll(PersistentFormConfigBean po, Integer pageNumber, Integer pageSize) {
        Page<PersistentFormConfigBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentFormConfigBean> queryWrapper = searchHandler(po);
        return new PersistentFormConfigBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<PersistentFormConfigBean> searchHandler(PersistentFormConfigBean po) {
        return new LambdaQueryWrapper<PersistentFormConfigBean>()
                .eq(StringUtils.isNotEmpty(po.getPersistentFormId()),
                        PersistentFormConfigBean::getPersistentFormId, po.getPersistentFormId())
                .like(StringUtils.isNotEmpty(po.getPersistentFormConfigName()),
                        PersistentFormConfigBean::getPersistentFormConfigName, po.getPersistentFormConfigName())
                .like(StringUtils.isNotEmpty(po.getPersistentFormConfigCode()),
                        PersistentFormConfigBean::getPersistentFormConfigCode, po.getPersistentFormConfigCode())
                .eq(PersistentFormConfigBean::getStatus, po.getStatus())
                .orderByAsc(PersistentFormConfigBean::getSortCode);
    }

}