package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.EntityPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface EntityService {

    EntityPO addOne(EntityPO po);

    void deleteOne(EntityPO po);

    EntityPO updateOne(EntityPO po);

    Page<EntityPO> findAll(Integer pageNumber);

    Page<EntityPO> findAll(Integer pageNumber, EntityPO entity);

    Page<EntityPO> findAll(Integer pageNumber, AppServicePO appService);

}
