package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.AuthorityPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 * @version 1.0
 */
public interface AuthorityDao extends JpaRepository<AuthorityPO, String> {
}
