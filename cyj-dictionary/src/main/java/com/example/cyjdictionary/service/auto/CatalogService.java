package com.example.cyjdictionary.service.auto;

import com.example.cyjcommon.dao.DictionaryDao;
import com.example.cyjcommon.dao.CatalogDao;
import com.example.cyjcommon.entity.Dictionary;
import com.example.cyjcommon.entity.Catalog;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.service.autoService;
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
public class CatalogService extends BaseService implements autoService<Catalog> {

    private CatalogDao dao;
    private DictionaryDao dictionaryDao;

    @Autowired
    public void setDao(CatalogDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setDictionaryDao(DictionaryDao dictionaryDao) {
        this.dictionaryDao = dictionaryDao;
    }

    @Override
    public Catalog addOne(Catalog po) {
        return dao.save(po);
    }

    @Override
    public void deleteOne(Catalog po) {
        dao.delete(po);
    }

    @Override
    public Catalog updateOne(Catalog po) {
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Catalog> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    public Page<Dictionary> pageDictionaryByCatalog(Integer pageNumber, String id) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        Catalog po = dao.getOne(id);
        Dictionary dictionary = new Dictionary();
        dictionary.setCatalog(po);
        Example<Dictionary> example = Example.of(dictionary);
        return dictionaryDao.findAll(example, pageable);
    }

}
