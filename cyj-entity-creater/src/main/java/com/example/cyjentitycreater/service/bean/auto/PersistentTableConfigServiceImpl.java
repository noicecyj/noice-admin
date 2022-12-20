package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PersistentTableConfig;
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
        extends ServiceImpl<PersistentTableConfigMapper, PersistentTableConfig>
        implements IService<PersistentTableConfig> {

    public PersistentTableConfig addOne(PersistentTableConfig po) {
        po.insert();
        return po;
    }

    public void deleteOne(PersistentTableConfig po) {
        po.deleteById();
    }

    public PersistentTableConfig updateOne(PersistentTableConfig po) {
        po.updateById();
        return po;
    }

    public Page<PersistentTableConfig> findAll(PersistentTableConfig po, Integer pageNumber, Integer pageSize) {
        Page<PersistentTableConfig> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentTableConfig> queryWrapper = searchHandler(po);
        return new PersistentTableConfig().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<PersistentTableConfig> searchHandler(PersistentTableConfig po) {
        return new LambdaQueryWrapper<PersistentTableConfig>()
                .eq(StringUtils.isNotEmpty(po.getPersistentTableId()),
                        PersistentTableConfig::getPersistentTableId, po.getPersistentTableId())
                .like(StringUtils.isNotEmpty(po.getPersistentTableConfigName()),
                        PersistentTableConfig::getPersistentTableConfigName, po.getPersistentTableConfigName())
                .orderByAsc(PersistentTableConfig::getSortCode);
    }

}