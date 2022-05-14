package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.EntityNamePO;
import com.querydsl.core.QueryResults;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface EntityNameService {

    EntityNamePO addOne(EntityNamePO po);

    void deleteOne(String id);

    EntityNamePO updateOne(EntityNamePO po);

    QueryResults<EntityNamePO> findAll(Integer pageNumber);

    EntityNamePO findOneById(String id);

}
