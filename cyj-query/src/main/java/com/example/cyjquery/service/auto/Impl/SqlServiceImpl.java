package com.example.cyjquery.service.auto.Impl;

import com.example.cyjcommon.dao.SqlDao;
import com.example.cyjcommon.entity.Sql;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjquery.service.auto.SqlService;
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
public class SqlServiceImpl extends BaseService implements SqlService {

    private SqlDao sqlDao;

    @Autowired
    public void setSqlDao(SqlDao sqlDao) {
        this.sqlDao = sqlDao;
    }

    @Override
    public Sql addOne(Sql po) {
        return sqlDao.save(po);
    }

    @Override
    public void deleteOne(Sql po) {
        sqlDao.delete(po);
    }

    @Override
    public Sql updateOne(Sql po) {
        return sqlDao.saveAndFlush(po);
    }

    @Override
    public Page<Sql> findAll(Integer pageNumber) {
        return sqlDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
