package com.example.cyjdictionary.service.auto;

import com.example.cyjcommon.entity.po.CatalogPO;
import com.querydsl.core.QueryResults;

/**
 * @author Noice
 * @version 1.0
 */
public interface CatalogService {

    CatalogPO addOne(CatalogPO po);

    void deleteOne(String id);

    CatalogPO updateOne(CatalogPO po);

    QueryResults<CatalogPO> findAll(Integer pageNumber);

    CatalogPO findOneById(String id);

}
