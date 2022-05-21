package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.po.FlowTenantPO;
import com.querydsl.core.QueryResults;

/**
 * @author Noice
 * @version 1.0
 */
public interface FlowTenantService {

    FlowTenantPO addOne(FlowTenantPO po);

    void deleteOne(String id);

    FlowTenantPO updateOne(FlowTenantPO po);

    QueryResults<FlowTenantPO> findAll(Integer pageNumber);

    FlowTenantPO findOneById(String id);

}
