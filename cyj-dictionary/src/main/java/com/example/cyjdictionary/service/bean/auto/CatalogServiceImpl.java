package com.example.cyjdictionary.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.CatalogBean;
import com.example.cyjcommon.mapper.bean.CatalogMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CatalogServiceImpl
        extends ServiceImpl<CatalogMapper, CatalogBean>
        implements IService<CatalogBean> {

    public CatalogBean addOne(CatalogBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(CatalogBean po) {
        po.deleteById();
    }

    public CatalogBean updateOne(CatalogBean po) {
        po.updateById();
        return po;
    }

    public Page<CatalogBean> findAll(CatalogBean po, Integer pageNumber, Integer pageSize) {
        Page<CatalogBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<CatalogBean> queryWrapper = searchHandler(po);
        return new CatalogBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<CatalogBean> searchHandler(CatalogBean po) {
        return new LambdaQueryWrapper<CatalogBean>()
                .like(StringUtils.isNotEmpty(po.getCatalogName()),
                        CatalogBean::getCatalogName, po.getCatalogName())
                .like(StringUtils.isNotEmpty(po.getCatalogCode()),
                        CatalogBean::getCatalogCode, po.getCatalogCode())
                .eq(CatalogBean::getStatus, po.getStatus())
                .orderByAsc(CatalogBean::getSortCode);
    }

}