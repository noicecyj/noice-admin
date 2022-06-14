package com.example.cyjauth.service.auto;

import com.example.cyjcommon.dao.EntityDao;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.entity.Persistent;
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
    private EntityDao entityDao;

    @Autowired
    public void setDao(AuthorityDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setEntityDao(EntityDao entityDao) {
        this.entityDao = entityDao;
    }

    @Override
    public Authority addOne(Authority po) {
        if (po.getPersistentId() != null) {
            Persistent persistent = entityDao.getOne(po.getPersistentId());
            po.setPersistent(persistent);
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
            Persistent persistent = entityDao.getOne(po.getPersistentId());
            po.setPersistent(persistent);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Authority> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
