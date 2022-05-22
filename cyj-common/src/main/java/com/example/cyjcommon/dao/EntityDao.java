package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.EntityPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface EntityDao extends JpaRepository<EntityPO, String> {

    List<EntityPO> findAllByEntity(EntityPO entity);

    List<EntityPO> findAllByAppService(AppServicePO appService);

}
