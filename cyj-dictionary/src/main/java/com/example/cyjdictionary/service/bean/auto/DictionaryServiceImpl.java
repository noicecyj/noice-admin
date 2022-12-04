package com.example.cyjdictionary.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Dictionary;
import com.example.cyjdictionary.mapper.bean.DictionaryMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DictionaryServiceImpl
        extends ServiceImpl<DictionaryMapper, Dictionary>
        implements IService<Dictionary> {

    public Dictionary addOne(Dictionary po) {
        po.insert();
        return po;
    }

    public void deleteOne(Dictionary po) {
        po.deleteById();
    }

    public Dictionary updateOne(Dictionary po) {
        po.updateById();
        return po;
    }

    public Page<Dictionary> findAll(Dictionary po, Integer pageNumber, Integer pageSize) {
        Page<Dictionary> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Dictionary> queryWrapper = searchHandler(po);
        return new Dictionary().selectPage(page, queryWrapper);
    }

    public Page<Dictionary> pageDictionaryByCatalog(Dictionary po, Integer pageNumber, Integer pageSize, String catalogId) {
        Page<Dictionary> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Dictionary> queryWrapper = searchHandler(po);
        queryWrapper.eq(Dictionary::getCatalogId, catalogId);
        return new Dictionary().selectPage(page, queryWrapper);
    }


    private LambdaQueryWrapper<Dictionary> searchHandler(Dictionary po) {
        return new QueryWrapper<Dictionary>().lambda()
                .like(StringUtils.isNotEmpty(po.getDictionaryName()),
                        Dictionary::getDictionaryName, po.getDictionaryName())
                .orderByAsc(Dictionary::getSortCode);
    }

}
