package com.example.cyjworkflow.dao.auto;

import com.example.cyjworkflow.entity.auto.po.BpmnPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface BpmnDao extends JpaRepository<BpmnPO, String> {
}
