package com.example.cyjdictionary.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.DictionaryBean;
import com.example.cyjcommon.mapper.bean.DictionaryMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DictionaryServiceImpl
        extends ServiceImpl<DictionaryMapper, DictionaryBean>
        implements IService<DictionaryBean> {

    public DictionaryBean addOne(DictionaryBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(DictionaryBean po) {
        po.deleteById();
    }

    public DictionaryBean updateOne(DictionaryBean po) {
        po.updateById();
        return po;
    }

    public Page<DictionaryBean> findAll(DictionaryBean po, Integer pageNumber, Integer pageSize) {
        Page<DictionaryBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<DictionaryBean> queryWrapper = searchHandler(po);
        return new DictionaryBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<DictionaryBean> searchHandler(DictionaryBean po) {
        return new LambdaQueryWrapper<DictionaryBean>()
                .eq(StringUtils.isNotEmpty(po.getCatalogId()),
                        DictionaryBean::getCatalogId, po.getCatalogId())
                .like(StringUtils.isNotEmpty(po.getDictionaryName()),
                        DictionaryBean::getDictionaryName, po.getDictionaryName())
                .orderByAsc(DictionaryBean::getSortCode);
    }

}