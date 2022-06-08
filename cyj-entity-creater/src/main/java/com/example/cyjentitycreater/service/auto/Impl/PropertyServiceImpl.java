package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.dao.PropertyDao;
import com.example.cyjcommon.entity.Entity;
import com.example.cyjcommon.entity.Property;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.auto.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PropertyServiceImpl extends BaseService implements PropertyService {

    private PropertyDao propertyDao;

    @Autowired
    public void setPropertyDao(PropertyDao propertyDao) {
        this.propertyDao = propertyDao;
    }

    @Override
    public Property addOne(Property po) {
        return propertyDao.save(po);
    }

    @Override
    public void deleteOne(Property po) {
        propertyDao.delete(po);
    }

    @Override
    public Property updateOne(Property po) {
        return propertyDao.saveAndFlush(po);
    }

    @Override
    public Page<Property> findAll(Integer pageNumber) {
        return propertyDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    @Override
    public Page<Property> findAll(Integer pageNumber, Entity entity) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        Property property = new Property();
        property.setEntity(entity);
        Example<Property> example = Example.of(property);
        return propertyDao.findAll(example, pageable);
    }

}
