package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.Bpmn;
import com.querydsl.core.QueryResults;

/**
 * @author Noice
 * @version 1.0
 */
public interface BpmnService {

    Bpmn addOne(Bpmn po);

    void deleteOne(String id);

    Bpmn updateOne(Bpmn po);

    QueryResults<Bpmn> findAll(Integer pageNumber);

    Bpmn findOneById(String id);

}
