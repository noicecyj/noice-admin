package com.example.cyjauth.service.auto.Impl;

import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.RoleDao;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjauth.service.auto.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleServiceImpl extends BaseService implements RoleService {

    private RoleDao roleDao;
    private UserDao userDao;
    private AuthorityDao authorityDao;

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    @Override
    public RolePO addOne(RolePO po) {
        return roleDao.save(po);
    }

    @Override
    public void deleteOne(RolePO po) {
        roleDao.delete(po);
    }

    @Override
    public RolePO updateOne(RolePO po) {
        return roleDao.saveAndFlush(po);
    }

    @Override
    public Page<RolePO> findAll(Integer pageNumber) {
        return roleDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    @Override
    public Page<RolePO> findAllByUserList(Integer pageNumber, Set<String> userList) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        RolePO rolePO = new RolePO();
        rolePO.setUser(new HashSet<>(userDao.findAllById(userList)));
        Example<RolePO> example = Example.of(rolePO);
        return roleDao.findAll(example, pageable);
    }

    @Override
    public Page<RolePO> findAllByAuthorityList(Integer pageNumber, Set<String> authorityList) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        RolePO rolePO = new RolePO();
        rolePO.setAuthority(new HashSet<>(authorityDao.findAllById(authorityList)));
        Example<RolePO> example = Example.of(rolePO);
        return roleDao.findAll(example, pageable);
    }

}
