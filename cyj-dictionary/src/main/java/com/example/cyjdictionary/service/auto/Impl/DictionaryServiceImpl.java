package com.example.cyjdictionary.service.auto.Impl;

import com.example.cyjcommon.dao.DictionaryDao;
import com.example.cyjcommon.entity.po.CatalogPO;
import com.example.cyjcommon.entity.po.DictionaryPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjdictionary.service.auto.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
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
    public void deleteOne(DictionaryPO po) {
        dictionaryDao.delete(po);
    }

    @Override
    public DictionaryPO updateOne(DictionaryPO po) {
        return dictionaryDao.saveAndFlush(po);
    }

    @Override
    public Page<DictionaryPO> findAll(Integer pageNumber, CatalogPO catalog) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        DictionaryPO dictionaryPO = new DictionaryPO();
        dictionaryPO.setCatalog(catalog);
        Example<DictionaryPO> example = Example.of(dictionaryPO);
        return dictionaryDao.findAll(example, pageable);
    }

}
