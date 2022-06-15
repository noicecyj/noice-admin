package com.example.cyjauth.service.auto;

import com.example.cyjcommon.dao.PersistentDao;
import com.example.cyjcommon.dao.AppServiceDao;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Authority;
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
public class AuthorityService extends BaseService implements autoService<Authority> {

    private AuthorityDao dao;
    private PersistentDao persistentDao;
    private AppServiceDao appServiceDao;

    @Autowired
    public void setDao(AuthorityDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setPersistentDao(PersistentDao persistentDao) {
        this.persistentDao = persistentDao;
    }

    @Autowired
    public void setAppServiceDao(AppServiceDao appServiceDao) {
        this.appServiceDao = appServiceDao;
    }

    @Override
    public Authority addOne(Authority po) {
        if (po.getPersistentId() != null) {
            Persistent persistent = persistentDao.getOne(po.getPersistentId());
            po.setPersistent(persistent);
        }
        if (po.getAppServiceId() != null) {
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(Authority po) {
        dao.delete(po);
    }

    @Override
    public Authority updateOne(Authority po) {
        if (po.getPersistentId() != null) {
            Persistent persistent = persistentDao.getOne(po.getPersistentId());
            po.setPersistent(persistent);
        }
        if (po.getAppServiceId() != null) {
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Authority> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
