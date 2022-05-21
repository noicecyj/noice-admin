package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.RolePO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 * @version 1.0
 */
public interface RoleDao extends JpaRepository<RolePO, String> {
}
