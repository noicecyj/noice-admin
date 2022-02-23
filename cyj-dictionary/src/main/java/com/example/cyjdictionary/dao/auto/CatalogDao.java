package com.example.cyjdictionary.dao.auto;

import com.example.cyjdictionary.entity.auto.po.CatalogPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-23
 */
public interface CatalogDao extends JpaRepository<CatalogPO, String> {
}
