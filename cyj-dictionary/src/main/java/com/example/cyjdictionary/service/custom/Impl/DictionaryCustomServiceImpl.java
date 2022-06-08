package com.example.cyjdictionary.service.custom.Impl;

import com.example.cyjcommon.entity.Dictionary;
import com.example.cyjcommon.entity.QCatalog;
import com.example.cyjcommon.entity.QDictionary;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjdictionary.service.custom.DictionaryCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-01-04
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DictionaryCustomServiceImpl extends BaseService implements DictionaryCustomService {

    @Override
    public List<Dictionary> findCatalogByName(String name) {
        QDictionary qDictionary = QDictionary.dictionary;
        QCatalog qCatalog = QCatalog.catalog;
        return queryFactory.selectFrom(qDictionary)
                .innerJoin(qCatalog)
                .on(qDictionary.catalog.eq(qCatalog))
                .where(qCatalog.catalogName.eq(name))
                .orderBy(qDictionary.sortCode.asc()).fetch();
    }

    @Override
    public List<Dictionary> findCatalogByValue(String value) {
        QDictionary qDictionary = QDictionary.dictionary;
        QCatalog qCatalog = QCatalog.catalog;
        return queryFactory.selectFrom(qDictionary)
                .innerJoin(qCatalog)
                .on(qDictionary.catalog.id.eq(qCatalog.id))
                .where(qCatalog.catalogValue.eq(value))
                .orderBy(qDictionary.sortCode.asc()).fetch();
    }

    @Override
    public Dictionary findDictionaryByCatalogValueAndDictionaryKey(String value, String key) {
        QDictionary qDictionary = QDictionary.dictionary;
        QCatalog qCatalog = QCatalog.catalog;
        return queryFactory.selectFrom(qDictionary)
                .innerJoin(qCatalog)
                .on(qDictionary.catalog.eq(qCatalog))
                .where(qCatalog.catalogValue.eq(value).and(qDictionary.dictionaryValue.eq(key)))
                .orderBy(qDictionary.sortCode.asc()).fetchOne();
    }

    @Override
    public Dictionary findDictionaryByCatalogValueAndDictionaryValue(String value, String value2) {
        QDictionary qDictionary = QDictionary.dictionary;
        QCatalog qCatalog = QCatalog.catalog;
        return queryFactory.selectFrom(qDictionary)
                .innerJoin(qCatalog)
                .on(qDictionary.catalog.eq(qCatalog))
                .where(qCatalog.catalogValue.eq(value).and(qDictionary.dictionaryName.eq(value2)))
                .orderBy(qDictionary.sortCode.asc()).fetchOne();
    }


}
