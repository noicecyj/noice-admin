package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.po.FlowGroupPO;
import com.querydsl.core.QueryResults;

/**
 * @author Noice
 * @version 1.0
 */
public interface FlowGroupService {

    FlowGroupPO addOne(FlowGroupPO po);

    void deleteOne(String id);

    FlowGroupPO updateOne(FlowGroupPO po);

    QueryResults<FlowGroupPO> findAll(Integer pageNumber);

    FlowGroupPO findOneById(String id);

}
