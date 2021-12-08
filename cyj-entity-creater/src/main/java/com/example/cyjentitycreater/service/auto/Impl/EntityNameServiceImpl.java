package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjentitycreater.dao.auto.EntityNameDao;
import com.example.cyjentitycreater.entity.auto.po.EntityNamePO;
import com.example.cyjentitycreater.entity.auto.po.QEntityNamePO;
import com.example.cyjentitycreater.entity.auto.po.QEntityPO;
import com.example.cyjentitycreater.service.BaseService;
import com.example.cyjentitycreater.service.auto.EntityNameService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-02-02
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
                queryFactory.delete(QEntityPO.entityPO).where(QEntityPO.entityPO.pid.eq(id));
        }

        @Override
        public EntityNamePO updateOne(EntityNamePO po) {
                return entityNameDao.saveAndFlush(po);
        }

        @Override
        public QueryResults<EntityNamePO> entityNamePage(Integer pageNumber) {
                return queryFactory
                        .selectFrom(QEntityNamePO.entityNamePO)
                        .where(QEntityNamePO.entityNamePO.sortCode.isNotNull())
                        .offset(pageNumber)
                        .orderBy(QEntityNamePO.entityNamePO.sortCode.asc())
                        .limit(8)
                        .fetchResults();
        }

        @Override
        public EntityNamePO findOneById(String id) {
                return entityNameDao.findById(id).orElse(null);
        }

        @Override
        public List<EntityNamePO> findListByPid(String id) {
                return queryFactory
                        .selectFrom(QEntityNamePO.entityNamePO)
                        .where(QEntityNamePO.entityNamePO.pid.eq(id))
                        .fetch();
        }

}
