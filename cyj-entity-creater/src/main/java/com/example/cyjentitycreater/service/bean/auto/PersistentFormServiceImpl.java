package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PersistentForm;
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
        extends ServiceImpl<PersistentFormMapper, PersistentForm>
        implements IService<PersistentForm> {

    public PersistentForm addOne(PersistentForm po) {
        po.insert();
        return po;
    }

    public void deleteOne(PersistentForm po) {
        po.deleteById();
    }

    public PersistentForm updateOne(PersistentForm po) {
        po.updateById();
        return po;
    }

    public Page<PersistentForm> findAll(PersistentForm po, Integer pageNumber, Integer pageSize) {
        Page<PersistentForm> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentForm> queryWrapper = searchHandler(po);
        return new PersistentForm().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<PersistentForm> searchHandler(PersistentForm po) {
        return new LambdaQueryWrapper<PersistentForm>()
                .like(StringUtils.isNotEmpty(po.getPersistentFormName()),
                        PersistentForm::getPersistentFormName, po.getPersistentFormName())
                .orderByAsc(PersistentForm::getSortCode);
    }

    public Page<PersistentForm> pagePersistentFormByPersistentId(PersistentForm po, Integer pageNumber, Integer pageSize, String persistentId) {
        Page<PersistentForm> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<PersistentForm> queryWrapper = searchHandler(po);
        queryWrapper.eq(PersistentForm::getPersistentId, persistentId);
        return new PersistentForm().selectPage(page, queryWrapper);
    }

}