package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.FlowUserPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 */
public interface FlowUserDao extends JpaRepository<FlowUserPO, String> {

}
