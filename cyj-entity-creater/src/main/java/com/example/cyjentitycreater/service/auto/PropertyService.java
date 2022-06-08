package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.entity.Entity;
import com.example.cyjcommon.entity.Property;
import org.springframework.data.domain.Page;

/**
 * @author Noice
 */
public interface PropertyService {

    Property addOne(Property po);

    void deleteOne(Property po);

    Property updateOne(Property po);

    Page<Property> findAll(Integer pageNumber);

    Page<Property> findAll(Integer pageNumber, Entity entity);

}
