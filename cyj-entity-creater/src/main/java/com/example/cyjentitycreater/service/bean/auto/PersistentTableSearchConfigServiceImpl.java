package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PersistentTableSearchConfigBean;
import com.example.cyjcommon.mapper.bean.PersistentTableSearchConfigMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentTableSearchConfigServiceImpl
        extends ServiceImpl<PersistentTableSearchConfigMapper, PersistentTableSearchConfigBean>
        implements IService<PersistentTableSearchConfigBean> {

    public PersistentTableSearchConfigBean addOne(PersistentTableSearchConfigBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(PersistentTableSearchConfigBean po) {
        po.deleteById();
    }

    public PersistentTableSearchConfigBean updateOne(PersistentTableSearchConfigBean po) {
        po.updateById();
        return po;
    }

    public Page<PersistentTableSearchConfigBean> findAll(PersistentTableSearchConfigBean po, Integer pageNumber, Integer pageSize) {
        Page<PersistentTableSearchConfigBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentTableSearchConfigBean> queryWrapper = searchHandler(po);
        return new PersistentTableSearchConfigBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<PersistentTableSearchConfigBean> searchHandler(PersistentTableSearchConfigBean po) {
        return new LambdaQueryWrapper<PersistentTableSearchConfigBean>()
                .eq(StringUtils.isNotEmpty(po.getPersistentTableId()),
                        PersistentTableSearchConfigBean::getPersistentTableId, po.getPersistentTableId())
                .like(StringUtils.isNotEmpty(po.getPersistentTableSearchConfigName()),
                        PersistentTableSearchConfigBean::getPersistentTableSearchConfigName, po.getPersistentTableSearchConfigName())
                .orderByAsc(PersistentTableSearchConfigBean::getSortCode);
    }

}