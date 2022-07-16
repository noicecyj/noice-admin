package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.AppServiceDao;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.PropertyDao;
import com.example.cyjcommon.dao.PersistentDao;
import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Authority;
import com.example.cyjcommon.entity.Property;
import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.service.autoService;
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
public class PersistentService extends BaseService implements autoService<Persistent> {

    private PersistentDao dao;
    private AppServiceDao appServiceDao;
    private AuthorityDao authorityDao;
    private PropertyDao propertyDao;

    @Autowired
    public void setDao(PersistentDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setAppServiceDao(AppServiceDao appServiceDao) {
        this.appServiceDao = appServiceDao;
    }

    @Autowired
    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    @Autowired
    public void setPropertyDao(PropertyDao propertyDao) {
        this.propertyDao = propertyDao;
    }

    @Override
    public Persistent addOne(Persistent po) {
        if (po.getAppServiceId() != null) {
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(Persistent po) {
        dao.delete(po);
    }

    @Override
    public Persistent updateOne(Persistent po) {
        if (po.getAppServiceId() != null) {
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Persistent> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

    public Page<Authority> pageAuthorityByPersistent(Integer pageNumber, String id) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
        Persistent po = dao.getOne(id);
        Authority authority = new Authority();
        authority.setPersistent(po);
        Example<Authority> example = Example.of(authority);
        return authorityDao.findAll(example, pageable);
    }

    public Page<Property> pagePropertyByPersistent(Integer pageNumber, String id) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
        Persistent po = dao.getOne(id);
        Property property = new Property();
        property.setPersistent(po);
        Example<Property> example = Example.of(property);
        return propertyDao.findAll(example, pageable);
    }

}
