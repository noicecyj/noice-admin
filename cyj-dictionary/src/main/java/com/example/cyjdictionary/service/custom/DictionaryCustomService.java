package com.example.cyjdictionary.service.custom;

import com.example.cyjcommon.entity.Dictionary;

import java.util.List;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-01-04
 */
public interface DictionaryCustomService {

    List<Dictionary> findCatalogByName(String name);

    List<Dictionary> findCatalogByValue(String value);

    Dictionary findDictionaryByCatalogValueAndDictionaryKey(String value, String key);

    Dictionary findDictionaryByCatalogValueAndDictionaryValue(String value, String value2);
}
