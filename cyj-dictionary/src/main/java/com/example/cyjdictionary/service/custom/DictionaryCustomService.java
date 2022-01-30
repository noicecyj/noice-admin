package com.example.cyjdictionary.service.custom;

import com.example.cyjdictionary.entity.auto.po.DictionaryPO;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-01-04
 */
public interface DictionaryCustomService {

    List<DictionaryPO> findCatalogByName(String name);

    List<DictionaryPO> findCatalogByValue(String value);

    DictionaryPO findDictionaryByCatalogValueAndDictionaryKey(String value, String key);

    DictionaryPO findDictionaryByCatalogValueAndDictionaryValue(String value, String value2);
}
