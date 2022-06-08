package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.dao.AppServiceDao;
import com.example.cyjcommon.dao.EntityDao;
import com.example.cyjcommon.dao.PropertyDao;
import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Entity;
import com.example.cyjcommon.entity.Property;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.auto.EntityService;
import com.example.cyjentitycreater.service.auto.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EntityServiceImpl extends BaseService implements EntityService {

    private EntityDao entityDao;
    private AppServiceDao appServiceDao;
    private PropertyDao propertyDao;
    private PropertyService propertyService;

    @Autowired
    public void setEntityDao(EntityDao entityDao) {
        this.entityDao = entityDao;
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
    public Entity addOne(Entity po) {
        if (po.getEntityId() != null){
            Entity entity = entityDao.getOne(po.getEntityId());
            po.setEntityParent(entity);
        }
        if (po.getAppServiceId() != null){
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        return entityDao.save(po);
    }

    @Override
    public void deleteOne(Entity po) {
        List<Entity> entityList = entityDao.findByEntityParentOrderBySortCode(po);
        for (Entity entity : entityList) {
            deleteOne(entity);
        }
        List<Property> propertyList = propertyDao.findByEntityOrderBySortCode(po);
        for (Property property : propertyList) {
            propertyService.deleteOne(property);
        }
        entityDao.delete(po);
    }

    @Override
    public Entity updateOne(Entity po) {
        if (po.getEntityId() != null){
            Entity entity = entityDao.getOne(po.getEntityId());
            po.setEntityParent(entity);
        }
        if (po.getAppServiceId() != null){
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        return entityDao.saveAndFlush(po);
    }

    @Override
    public Page<Entity> findAll(Integer pageNumber) {
        return entityDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    @Override
    public Page<Entity> findAll(Integer pageNumber, Entity entity) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        Entity entityParent = new Entity();
        entity.setEntityParent(entityParent);
        Example<Entity> example = Example.of(entity);
        return entityDao.findAll(example, pageable);
    }

    @Override
    public Page<Entity> findAll(Integer pageNumber, AppService appService) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        Entity entity = new Entity();
        entity.setAppService(appService);
        Example<Entity> example = Example.of(entity);
        return entityDao.findAll(example, pageable);
    }

}
