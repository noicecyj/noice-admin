package com.example.cyjdictionary.service.custom;

import com.example.cyjdictionary.entity.auto.po.CatalogPO;
import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
public interface DictionaryCustomService {

        @Operation(summary = "根据目录名称查找字典")
        List<DictionaryPO> findCatalogByName(String name);

        @Operation(summary = "根据目录代号查找字典")
        List<DictionaryPO> findCatalogByValue(String value);

        @Operation(summary = "根据目录代号查找字典")
        DictionaryPO findDictionaryByCatalogValueAndDictionaryKey(String value, String key);

        @Operation(summary = "根据目录代号查找字典")
        DictionaryPO findDictionaryByCatalogValueAndDictionaryValue(String value, String value2);



}
