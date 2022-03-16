package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.dao.auto.EntityDao;
import com.example.cyjentitycreater.entity.auto.po.QEntityPO;
import com.example.cyjentitycreater.entity.auto.po.EntityPO;
import com.example.cyjentitycreater.service.auto.EntityService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
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
    public void deleteOne(String id) {
        entityDao.deleteById(id);
    }

    @Override
    public EntityPO updateOne(EntityPO po) {
        return entityDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<EntityPO> findAll(Integer pageNumber, String pid) {
        return queryFactory
                .selectFrom(QEntityPO.entityPO)
                .where(QEntityPO.entityPO.pid.eq(pid).and(QEntityPO.entityPO.sortCode.isNotNull()))
                .offset((pageNumber - 1) * 10L)
                .orderBy(QEntityPO.entityPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public EntityPO findOneById(String id) {
        return entityDao.findById(id).orElse(null);
    }

    @Override
    public List<EntityPO> findListByPid(String id) {
        return queryFactory
                .selectFrom(QEntityPO.entityPO)
                .where(QEntityPO.entityPO.pid.eq(id))
                .fetch();
    }

}
