package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.AppServicePO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 */
public interface AppServiceDao extends JpaRepository<AppServicePO, String> {

}
