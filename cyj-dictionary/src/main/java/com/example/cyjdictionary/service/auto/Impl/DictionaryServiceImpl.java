package com.example.cyjdictionary.service.auto.Impl;

import com.example.cyjcommon.dao.DictionaryDao;
import com.example.cyjcommon.entity.Catalog;
import com.example.cyjcommon.entity.Dictionary;
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
    public Dictionary addOne(Dictionary po) {
        return dictionaryDao.save(po);
    }

    @Override
    public void deleteOne(Dictionary po) {
        dictionaryDao.delete(po);
    }

    @Override
    public Dictionary updateOne(Dictionary po) {
        return dictionaryDao.saveAndFlush(po);
    }

    @Override
    public Page<Dictionary> findAll(Integer pageNumber) {
        return dictionaryDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    @Override
    public Page<Dictionary> findAll(Integer pageNumber, Catalog catalog) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        Dictionary dictionary = new Dictionary();
        dictionary.setCatalog(catalog);
        Example<Dictionary> example = Example.of(dictionary);
        return dictionaryDao.findAll(example, pageable);
    }

}
