package com.example.cyjdictionary.controller.auto;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.entity.auto.po.CatalogPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
@Tag(name = "Catalog")
public interface CatalogController {

        @Operation(summary = "查询所有Catalog")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "catalogPage")
        ResultVO catalogPage(@RequestParam("pageNumber") Integer pageNumber);

        @Operation(summary = "保存Catalog")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "catalogSave")
        ResultVO catalogSave(@RequestBody CatalogPO po);

        @Operation(summary = "删除Catalog")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "catalogDelete")
        void catalogDelete(@RequestParam("id") String id);

        @Operation(summary = "根据ID查询Catalog")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "findCatalogById")
        ResultVO findCatalogById(@RequestParam("id") String id);

}
