package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.PropertyPO;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author Noice
 * @version 1.0
 */
public interface EntityService {

    EntityPO addOne(EntityPO po);

    void deleteOne(EntityPO po);

    EntityPO updateOne(EntityPO po);

    Page<EntityPO> findAll(Integer pageNumber);

    List<EntityPO> findAllByEntity(EntityPO entity);

}
