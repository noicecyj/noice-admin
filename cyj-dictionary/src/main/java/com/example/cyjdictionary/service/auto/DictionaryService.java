package com.example.cyjdictionary.service.auto;

import com.example.cyjcommon.dao.CatalogDao;
import com.example.cyjcommon.dao.DictionaryDao;
import com.example.cyjcommon.entity.Catalog;
import com.example.cyjcommon.entity.Dictionary;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.service.autoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DictionaryService extends BaseService implements autoService<Dictionary> {

    private DictionaryDao dao;
    private CatalogDao catalogDao;

    @Autowired
    public void setDao(DictionaryDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setCatalogDao(CatalogDao catalogDao) {
        this.catalogDao = catalogDao;
    }

    @Override
    public Dictionary addOne(Dictionary po) {
        if (po.getCatalogId() != null) {
            Catalog catalog = catalogDao.getOne(po.getCatalogId());
            po.setCatalog(catalog);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(Dictionary po) {
        dao.delete(po);
    }

    @Override
    public Dictionary updateOne(Dictionary po) {
        if (po.getCatalogId() != null) {
            Catalog catalog = catalogDao.getOne(po.getCatalogId());
            po.setCatalog(catalog);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Dictionary> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

}
