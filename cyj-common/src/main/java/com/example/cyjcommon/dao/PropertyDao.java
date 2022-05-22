package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.PropertyPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface PropertyDao extends JpaRepository<PropertyPO, String> {

    List<PropertyPO> findAllByEntity(EntityPO entity);

}
