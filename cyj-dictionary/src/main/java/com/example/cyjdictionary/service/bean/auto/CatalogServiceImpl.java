package com.example.cyjdictionary.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Catalog;
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
        extends ServiceImpl<CatalogMapper, Catalog>
        implements IService<Catalog> {

    public Catalog addOne(Catalog po) {
        po.insert();
        return po;
    }

    public void deleteOne(Catalog po) {
        po.deleteById();
    }

    public Catalog updateOne(Catalog po) {
        po.updateById();
        return po;
    }

    public Page<Catalog> findAll(Catalog po, Integer pageNumber, Integer pageSize) {
        Page<Catalog> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Catalog> queryWrapper = searchHandler(po);
        return new Catalog().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<Catalog> searchHandler(Catalog po) {
        return new LambdaQueryWrapper<Catalog>()
                .like(StringUtils.isNotEmpty(po.getCatalogName()),
                        Catalog::getCatalogName, po.getCatalogName())
                .orderByAsc(Catalog::getSortCode);
    }

}