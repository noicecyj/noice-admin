package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.dao.EntityDao;
import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.auto.EntityService;
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
public class EntityServiceImpl extends BaseService implements EntityService {

    private EntityDao entityDao;

    @Autowired
    public void setEntityDao(EntityDao entityDao) {
        this.entityDao = entityDao;
    }

    @Override
    public EntityPO addOne(EntityPO po) {
        return entityDao.save(po);
    }

    @Override
    public void deleteOne(EntityPO po) {
        entityDao.delete(po);
    }

    @Override
    public EntityPO updateOne(EntityPO po) {
        return entityDao.saveAndFlush(po);
    }

    @Override
    public Page<EntityPO> findAll(Integer pageNumber) {
        return entityDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    @Override
    public Page<EntityPO> findAll(Integer pageNumber, EntityPO entity) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        EntityPO entityPO = new EntityPO();
        entityPO.setEntity(entity);
        Example<EntityPO> example = Example.of(entityPO);
        return entityDao.findAll(example, pageable);
    }

    @Override
    public Page<EntityPO> findAll(Integer pageNumber, AppServicePO appService) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        EntityPO entityPO = new EntityPO();
        entityPO.setAppService(appService);
        Example<EntityPO> example = Example.of(entityPO);
        return entityDao.findAll(example, pageable);
    }

}
