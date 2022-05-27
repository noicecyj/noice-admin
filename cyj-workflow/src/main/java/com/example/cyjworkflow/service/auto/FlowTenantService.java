package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.po.FlowTenantPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface FlowTenantService {

    FlowTenantPO addOne(FlowTenantPO po);

    void deleteOne(FlowTenantPO po);

    FlowTenantPO updateOne(FlowTenantPO po);

    Page<FlowTenantPO> findAll(Integer pageNumber);

}
