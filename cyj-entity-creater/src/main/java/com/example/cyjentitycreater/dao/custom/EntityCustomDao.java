package com.example.cyjentitycreater.dao.custom;

import com.example.cyjentitycreater.entity.auto.po.EntityPO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
public interface EntityCustomDao extends JpaRepository<EntityPO, String> {

        @Operation(summary = "删除实体")
        void deleteByPid(String pid);

}
