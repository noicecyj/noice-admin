package com.example.cyjentitycreater.service.auto;

import com.example.cyjentitycreater.entity.auto.po.EntityNamePO;
import com.querydsl.core.QueryResults;
/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface EntityNameService {

    EntityNamePO addOne(EntityNamePO po);
    void deleteOne(String id);
    EntityNamePO updateOne(EntityNamePO po);
    QueryResults<EntityNamePO> findAll(Integer pageNumber);
    EntityNamePO findOneById(String id);

}
