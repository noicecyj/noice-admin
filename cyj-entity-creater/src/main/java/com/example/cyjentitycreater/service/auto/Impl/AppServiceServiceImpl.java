package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjentitycreater.dao.auto.AppServiceDao;
import com.example.cyjentitycreater.entity.auto.po.AppServicePO;
import com.example.cyjentitycreater.entity.auto.po.QAppServicePO;
import com.example.cyjentitycreater.entity.auto.vo.AppServiceVO;
import com.example.cyjentitycreater.service.BaseService;
import com.example.cyjentitycreater.service.auto.AppServiceService;
import com.querydsl.core.QueryResults;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.QBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
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
        public QueryResults<AppServiceVO> findAll(AppServiceVO vo) {
                QAppServicePO qAppServicePO = QAppServicePO.appServicePO;
                QBean<AppServiceVO> qBean = Projections.bean(AppServiceVO.class, qAppServicePO.id,
                        qAppServicePO.appApi,
                        qAppServicePO.appPath,
                        qAppServicePO.appPort,
                        qAppServicePO.name
                );
                Predicate predicate = qAppServicePO.sortCode.isNotNull();
                predicate = StringUtils.isEmpty(vo.getAppApi()) ?
                        predicate : ExpressionUtils.and(predicate, qAppServicePO.appApi.like("%" + vo.getAppApi() + "%"));
                predicate = StringUtils.isEmpty(vo.getAppPath()) ?
                        predicate : ExpressionUtils.and(predicate, qAppServicePO.appPath.like("%" + vo.getAppPath() + "%"));
                predicate = StringUtils.isEmpty(vo.getAppPort()) ?
                        predicate : ExpressionUtils.and(predicate, qAppServicePO.appPort.like("%" + vo.getAppPort() + "%"));
                predicate = StringUtils.isEmpty(vo.getName()) ?
                        predicate : ExpressionUtils.and(predicate, qAppServicePO.name.like("%" + vo.getName() + "%"));
                return queryFactory.select(qBean)
                        .from(qAppServicePO)
                        .where(predicate)
                        .offset(vo.getPageNumber())
                        .orderBy(qAppServicePO.sortCode.asc())
                        .limit(8)
                        .fetchResults();
        }

        @Override
        public AppServicePO findOneById(String id) {
                return appServiceDao.findById(id).orElse(null);
        }

}
