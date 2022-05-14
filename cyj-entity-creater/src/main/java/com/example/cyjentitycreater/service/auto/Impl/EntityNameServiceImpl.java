package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.dao.EntityNameDao;
import com.example.cyjcommon.entity.po.EntityNamePO;
import com.example.cyjcommon.entity.po.QEntityNamePO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.auto.EntityNameService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EntityNameServiceImpl extends BaseService implements EntityNameService {

    private EntityNameDao entityNameDao;

    @Autowired
    public void setEntityNameDao(EntityNameDao entityNameDao) {
        this.entityNameDao = entityNameDao;
    }

    @Override
    public EntityNamePO addOne(EntityNamePO po) {
        return entityNameDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        entityNameDao.deleteById(id);
    }

    @Override
    public EntityNamePO updateOne(EntityNamePO po) {
        return entityNameDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<EntityNamePO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QEntityNamePO.entityNamePO)
                .where(QEntityNamePO.entityNamePO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QEntityNamePO.entityNamePO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public EntityNamePO findOneById(String id) {
        return entityNameDao.findById(id).orElse(null);
    }

}
