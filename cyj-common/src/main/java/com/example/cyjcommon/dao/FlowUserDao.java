package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.FlowUserPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface FlowUserDao extends JpaRepository<FlowUserPO, String> {
}
