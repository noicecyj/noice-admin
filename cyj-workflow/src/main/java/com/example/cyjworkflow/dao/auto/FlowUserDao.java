package com.example.cyjworkflow.dao.auto;

import com.example.cyjworkflow.entity.auto.po.FlowUserPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface FlowUserDao extends JpaRepository<FlowUserPO, String> {
}
