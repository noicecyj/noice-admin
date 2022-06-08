package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.entity.FlowTenant;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface FlowTenantService {

    FlowTenant addOne(FlowTenant po);

    void deleteOne(FlowTenant po);

    FlowTenant updateOne(FlowTenant po);

    Page<FlowTenant> findAll(Integer pageNumber);

}
