package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PersistentFormBean;
import com.example.cyjcommon.mapper.bean.PersistentFormMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentFormServiceImpl
        extends ServiceImpl<PersistentFormMapper, PersistentFormBean>
        implements IService<PersistentFormBean> {

    public PersistentFormBean addOne(PersistentFormBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(PersistentFormBean po) {
        po.deleteById();
    }

    public PersistentFormBean updateOne(PersistentFormBean po) {
        po.updateById();
        return po;
    }

    public Page<PersistentFormBean> findAll(PersistentFormBean po, Integer pageNumber, Integer pageSize) {
        Page<PersistentFormBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentFormBean> queryWrapper = searchHandler(po);
        return new PersistentFormBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<PersistentFormBean> searchHandler(PersistentFormBean po) {
        return new LambdaQueryWrapper<PersistentFormBean>()
                .eq(StringUtils.isNotEmpty(po.getPersistentId()),
                        PersistentFormBean::getPersistentId, po.getPersistentId())
                .like(StringUtils.isNotEmpty(po.getPersistentFormName()),
                        PersistentFormBean::getPersistentFormName, po.getPersistentFormName())
                .eq(PersistentFormBean::getStatus, po.getStatus())
                .orderByAsc(PersistentFormBean::getSortCode);
    }

}