package com.example.cyjdictionary.dao.auto;

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
public interface CatalogDao extends JpaRepository<CatalogPO, String> {

        @Operation(summary = "根据目录名称进行模糊查询")
        Page<CatalogPO> findAllByCatalogNameContainsOrCatalogValueContains(String catalogName,
                                                                           String catalogValue,
                                                                           Pageable pageable);

}
