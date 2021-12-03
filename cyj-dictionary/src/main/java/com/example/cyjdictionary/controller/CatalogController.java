package com.example.cyjdictionary.controller;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-02-02
 */
@Tag(name = "数据字典相关接口")
public interface CatalogController {

        @Operation(summary = "查询所有Catalog")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "catalogPage")
        ResultVO catalogFindAll(@RequestParam("pageNumber") Integer pageNumber,
                                @RequestParam("pageSize") Integer pageSize,
                                @RequestParam("sortCode") String sortCode);

        @Operation(summary = "保存Catalog")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "catalogSave")
        ResultVO catalogSave(@RequestBody Map<String, Object> vo);

        @Operation(summary = "删除Catalog")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "catalogDelete")
        void catalogDelete(@RequestParam("id") String id);

        @Operation(summary = "根据ID查询Catalog")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "findCatalogById")
        ResultVO findCatalogById(@RequestParam("id") String id);

}
