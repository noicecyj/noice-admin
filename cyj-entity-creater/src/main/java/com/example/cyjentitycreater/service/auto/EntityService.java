package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.po.EntityPO;
import com.querydsl.core.QueryResults;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface EntityService {

    EntityPO addOne(EntityPO po);

    void deleteOne(String id);

    EntityPO updateOne(EntityPO po);

    QueryResults<EntityPO> findAll(Integer pageNumber, String pid);

    EntityPO findOneById(String id);

    List<EntityPO> findListByPid(String id);

}
