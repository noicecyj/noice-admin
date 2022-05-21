package com.example.cyjquery.service.auto;

import com.example.cyjcommon.entity.po.SqlPO;
import com.querydsl.core.QueryResults;

/**
 * @author Noice
 * @version 1.0
 */
public interface SqlService {

    SqlPO addOne(SqlPO po);

    void deleteOne(String id);

    SqlPO updateOne(SqlPO po);

    QueryResults<SqlPO> findAll(Integer pageNumber);

    SqlPO findOneById(String id);

}
