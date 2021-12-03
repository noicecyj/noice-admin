package com.example.cyjdictionary.controller;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.entity.po.DictionaryPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Tag(name = "自定义相关接口")
public interface IndexController {

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

        @Operation(summary = "根据目录名称或者值模糊查询")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "findAllByCatalogNameContainsOrCatalogValueContains")
        ResultVO findAllByCatalogNameContainsOrCatalogValueContains(@RequestParam("catalogName") String catalogName,
                                                                    @RequestParam("catalogValue") String catalogValue,
                                                                    @RequestParam("pageNumber") Integer pageNumber,
                                                                    @RequestParam("pageSize") Integer pageSize,
                                                                    @RequestParam("sortCode") String sortCode);

}
