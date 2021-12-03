package com.example.cyjdictionary.service.Impl;

import com.example.cyjcommon.utils.CommonUtils;
import com.example.cyjdictionary.dao.DictionaryDao;
import com.example.cyjdictionary.entity.po.DictionaryPO;
import com.example.cyjdictionary.entity.po.QCatalogPO;
import com.example.cyjdictionary.entity.po.QDictionaryPO;
import com.example.cyjdictionary.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-02-02
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DictionaryServiceImpl extends BaseService implements DictionaryService {

        private DictionaryDao dictionaryDao;

        @Autowired
        public void setDictionaryDao(DictionaryDao dictionaryDao) {
                this.dictionaryDao = dictionaryDao;
        }

        @Override
        public DictionaryPO addOne(DictionaryPO po) {
                return dictionaryDao.save(po);
        }

        @Override
        public void deleteOne(String id) {
                dictionaryDao.deleteById(id);
        }

        @Override
        public DictionaryPO updateOne(DictionaryPO po) {
                return dictionaryDao.saveAndFlush(po);
        }

        @Override
        public Page<DictionaryPO> findAll(String id, Integer pageNumber, Integer pageSize, String sortCode) {
                Sort sort = Sort.by(sortCode);
                Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, sort);
                List<DictionaryPO> poList = findListById(id);
                List<DictionaryPO> poPage = CommonUtils.page(poList, pageSize, pageNumber);
                return new PageImpl<>(poPage, pageable, poList.size());
        }

        @Override
        public List<DictionaryPO> findListById(String id) {
                QDictionaryPO qDictionaryPO = QDictionaryPO.dictionaryPO;
                QCatalogPO qCatalogPO = QCatalogPO.catalogPO;
                return queryFactory.selectFrom(qDictionaryPO)
                        .innerJoin(qCatalogPO)
                        .on(qDictionaryPO.pid.eq(qCatalogPO.id))
                        .where(qCatalogPO.id.eq(id))
                        .orderBy(qDictionaryPO.sortCode.asc()).fetch();
        }

        @Override
        public DictionaryPO findOneById(String id) {
                if (dictionaryDao.findById(id).isPresent()) {
                        return dictionaryDao.findById(id).get();
                }
                return null;
        }

}
