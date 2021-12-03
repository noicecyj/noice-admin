package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjentitycreater.dao.auto.EntityDao;
import com.example.cyjentitycreater.entity.auto.po.EntityPO;
import com.example.cyjentitycreater.entity.auto.po.QEntityPO;
import com.example.cyjentitycreater.entity.auto.vo.EntityVO;
import com.example.cyjentitycreater.service.BaseService;
import com.example.cyjentitycreater.service.auto.EntityService;
import com.querydsl.core.QueryResults;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.QBean;
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
        public QueryResults<EntityVO> entityPage(Integer pageNumber, String pid) {
                QEntityPO qEntityPO = QEntityPO.entityPO;
                QBean<EntityVO> qBean = Projections.bean(EntityVO.class,
                        qEntityPO.id,
                        qEntityPO.pid,
                        qEntityPO.propertyCode,
                        qEntityPO.propertyType,
                        qEntityPO.propertyLabel,
                        qEntityPO.propertyWidth,
                        qEntityPO.propertyMode,
                        qEntityPO.propertyDirection,
                        qEntityPO.propertyRequired,
                        qEntityPO.propertyDataSource,
                        qEntityPO.propertyDataSourceType,
                        qEntityPO.propertyDefaultValue,
                        qEntityPO.propertyDisplay,
                        qEntityPO.sortCode
                );
                Predicate predicate;
                predicate = qEntityPO.pid.eq(pid).and(qEntityPO.sortCode.isNotNull());
                return queryFactory.select(qBean).from(qEntityPO).where(predicate).offset(pageNumber).orderBy(qEntityPO.sortCode.asc()).limit(8).fetchResults();
        }

        @Override
        public EntityPO findOneById(String id) {
                return entityDao.findById(id).orElse(null);
        }

        @Override
        public List<EntityPO> findListByPid(String id) {
                return queryFactory.selectFrom(QEntityPO.entityPO).where(QEntityPO.entityPO.pid.eq(id)).fetch();
        }

}
