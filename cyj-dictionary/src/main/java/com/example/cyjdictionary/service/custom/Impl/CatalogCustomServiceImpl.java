package com.example.cyjdictionary.service.custom.Impl;

import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjdictionary.dao.auto.CatalogDao;
import com.example.cyjdictionary.entity.auto.po.CatalogPO;
import com.example.cyjdictionary.service.custom.CatalogCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CatalogCustomServiceImpl extends BaseService implements CatalogCustomService {

        private CatalogDao catalogDao;

        @Autowired
        public void setCatalogDao(CatalogDao catalogDao) {
                this.catalogDao = catalogDao;
        }

        @Override
        public Page<CatalogPO> findAllByCatalogNameContainsOrCatalogValueContains(String catalogName,
                                                                                  String catalogValue,
                                                                                  Integer pageNumber,
                                                                                  Integer pageSize,
                                                                                  String sortCode) {
                Sort sort = Sort.by(sortCode);
                Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
                return catalogDao.findAllByCatalogNameContainsOrCatalogValueContains(catalogName, catalogValue, pageable);
        }

}
