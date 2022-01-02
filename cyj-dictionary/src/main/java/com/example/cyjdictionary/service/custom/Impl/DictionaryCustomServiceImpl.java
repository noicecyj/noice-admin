package com.example.cyjdictionary.service.custom.Impl;

import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import com.example.cyjdictionary.entity.auto.po.QCatalogPO;
import com.example.cyjdictionary.entity.auto.po.QDictionaryPO;
import com.example.cyjdictionary.service.custom.DictionaryCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DictionaryCustomServiceImpl extends BaseService implements DictionaryCustomService {

        @Override
        public List<DictionaryPO> findCatalogByName(String name) {
                QDictionaryPO qDictionary = QDictionaryPO.dictionaryPO;
                QCatalogPO qCatalogPO = QCatalogPO.catalogPO;
                return queryFactory.selectFrom(qDictionary)
                        .innerJoin(qCatalogPO)
                        .on(qDictionary.pid.eq(qCatalogPO.id))
                        .where(qCatalogPO.catalogName.eq(name))
                        .orderBy(qDictionary.sortCode.asc()).fetch();
        }

        @Override
        public List<DictionaryPO> findCatalogByValue(String value) {
                QDictionaryPO qDictionary = QDictionaryPO.dictionaryPO;
                QCatalogPO qCatalogPO = QCatalogPO.catalogPO;
                return queryFactory.selectFrom(qDictionary)
                        .innerJoin(qCatalogPO)
                        .on(qDictionary.pid.eq(qCatalogPO.id))
                        .where(qCatalogPO.catalogValue.eq(value))
                        .orderBy(qDictionary.sortCode.asc()).fetch();
        }

        @Override
        public DictionaryPO findDictionaryByCatalogValueAndDictionaryKey(String value, String key) {
                QDictionaryPO qDictionary = QDictionaryPO.dictionaryPO;
                QCatalogPO qCatalogPO = QCatalogPO.catalogPO;
                return queryFactory.selectFrom(qDictionary)
                        .innerJoin(qCatalogPO)
                        .on(qDictionary.pid.eq(qCatalogPO.id))
                        .where(qCatalogPO.catalogValue.eq(value).and(qDictionary.dictionaryValue.eq(key)))
                        .orderBy(qDictionary.sortCode.asc()).fetchOne();
        }

        @Override
        public DictionaryPO findDictionaryByCatalogValueAndDictionaryValue(String value, String value2) {
                QDictionaryPO qDictionary = QDictionaryPO.dictionaryPO;
                QCatalogPO qCatalogPO = QCatalogPO.catalogPO;
                return queryFactory.selectFrom(qDictionary)
                        .innerJoin(qCatalogPO)
                        .on(qDictionary.pid.eq(qCatalogPO.id))
                        .where(qCatalogPO.catalogValue.eq(value).and(qDictionary.dictionaryName.eq(value2)))
                        .orderBy(qDictionary.sortCode.asc()).fetchOne();
        }


}
