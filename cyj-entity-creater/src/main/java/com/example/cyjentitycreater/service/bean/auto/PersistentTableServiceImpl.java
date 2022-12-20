package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PersistentTable;
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
        extends ServiceImpl<PersistentTableMapper, PersistentTable>
        implements IService<PersistentTable> {

    public PersistentTable addOne(PersistentTable po) {
        po.insert();
        return po;
    }

    public void deleteOne(PersistentTable po) {
        po.deleteById();
    }

    public PersistentTable updateOne(PersistentTable po) {
        po.updateById();
        return po;
    }

    public Page<PersistentTable> findAll(PersistentTable po, Integer pageNumber, Integer pageSize) {
        Page<PersistentTable> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentTable> queryWrapper = searchHandler(po);
        return new PersistentTable().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<PersistentTable> searchHandler(PersistentTable po) {
        return new LambdaQueryWrapper<PersistentTable>()
                .eq(StringUtils.isNotEmpty(po.getPersistentId()),
                        PersistentTable::getPersistentId, po.getPersistentId())
                .like(StringUtils.isNotEmpty(po.getPersistentTableName()),
                        PersistentTable::getPersistentTableName, po.getPersistentTableName())
                .orderByAsc(PersistentTable::getSortCode);
    }

}