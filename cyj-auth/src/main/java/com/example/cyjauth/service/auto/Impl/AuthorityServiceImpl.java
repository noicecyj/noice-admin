package com.example.cyjauth.service.auto.Impl;

import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjauth.service.auto.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityServiceImpl extends BaseService implements AuthorityService {

    private AuthorityDao authorityDao;

    @Autowired
    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    @Override
    public AuthorityPO addOne(AuthorityPO po) {
        return authorityDao.save(po);
    }

    @Override
    public void deleteOne(AuthorityPO po) {
        authorityDao.delete(po);
    }

    @Override
    public AuthorityPO updateOne(AuthorityPO po) {
        return authorityDao.saveAndFlush(po);
    }

    @Override
    public Page<AuthorityPO> findAll(Integer pageNumber) {
        return authorityDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    @Override
    public Page<AuthorityPO> findAll(Integer pageNumber, AppServicePO appService) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        AuthorityPO authorityPO = new AuthorityPO();
        authorityPO.setAppService(appService);
        Example<AuthorityPO> example = Example.of(authorityPO);
        return authorityDao.findAll(example, pageable);
    }

    @Override
    public Page<AuthorityPO> findAll(Integer pageNumber, EntityPO entity) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        AuthorityPO authorityPO = new AuthorityPO();
        authorityPO.setEntity(entity);
        Example<AuthorityPO> example = Example.of(authorityPO);
        return authorityDao.findAll(example, pageable);
    }

    @Override
    public Page<AuthorityPO> findAllByUserList(Integer pageNumber, Set<UserPO> userList) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        AuthorityPO authorityPO = new AuthorityPO();
        authorityPO.setUser(userList);
        Example<AuthorityPO> example = Example.of(authorityPO);
        return authorityDao.findAll(example, pageable);
    }

    @Override
    public Page<AuthorityPO> findAllByRoleList(Integer pageNumber, Set<RolePO> roleList) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        AuthorityPO authorityPO = new AuthorityPO();
        authorityPO.setRole(roleList);
        Example<AuthorityPO> example = Example.of(authorityPO);
        return authorityDao.findAll(example, pageable);
    }

}
