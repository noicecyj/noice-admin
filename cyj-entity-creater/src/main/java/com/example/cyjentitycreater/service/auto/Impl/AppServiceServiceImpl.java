package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.dao.AppServiceDao;
import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.auto.AppServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
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
    public AppService addOne(AppService po) {
        return appServiceDao.save(po);
    }

    @Override
    public void deleteOne(AppService po) {
        appServiceDao.delete(po);
    }

    @Override
    public AppService updateOne(AppService po) {
        return appServiceDao.saveAndFlush(po);
    }

    @Override
    public Page<AppService> findAll(Integer pageNumber) {
        return appServiceDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
