package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.AppServiceBean;
import com.example.cyjcommon.mapper.bean.AppServiceMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AppServiceServiceImpl
        extends ServiceImpl<AppServiceMapper, AppServiceBean>
        implements IService<AppServiceBean> {

    public AppServiceBean addOne(AppServiceBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(AppServiceBean po) {
        po.deleteById();
    }

    public AppServiceBean updateOne(AppServiceBean po) {
        po.updateById();
        return po;
    }

    public Page<AppServiceBean> findAll(AppServiceBean po, Integer pageNumber, Integer pageSize) {
        Page<AppServiceBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<AppServiceBean> queryWrapper = searchHandler(po);
        return new AppServiceBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<AppServiceBean> searchHandler(AppServiceBean po) {
        return new LambdaQueryWrapper<AppServiceBean>()
                .like(StringUtils.isNotEmpty(po.getAppServiceName()),
                        AppServiceBean::getAppServiceName, po.getAppServiceName())
                .like(StringUtils.isNotEmpty(po.getAppServiceCode()),
                        AppServiceBean::getAppServiceCode, po.getAppServiceCode())
                .eq(AppServiceBean::getStatus, po.getStatus())
                .orderByAsc(AppServiceBean::getSortCode);
    }

}