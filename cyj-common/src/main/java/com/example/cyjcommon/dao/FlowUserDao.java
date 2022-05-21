package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.FlowUserPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 * @version 1.0
 */
public interface FlowUserDao extends JpaRepository<FlowUserPO, String> {
}
