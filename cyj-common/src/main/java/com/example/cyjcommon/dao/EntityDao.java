package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Persistent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface EntityDao extends JpaRepository<Persistent, String> {

    List<Persistent> findByEntityParentOrderBySortCode(Persistent persistent);

    List<Persistent> findByAppServiceOrderBySortCode(AppService appService);

}
