package com.example.cyjquery.dao.custom;

import com.example.cyjquery.entity.auto.po.SqlPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface SqlCustomDao extends JpaRepository<SqlPO, String> {

    SqlPO findBySqlDescription(String value);

}
