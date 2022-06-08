package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.Bpmn;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 * @version 1.0
 */
public interface BpmnDao extends JpaRepository<Bpmn, String> {
}
