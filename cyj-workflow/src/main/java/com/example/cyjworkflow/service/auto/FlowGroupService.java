package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.FlowGroupPO;
import com.querydsl.core.QueryResults;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface FlowGroupService {

    FlowGroupPO addOne(FlowGroupPO po);

    void deleteOne(String id);

    FlowGroupPO updateOne(FlowGroupPO po);

    QueryResults<FlowGroupPO> findAll(Integer pageNumber);

    FlowGroupPO findOneById(String id);

}
