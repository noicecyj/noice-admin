package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Persistent;
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
        extends ServiceImpl<PersistentMapper, Persistent>
        implements IService<Persistent> {

    public Persistent addOne(Persistent po) {
        po.insert();
        return po;
    }

    public void deleteOne(Persistent po) {
        po.deleteById();
    }

    public Persistent updateOne(Persistent po) {
        po.updateById();
        return po;
    }

    public Page<Persistent> findAll(Persistent po, Integer pageNumber, Integer pageSize) {
        Page<Persistent> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Persistent> queryWrapper = searchHandler(po);
        return new Persistent().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<Persistent> searchHandler(Persistent po) {
        return new QueryWrapper<Persistent>().lambda()
                .like(StringUtils.isNotEmpty(po.getPersistentName()), Persistent::getPersistentName, po.getPersistentName())
                .orderByAsc(Persistent::getSortCode);
    }

    public Page<Persistent> pagePersistentByAppService(Persistent po, Integer pageNumber, Integer pageSize, String appServiceId) {
        Page<Persistent> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Persistent> queryWrapper = searchHandler(po);
        queryWrapper.eq(Persistent::getAppServiceId, appServiceId);
        return new Persistent().selectPage(page, queryWrapper);
    }

}
