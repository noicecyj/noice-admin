package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.po.EntityPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 * @version 1.0
 */
public interface EntityService {

    EntityPO addOne(EntityPO po);

    void deleteOne(EntityPO po);

    EntityPO updateOne(EntityPO po);

    Page<EntityPO> findAll(Integer pageNumber);

}
