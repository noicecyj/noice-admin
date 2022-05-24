package com.example.cyjauth.service.auto.Impl;

import com.example.cyjauth.service.auto.UserService;
import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.service.BaseService;
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
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends BaseService implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserPO addOne(UserPO po) {
        return userDao.save(po);
    }

    @Override
    public void deleteOne(UserPO po) {

    }

    @Override
    public UserPO updateOne(UserPO po) {
        return userDao.saveAndFlush(po);
    }

    @Override
    public Page<UserPO> findAll(Integer pageNumber) {
        return userDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    @Override
    public Page<UserPO> findAllByRoleList(Integer pageNumber, Set<RolePO> roleList) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        UserPO userPO = new UserPO();
        userPO.setRole(roleList);
        Example<UserPO> example = Example.of(userPO);
        return userDao.findAll(example, pageable);
    }

    @Override
    public Page<UserPO> findAllByAuthorityList(Integer pageNumber, Set<AuthorityPO> authorityList) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        UserPO userPO = new UserPO();
        userPO.setAuthority(authorityList);
        Example<UserPO> example = Example.of(userPO);
        return userDao.findAll(example, pageable);
    }

}
