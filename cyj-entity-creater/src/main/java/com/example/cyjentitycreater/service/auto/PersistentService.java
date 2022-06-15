package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.AppServiceDao;
import com.example.cyjcommon.dao.PersistentDao;
import com.example.cyjcommon.dao.PropertyDao;
import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Authority;
import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.service.autoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentService extends BaseService implements autoService<Persistent> {

    private PersistentDao persistentDao;
    private AppServiceDao appServiceDao;
    private PropertyDao propertyDao;
    private PropertyService propertyService;

    @Autowired
    public void setEntityDao(PersistentDao persistentDao) {
        this.persistentDao = persistentDao;
    }

    @Autowired
    public void setAppServiceDao(AppServiceDao appServiceDao) {
        this.appServiceDao = appServiceDao;
    }

    @Autowired
    public void setPropertyDao(PropertyDao propertyDao) {
        this.propertyDao = propertyDao;
    }

    @Autowired
    public void setPropertyService(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @Override
    public Persistent addOne(Persistent po) {
        if (po.getAppServiceId() != null){
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        return persistentDao.save(po);
    }

    @Override
    public void deleteOne(Persistent po) {
        persistentDao.delete(po);
    }

    @Override
    public Persistent updateOne(Persistent po) {
        if (po.getAppServiceId() != null){
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        return persistentDao.saveAndFlush(po);
    }

    @Override
    public Page<Persistent> findAll(Integer pageNumber) {
        return persistentDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }


}
