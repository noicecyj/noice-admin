package com.example.cyjauth.service.auto;

import com.example.cyjcommon.dao.AppServiceDao;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.EntityDao;
import com.example.cyjcommon.dao.RoleDao;
import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Authority;
import com.example.cyjcommon.entity.Entity;
import com.example.cyjcommon.entity.Role;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.service.autoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityService extends BaseService implements autoService<Authority> {

    private AuthorityDao dao;
    private AppServiceDao appServiceDao;
    private EntityDao entityDao;

    @Autowired
    public void setDao(AuthorityDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setAppServiceDao(AppServiceDao appServiceDao) {
        this.appServiceDao = appServiceDao;
    }

    @Autowired
    public void setEntityDao(EntityDao entityDao) {
        this.entityDao = entityDao;
    }

    @Override
    public Authority addOne(Authority po) {
        if (po.getAppServiceId() != null) {
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        if (po.getEntityId() != null) {
            Entity entity = entityDao.getOne(po.getEntityId());
            po.setEntity(entity);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(Authority po) {
        dao.delete(po);
    }

    @Override
    public Authority updateOne(Authority po) {
        if (po.getAppServiceId() != null) {
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        if (po.getEntityId() != null) {
            Entity entity = entityDao.getOne(po.getEntityId());
            po.setEntity(entity);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Authority> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
