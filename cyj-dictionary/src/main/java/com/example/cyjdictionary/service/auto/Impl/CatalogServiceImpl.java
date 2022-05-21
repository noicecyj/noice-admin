package com.example.cyjdictionary.service.auto.Impl;

import com.example.cyjcommon.dao.CatalogDao;
import com.example.cyjcommon.entity.po.CatalogPO;
import com.example.cyjcommon.entity.po.QCatalogPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjdictionary.service.auto.CatalogService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 * @version 1.0
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
