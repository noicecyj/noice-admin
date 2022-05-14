package com.example.cyjquery.dao;

import com.example.cyjcommon.dao.SqlDao;
import com.example.cyjcommon.entity.po.SqlPO;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface SqlCustomDao extends SqlDao {

    SqlPO findBySqlDescription(String value);

}
