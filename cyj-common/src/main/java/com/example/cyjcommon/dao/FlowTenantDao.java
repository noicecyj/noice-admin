package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.FlowTenantPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 * @version 1.0
 */
public interface FlowTenantDao extends JpaRepository<FlowTenantPO, String> {
}
