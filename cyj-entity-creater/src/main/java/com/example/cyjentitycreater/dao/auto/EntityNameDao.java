package com.example.cyjentitycreater.dao.auto;

import com.example.cyjentitycreater.entity.auto.po.EntityNamePO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-02-02
 */
public interface EntityNameDao extends JpaRepository<EntityNamePO, String> {
}
