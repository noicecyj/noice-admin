package com.example.cyjdictionary.service.auto.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjdictionary.dao.auto.DictionaryDao;
import com.example.cyjdictionary.entity.auto.po.QDictionaryPO;
import com.example.cyjdictionary.entity.auto.po.DictionaryPO;
import com.example.cyjdictionary.service.auto.DictionaryService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
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
    public QueryResults<DictionaryPO> findAll(Integer pageNumber, String pid) {
        return queryFactory
                .selectFrom(QDictionaryPO.dictionaryPO)
                .where(QDictionaryPO.dictionaryPO.pid.eq(pid).and(QDictionaryPO.dictionaryPO.sortCode.isNotNull()))
                .offset((pageNumber - 1) * 10L)
                .orderBy(QDictionaryPO.dictionaryPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public DictionaryPO findOneById(String id) {
        return dictionaryDao.findById(id).orElse(null);
    }

    @Override
    public List<DictionaryPO> findListByPid(String id) {
        return queryFactory
                .selectFrom(QDictionaryPO.dictionaryPO)
                .where(QDictionaryPO.dictionaryPO.pid.eq(id))
                .fetch();
    }

}
