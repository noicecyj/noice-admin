package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.CatalogPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 * @version 1.0
 */
public interface CatalogDao extends JpaRepository<CatalogPO, String> {
}
