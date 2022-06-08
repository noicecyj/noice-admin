package com.example.cyjdictionary.service.auto.Impl;

import com.example.cyjcommon.dao.DictionaryDao;
import com.example.cyjcommon.dao.CatalogDao;
import com.example.cyjcommon.entity.Catalog;
import com.example.cyjcommon.entity.Dictionary;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjdictionary.service.auto.DictionaryService;
import com.example.cyjdictionary.service.auto.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CatalogServiceImpl extends BaseService implements CatalogService {

    private CatalogDao catalogDao;
    private DictionaryDao dictionaryDao;
    private DictionaryService dictionaryService;

    @Autowired
    public void setCatalogDao(CatalogDao catalogDao) {
        this.catalogDao = catalogDao;
    }

    @Autowired
    public void setDictionaryDao(DictionaryDao dictionaryDao) {
        this.dictionaryDao = dictionaryDao;
    }

    @Autowired
    public void setDictionaryService(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @Override
    public Catalog addOne(Catalog po) {
        return catalogDao.save(po);
    }

    @Override
    public void deleteOne(Catalog po) {
        List<Dictionary> dictionaryList = dictionaryDao.findByCatalogOrderBySortCode(po);
        for (Dictionary dictionary : dictionaryList) {
            dictionaryService.deleteOne(dictionary);
        }
        catalogDao.delete(po);
    }

    @Override
    public Catalog updateOne(Catalog po) {
        return catalogDao.saveAndFlush(po);
    }

    @Override
    public Page<Catalog> findAll(Integer pageNumber) {
        return catalogDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
