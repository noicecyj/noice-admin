package com.example.cyjdictionary.service.custom;

import com.example.cyjcommon.entity.Dictionary;
import com.example.cyjcommon.entity.QCatalog;
import com.example.cyjcommon.entity.QDictionary;
import com.example.cyjcommon.service.BaseService;
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
public class DictionaryCustomService extends BaseService {

    public List<Dictionary> findCatalogByValue(String value) {
        QDictionary qDictionary = QDictionary.dictionary;
        QCatalog qCatalog = QCatalog.catalog;
        return queryFactory.selectFrom(qDictionary)
                .innerJoin(qCatalog)
                .on(qDictionary.catalog.id.eq(qCatalog.id))
                .where(qCatalog.catalogValue.eq(value))
                .orderBy(qDictionary.sortCode.asc()).fetch();
    }

}
