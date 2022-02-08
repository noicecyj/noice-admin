package com.example.cyjquery.service.auto;

import com.example.cyjquery.entity.auto.po.SqlPO;
import com.querydsl.core.QueryResults;
/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-08
 */
public interface SqlService {

    SqlPO addOne(SqlPO po);
    void deleteOne(String id);
    SqlPO updateOne(SqlPO po);
    QueryResults<SqlPO> findAll(Integer pageNumber);
    SqlPO findOneById(String id);

}
