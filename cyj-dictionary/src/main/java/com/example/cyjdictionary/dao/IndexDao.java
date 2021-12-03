package com.example.cyjdictionary.dao;

import com.example.cyjdictionary.entity.po.CatalogPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020-09-13
 */
public interface IndexDao extends JpaRepository<CatalogPO, String> {

        @Operation(summary = "根据目录名称进行模糊查询")
        Page<CatalogPO> findAllByCatalogNameContainsOrCatalogValueContains(String catalogName,
                                                                           String catalogValue,
                                                                           Pageable pageable);

}
