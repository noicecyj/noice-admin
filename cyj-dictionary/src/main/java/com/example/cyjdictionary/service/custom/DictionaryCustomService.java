package com.example.cyjdictionary.service.custom;

import com.example.cyjcommon.entity.po.DictionaryPO;

import java.util.List;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-01-04
 */
public interface DictionaryCustomService {

    List<DictionaryPO> findCatalogByName(String name);

    List<DictionaryPO> findCatalogByValue(String value);

    DictionaryPO findDictionaryByCatalogValueAndDictionaryKey(String value, String key);

    DictionaryPO findDictionaryByCatalogValueAndDictionaryValue(String value, String value2);
}
