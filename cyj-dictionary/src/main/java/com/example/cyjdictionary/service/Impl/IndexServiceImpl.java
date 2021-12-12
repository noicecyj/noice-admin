package com.example.cyjdictionary.service.Impl;

import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjdictionary.dao.IndexDao;
import com.example.cyjdictionary.entity.po.CatalogPO;
import com.example.cyjdictionary.entity.po.DictionaryPO;
import com.example.cyjdictionary.entity.po.QCatalogPO;
import com.example.cyjdictionary.entity.po.QDictionaryPO;
import com.example.cyjdictionary.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020-09-13
 */
@Service
public class IndexServiceImpl extends BaseService implements IndexService {

        private IndexDao indexDao;

        @Autowired
        public void setIndexDao(IndexDao indexDao) {
                this.indexDao = indexDao;
        }

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

        @Override
        public Page<CatalogPO> findAllByCatalogNameContainsOrCatalogValueContains(String catalogName,
                                                                                  String catalogValue,
                                                                                  Integer pageNumber,
                                                                                  Integer pageSize,
                                                                                  String sortCode) {
                Sort sort = Sort.by(sortCode);
                Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
                return indexDao.findAllByCatalogNameContainsOrCatalogValueContains(catalogName, catalogValue, pageable);
        }

}
