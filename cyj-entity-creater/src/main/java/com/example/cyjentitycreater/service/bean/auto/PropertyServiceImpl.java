package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Persistent;
import com.example.cyjcommon.entity.bean.Property;
import com.example.cyjentitycreater.mapper.bean.PropertyMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PropertyServiceImpl
        extends ServiceImpl<PropertyMapper, Property>
        implements IService<Property> {

    public Property addOne(Property po) {
        po.insert();
        return po;
    }

    public void deleteOne(Property po) {
        po.deleteById();
    }

    public Property updateOne(Property po) {
        po.updateById();
        return po;
    }

    public Page<Property> findAll(Property po, Integer pageNumber, Integer pageSize) {
        Page<Property> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Property> queryWrapper = searchHandler(po);
        return new Property().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<Property> searchHandler(Property po) {
        return new QueryWrapper<Property>().lambda()
                .like(StringUtils.isNotEmpty(po.getPropertyCode()), Property::getPropertyCode, po.getPropertyCode())
                .orderByAsc(Property::getSortCode);
    }

    public Page<Property> pagePropertyByPersistent(Property po, Integer pageNumber, Integer pageSize, String persistentId) {
        Page<Property> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Property> queryWrapper = searchHandler(po);
        queryWrapper.eq(Property::getPersistentId, persistentId);
        return new Property().selectPage(page, queryWrapper);
    }
}
