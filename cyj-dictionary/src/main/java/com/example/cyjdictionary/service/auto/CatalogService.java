package com.example.cyjdictionary.service.auto;

import com.example.cyjdictionary.entity.auto.po.CatalogPO;
import com.querydsl.core.QueryResults;
/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-01-27
 */
public interface CatalogService {

        CatalogPO addOne(CatalogPO po);
        void deleteOne(String id);
        CatalogPO updateOne(CatalogPO po);
        QueryResults<CatalogPO> findAll(Integer pageNumber);
        CatalogPO findOneById(String id);

}
