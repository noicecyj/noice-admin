package com.example.cyjworkflow.service.auto;

import com.example.cyjworkflow.entity.auto.po.FlowUserPO;
import com.querydsl.core.QueryResults;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface FlowUserService {

    FlowUserPO addOne(FlowUserPO po);

    void deleteOne(String id);

    FlowUserPO updateOne(FlowUserPO po);

    QueryResults<FlowUserPO> findAll(Integer pageNumber);

    FlowUserPO findOneById(String id);

}
