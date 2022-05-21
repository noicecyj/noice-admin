package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.PropertyPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface EntityDao extends JpaRepository<EntityPO, String> {

    List<EntityPO> findAllByEntity(EntityPO entity);

}
