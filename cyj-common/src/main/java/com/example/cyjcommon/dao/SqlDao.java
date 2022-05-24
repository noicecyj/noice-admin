package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.SqlPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 */
public interface SqlDao extends JpaRepository<SqlPO, String> {

}
