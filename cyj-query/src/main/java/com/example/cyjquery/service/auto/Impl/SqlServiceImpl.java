package com.example.cyjquery.service.auto.Impl;

import com.example.cyjquery.dao.auto.SqlDao;
import com.example.cyjquery.entity.auto.po.SqlPO;
import com.example.cyjquery.entity.auto.po.QSqlPO;
import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjquery.service.auto.SqlService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
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
    public SqlPO addOne(SqlPO po) {
        return sqlDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        sqlDao.deleteById(id);
    }

    @Override
    public SqlPO updateOne(SqlPO po) {
        return sqlDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<SqlPO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QSqlPO.sqlPO)
                .where(QSqlPO.sqlPO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QSqlPO.sqlPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public SqlPO findOneById(String id) {
        return sqlDao.findById(id).orElse(null);
    }

}