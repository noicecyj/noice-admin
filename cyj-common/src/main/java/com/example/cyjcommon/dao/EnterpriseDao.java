package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.EnterprisePO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 * @version 1.0
 */
public interface EnterpriseDao extends JpaRepository<EnterprisePO, String> {
}
