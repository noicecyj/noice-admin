package com.example.cyjdictionary.service.auto.Impl;

import com.example.cyjdictionary.dao.auto.CatalogDao;
import com.example.cyjdictionary.entity.auto.po.CatalogPO;
import com.example.cyjdictionary.entity.auto.po.QCatalogPO;
import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjdictionary.service.auto.CatalogService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-01
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CatalogServiceImpl extends BaseService implements CatalogService {

    private CatalogDao catalogDao;

    @Autowired
    public void setCatalogDao(CatalogDao catalogDao) {
        this.catalogDao = catalogDao;
    }

    @Override
    public CatalogPO addOne(CatalogPO po) {
        return catalogDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        catalogDao.deleteById(id);
    }

    @Override
    public CatalogPO updateOne(CatalogPO po) {
        return catalogDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<CatalogPO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QCatalogPO.catalogPO)
                .where(QCatalogPO.catalogPO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QCatalogPO.catalogPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public CatalogPO findOneById(String id) {
        return catalogDao.findById(id).orElse(null);
    }

}
