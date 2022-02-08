package com.example.cyjquery.dao.auto;

import com.example.cyjquery.entity.auto.po.SqlPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-08
 */
public interface SqlDao extends JpaRepository<SqlPO, String> {
}
