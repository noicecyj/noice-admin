package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.PersistentDao;
import com.example.cyjcommon.dao.PropertyDao;
import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.entity.Property;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.service.autoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PropertyService extends BaseService implements autoService<Property> {

    private PropertyDao dao;
    private PersistentDao persistentDao;

    @Autowired
    public void setDao(PropertyDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setPersistentDao(PersistentDao persistentDao) {
        this.persistentDao = persistentDao;
    }

    @Override
    public Property addOne(Property po) {
        if (po.getPersistentId() != null) {
            Persistent persistent = persistentDao.getOne(po.getPersistentId());
            po.setPersistent(persistent);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(Property po) {
        dao.delete(po);
    }

    @Override
    public Property updateOne(Property po) {
        if (po.getPersistentId() != null) {
            Persistent persistent = persistentDao.getOne(po.getPersistentId());
            po.setPersistent(persistent);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Property> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

}
