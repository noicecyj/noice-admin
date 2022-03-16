package com.example.cyjdictionary.dao.custom;

import com.example.cyjdictionary.entity.auto.po.CatalogPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
public interface CatalogCustomDao extends JpaRepository<CatalogPO, String> {

}
