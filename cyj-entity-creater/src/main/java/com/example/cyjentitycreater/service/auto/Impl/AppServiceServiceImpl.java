package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.dao.AppServiceDao;
import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.QAppServicePO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.auto.AppServiceService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AppServiceServiceImpl extends BaseService implements AppServiceService {

    private AppServiceDao appServiceDao;

    @Autowired
    public void setAppServiceDao(AppServiceDao appServiceDao) {
        this.appServiceDao = appServiceDao;
    }

    @Override
    public AppServicePO addOne(AppServicePO po) {
        return appServiceDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        appServiceDao.deleteById(id);
    }

    @Override
    public AppServicePO updateOne(AppServicePO po) {
        return appServiceDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<AppServicePO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QAppServicePO.appServicePO)
                .where(QAppServicePO.appServicePO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QAppServicePO.appServicePO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public AppServicePO findOneById(String id) {
        return appServiceDao.findById(id).orElse(null);
    }

}
