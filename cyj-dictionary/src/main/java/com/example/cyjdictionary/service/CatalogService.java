package com.example.cyjdictionary.service;

import com.example.cyjdictionary.entity.po.CatalogPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-02-02
 */
public interface CatalogService {

        @Operation(summary = "添加实体")
        CatalogPO addOne(CatalogPO po);

        @Operation(summary = "删除实体")
        void deleteOne(String id);

        @Operation(summary = "更新实体")
        CatalogPO updateOne(CatalogPO po);

        @Operation(summary = "查找所有实体(分页排序)")
        Page<CatalogPO> findAll(Integer pageNumber, Integer pageSize, String sortCode);

        @Operation(summary = "查找实体")
        CatalogPO findOneById(String id);

}
