package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.po.AppServicePO;
import com.querydsl.core.QueryResults;

/**
 * @author Noice
 * @version 1.0
 */
public interface AppServiceService {

    AppServicePO addOne(AppServicePO po);

    void deleteOne(String id);

    AppServicePO updateOne(AppServicePO po);

    QueryResults<AppServicePO> findAll(Integer pageNumber);

    AppServicePO findOneById(String id);

}
