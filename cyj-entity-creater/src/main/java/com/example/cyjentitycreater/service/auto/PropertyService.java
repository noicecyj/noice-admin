package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.PropertyPO;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 * @version 1.0
 */
public interface PropertyService {

    PropertyPO addOne(PropertyPO po);

    void deleteOne(PropertyPO po);

    PropertyPO updateOne(PropertyPO po);

    Page<PropertyPO> findAll(Integer pageNumber, EntityPO entity);

}
