package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.AppService;
import com.example.cyjentitycreater.mapper.bean.AppServiceMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AppServiceServiceImpl
        extends ServiceImpl<AppServiceMapper, AppService>
        implements IService<AppService> {

    public AppService addOne(AppService po) {
        po.insert();
        return po;
    }

    public void deleteOne(AppService po) {
        po.deleteById();
    }

    public AppService updateOne(AppService po) {
        po.updateById();
        return po;
    }

    public Page<AppService> findAll(AppService po, Integer pageNumber, Integer pageSize) {
        Page<AppService> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<AppService> queryWrapper = searchHandler(po);
        return new AppService().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<AppService> searchHandler(AppService po) {
        return new QueryWrapper<AppService>().lambda()
                .like(StringUtils.isNotEmpty(po.getAppServiceName()),
                        AppService::getAppServiceName, po.getAppServiceName())
                .orderByAsc(AppService::getSortCode);
    }

}
