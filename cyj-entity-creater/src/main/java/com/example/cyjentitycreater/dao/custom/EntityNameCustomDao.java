package com.example.cyjentitycreater.dao.custom;

import com.example.cyjentitycreater.entity.auto.po.EntityNamePO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
public interface EntityNameCustomDao extends JpaRepository<EntityNamePO, String> {

    EntityNamePO findEntityNamePOByEntityCodeAndEntityType(String entityCode, String entityType);

}
