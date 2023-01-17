package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PropertyBean;
import com.example.cyjcommon.mapper.bean.PropertyMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PropertyServiceImpl
        extends ServiceImpl<PropertyMapper, PropertyBean>
        implements IService<PropertyBean> {

    public PropertyBean addOne(PropertyBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(PropertyBean po) {
        po.deleteById();
    }

    public PropertyBean updateOne(PropertyBean po) {
        po.updateById();
        return po;
    }

    public Page<PropertyBean> findAll(PropertyBean po, Integer pageNumber, Integer pageSize) {
        Page<PropertyBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PropertyBean> queryWrapper = searchHandler(po);
        return new PropertyBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<PropertyBean> searchHandler(PropertyBean po) {
        return new LambdaQueryWrapper<PropertyBean>()
                .eq(StringUtils.isNotEmpty(po.getPersistentId()),
                        PropertyBean::getPersistentId, po.getPersistentId())
                .like(StringUtils.isNotEmpty(po.getPropertyName()),
                        PropertyBean::getPropertyName, po.getPropertyName())
                .eq(PropertyBean::getStatus, po.getStatus())
                .orderByAsc(PropertyBean::getSortCode);
    }

}