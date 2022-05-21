package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.PropertyPO;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface PropertyService {

    PropertyPO addOne(PropertyPO po);

    void deleteOne(PropertyPO po);

    PropertyPO updateOne(PropertyPO po);

    Page<PropertyPO> findAll(Integer pageNumber, EntityPO entity);

    List<PropertyPO> findAllByEntity(EntityPO entity);

}
