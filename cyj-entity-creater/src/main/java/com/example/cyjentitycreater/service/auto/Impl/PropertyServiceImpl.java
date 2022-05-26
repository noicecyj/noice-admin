package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.dao.PropertyDao;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.PropertyPO;
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
    public PropertyPO addOne(PropertyPO po) {
        return propertyDao.save(po);
    }

    @Override
    public void deleteOne(PropertyPO po) {
        propertyDao.delete(po);
    }

    @Override
    public PropertyPO updateOne(PropertyPO po) {
        return propertyDao.saveAndFlush(po);
    }

    @Override
    public Page<PropertyPO> findAll(Integer pageNumber) {
        return propertyDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    @Override
    public Page<PropertyPO> findAll(Integer pageNumber, EntityPO entity) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        PropertyPO propertyPO = new PropertyPO();
        propertyPO.setEntity(entity);
        Example<PropertyPO> example = Example.of(propertyPO);
        return propertyDao.findAll(example, pageable);
    }

}
