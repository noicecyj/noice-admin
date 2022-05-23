package com.example.cyjdictionary.controller.auto;

import com.example.cyjcommon.entity.po.CatalogPO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Noice
 */
@Tag(name = "Catalog")
public interface CatalogController {

    @Operation(summary = "查询所有Catalog")
    @PostMapping(value = "catalogPage")
    ResultVO catalogPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存Catalog")
    @PostMapping(value = "catalogSave")
    ResultVO catalogSave(@RequestBody @Validated CatalogPO po, BindingResult bindingResult);

    @Operation(summary = "删除Catalog")
    @PostMapping(value = "catalogDelete")
    ResultVO catalogDelete(@RequestBody CatalogPO po);

}
