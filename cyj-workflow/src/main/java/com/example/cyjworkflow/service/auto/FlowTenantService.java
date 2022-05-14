package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.FlowTenantPO;
import com.querydsl.core.QueryResults;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface FlowTenantService {

    FlowTenantPO addOne(FlowTenantPO po);

    void deleteOne(String id);

    FlowTenantPO updateOne(FlowTenantPO po);

    QueryResults<FlowTenantPO> findAll(Integer pageNumber);

    FlowTenantPO findOneById(String id);

}
