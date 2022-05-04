package com.example.cyjworkflow.dao.custom;

import com.example.cyjworkflow.entity.auto.po.FlowGroupPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface FlowGroupCustomDao extends JpaRepository<FlowGroupPO, String> {
}
