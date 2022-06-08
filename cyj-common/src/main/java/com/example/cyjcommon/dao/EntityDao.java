package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface EntityDao extends JpaRepository<Entity, String> {

    List<Entity> findByEntityParentOrderBySortCode(Entity entity);

    List<Entity> findByAppServiceOrderBySortCode(AppService appService);

}
