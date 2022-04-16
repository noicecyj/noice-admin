package com.example.cyjworkflow.service.auto;

import com.example.cyjworkflow.entity.auto.po.BpmnPO;
import com.querydsl.core.QueryResults;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface BpmnService {

    BpmnPO addOne(BpmnPO po);

    void deleteOne(String id);

    BpmnPO updateOne(BpmnPO po);

    QueryResults<BpmnPO> findAll(Integer pageNumber);

    BpmnPO findOneById(String id);

}