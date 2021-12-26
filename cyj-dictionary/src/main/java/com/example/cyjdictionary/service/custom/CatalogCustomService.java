package com.example.cyjdictionary.service.custom;

import com.example.cyjdictionary.entity.auto.po.CatalogPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
public interface CatalogCustomService {

        @Operation(summary = "根据名称和代号进行模糊查询")
        Page<CatalogPO> findAllByCatalogNameContainsOrCatalogValueContains(String catalogName,
                                                                           String catalogValue,
                                                                           Integer pageNumber,
                                                                           Integer pageSize,
                                                                           String sortCode);

}
