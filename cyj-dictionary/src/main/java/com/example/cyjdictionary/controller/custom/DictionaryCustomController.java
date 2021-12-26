package com.example.cyjdictionary.controller.custom;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
@Tag(name = "Dictionary")
public interface DictionaryCustomController {

        @Operation(summary = "根据目录名称查询字典")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "findCatalogByName")
        List<DictionaryPO> findCatalogByName(@RequestParam("name") String name);

        @Operation(summary = "根据目录值查询字典")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "findCatalogByValue")
        List<DictionaryPO> findCatalogByValue(@RequestParam("value") String value);

        @Operation(summary = "根据目录值和字典值查询")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "findDictionaryByCatalogValueAndDictionaryKey")
        DictionaryPO findDictionaryByCatalogValueAndDictionaryKey(@RequestParam("value") String value,
                                                                  @RequestParam("key") String key);

        @Operation(summary = "根据目录值和字典值查询2")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "findDictionaryByCatalogValueAndDictionaryValue")
        DictionaryPO findDictionaryByCatalogValueAndDictionaryValue(@RequestParam("value") String value,
                                                                    @RequestParam("value2") String value2);



}
