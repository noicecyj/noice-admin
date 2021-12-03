package com.example.cyjdictionary.service;

import com.example.cyjdictionary.entity.po.CatalogPO;
import com.example.cyjdictionary.entity.po.DictionaryPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020-09-13
 */
public interface IndexService {

        @Operation(summary = "根据目录名称查找字典")
        List<DictionaryPO> findCatalogByName(String name);

        @Operation(summary = "根据目录代号查找字典")
        List<DictionaryPO> findCatalogByValue(String value);

        @Operation(summary = "根据目录代号查找字典")
        DictionaryPO findDictionaryByCatalogValueAndDictionaryKey(String value, String key);

        @Operation(summary = "根据目录代号查找字典")
        DictionaryPO findDictionaryByCatalogValueAndDictionaryValue(String value, String value2);

        @Operation(summary = "根据名称和代号进行模糊查询")
        Page<CatalogPO> findAllByCatalogNameContainsOrCatalogValueContains(String catalogName,
                                                                           String catalogValue,
                                                                           Integer pageNumber,
                                                                           Integer pageSize,
                                                                           String sortCode);

}
