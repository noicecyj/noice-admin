package com.example.cyjdictionary.controller.auto;

import com.example.cyjcommon.entity.po.CatalogPO;
import com.example.cyjcommon.entity.po.DictionaryPO;
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
@Tag(name = "Dictionary")
public interface DictionaryController {

    @Operation(summary = "查询所有Dictionary")
    @PostMapping(value = "dictionaryPage")
    ResultVO dictionaryPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "根据Catalog查询所有Dictionary")
    @PostMapping(value = "dictionaryPageByCatalog")
    ResultVO dictionaryPage(@RequestParam("pageNumber") Integer pageNumber, @RequestBody CatalogPO catalog);

    @Operation(summary = "保存Dictionary")
    @PostMapping(value = "dictionarySave")
    ResultVO dictionarySave(@RequestBody @Validated DictionaryPO po, BindingResult bindingResult);

    @Operation(summary = "删除Dictionary")
    @PostMapping(value = "dictionaryDelete")
    ResultVO dictionaryDelete(@RequestBody DictionaryPO po);

}
