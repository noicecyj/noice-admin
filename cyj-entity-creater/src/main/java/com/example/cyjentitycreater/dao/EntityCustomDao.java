package com.example.cyjentitycreater.dao;

import com.example.cyjcommon.entity.EntityPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
public interface EntityCustomDao extends JpaRepository<EntityPO, String> {

    List<EntityPO> findEntityPOByPid(String pid);

}
