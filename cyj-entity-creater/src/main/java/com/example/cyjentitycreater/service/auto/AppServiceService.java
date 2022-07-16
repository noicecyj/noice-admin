package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.PersistentDao;
import com.example.cyjcommon.dao.AppServiceDao;
import com.example.cyjcommon.entity.Authority;
import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.entity.AppService;
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
public class AppServiceService extends BaseService implements autoService<AppService> {

    private AppServiceDao dao;
    private AuthorityDao authorityDao;
    private PersistentDao persistentDao;

    @Autowired
    public void setDao(AppServiceDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    @Autowired
    public void setPersistentDao(PersistentDao persistentDao) {
        this.persistentDao = persistentDao;
    }

    @Override
    public AppService addOne(AppService po) {
        return dao.save(po);
    }

    @Override
    public void deleteOne(AppService po) {
        dao.delete(po);
    }

    @Override
    public AppService updateOne(AppService po) {
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<AppService> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

    public Page<Authority> pageAuthorityByAppService(Integer pageNumber, String id) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
        AppService po = dao.getOne(id);
        Authority authority = new Authority();
        authority.setAppService(po);
        Example<Authority> example = Example.of(authority);
        return authorityDao.findAll(example, pageable);
    }

    public Page<Persistent> pagePersistentByAppService(Integer pageNumber, String id) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
        AppService po = dao.getOne(id);
        Persistent persistent = new Persistent();
        persistent.setAppService(po);
        Example<Persistent> example = Example.of(persistent);
        return persistentDao.findAll(example, pageable);
    }

}
