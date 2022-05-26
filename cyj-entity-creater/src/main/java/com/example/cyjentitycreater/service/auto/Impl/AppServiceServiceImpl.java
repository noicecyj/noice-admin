package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.dao.EntityDao;
import com.example.cyjcommon.dao.AppServiceDao;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.auto.EntityService;
import com.example.cyjentitycreater.service.auto.AppServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AppServiceServiceImpl extends BaseService implements AppServiceService {

    private AppServiceDao appServiceDao;
    private EntityDao entityDao;
    private EntityService entityService;

    @Autowired
    public void setAppServiceDao(AppServiceDao appServiceDao) {
        this.appServiceDao = appServiceDao;
    }

    @Autowired
    public void setEntityDao(EntityDao entityDao) {
        this.entityDao = entityDao;
    }

    @Autowired
    public void setEntityService(EntityService entityService) {
        this.entityService = entityService;
    }

    @Override
    public AppServicePO addOne(AppServicePO po) {
        return appServiceDao.save(po);
    }

    @Override
    public void deleteOne(AppServicePO po) {
        List<EntityPO> entityPOList = entityDao.findByAppServiceOrderBySortCode(po);
        for (EntityPO entityPO : entityPOList) {
            entityService.deleteOne(entityPO);
        }
        appServiceDao.delete(po);
    }

    @Override
    public AppServicePO updateOne(AppServicePO po) {
        return appServiceDao.saveAndFlush(po);
    }

    @Override
    public Page<AppServicePO> findAll(Integer pageNumber) {
        return appServiceDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
