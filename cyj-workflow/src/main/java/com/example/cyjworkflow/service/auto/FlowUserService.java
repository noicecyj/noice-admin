package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.po.FlowUserPO;
import com.querydsl.core.QueryResults;

/**
 * @author Noice
 * @version 1.0
 */
public interface FlowUserService {

    FlowUserPO addOne(FlowUserPO po);

    void deleteOne(String id);

    FlowUserPO updateOne(FlowUserPO po);

    QueryResults<FlowUserPO> findAll(Integer pageNumber);

    FlowUserPO findOneById(String id);

}
