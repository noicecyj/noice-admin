package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PersistentFormConfig;
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
        extends ServiceImpl<PersistentFormConfigMapper, PersistentFormConfig>
        implements IService<PersistentFormConfig> {

    public PersistentFormConfig addOne(PersistentFormConfig po) {
        po.insert();
        return po;
    }

    public void deleteOne(PersistentFormConfig po) {
        po.deleteById();
    }

    public PersistentFormConfig updateOne(PersistentFormConfig po) {
        po.updateById();
        return po;
    }

    public Page<PersistentFormConfig> findAll(PersistentFormConfig po, Integer pageNumber, Integer pageSize) {
        Page<PersistentFormConfig> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentFormConfig> queryWrapper = searchHandler(po);
        return new PersistentFormConfig().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<PersistentFormConfig> searchHandler(PersistentFormConfig po) {
        return new LambdaQueryWrapper<PersistentFormConfig>()
                .like(StringUtils.isNotEmpty(po.getPersistentFormConfigName()),
                        PersistentFormConfig::getPersistentFormConfigName, po.getPersistentFormConfigName())
                .orderByAsc(PersistentFormConfig::getSortCode);
    }

    public Page<PersistentFormConfig> pagePersistentFormConfigByPersistentFormId(PersistentFormConfig po, Integer pageNumber, Integer pageSize, String persistentFormId) {
        Page<PersistentFormConfig> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentFormConfig> queryWrapper = searchHandler(po);
        queryWrapper.eq(PersistentFormConfig::getPersistentFormId, persistentFormId);
        return new PersistentFormConfig().selectPage(page, queryWrapper);
    }

}