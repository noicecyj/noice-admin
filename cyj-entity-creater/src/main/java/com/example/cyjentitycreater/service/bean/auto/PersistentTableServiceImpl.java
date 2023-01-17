package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PersistentTableBean;
import com.example.cyjcommon.mapper.bean.PersistentTableMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentTableServiceImpl
        extends ServiceImpl<PersistentTableMapper, PersistentTableBean>
        implements IService<PersistentTableBean> {

    public PersistentTableBean addOne(PersistentTableBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(PersistentTableBean po) {
        po.deleteById();
    }

    public PersistentTableBean updateOne(PersistentTableBean po) {
        po.updateById();
        return po;
    }

    public Page<PersistentTableBean> findAll(PersistentTableBean po, Integer pageNumber, Integer pageSize) {
        Page<PersistentTableBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentTableBean> queryWrapper = searchHandler(po);
        return new PersistentTableBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<PersistentTableBean> searchHandler(PersistentTableBean po) {
        return new LambdaQueryWrapper<PersistentTableBean>()
                .eq(StringUtils.isNotEmpty(po.getPersistentId()),
                        PersistentTableBean::getPersistentId, po.getPersistentId())
                .like(StringUtils.isNotEmpty(po.getPersistentTableName()),
                        PersistentTableBean::getPersistentTableName, po.getPersistentTableName())
                .eq(PersistentTableBean::getStatus, po.getStatus())
                .orderByAsc(PersistentTableBean::getSortCode);
    }

}