package com.example.cyjauth.service.auto.Impl;

import com.example.cyjauth.service.auto.UserService;
import com.example.cyjcommon.dao.EnterpriseDao;
import com.example.cyjcommon.dao.RoleDao;
import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.entity.Authority;
import com.example.cyjcommon.entity.Enterprise;
import com.example.cyjcommon.entity.Role;
import com.example.cyjcommon.entity.User;
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

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends BaseService implements autoService<User>, UserService {

    private UserDao userDao;
    private EnterpriseDao enterpriseDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setEnterpriseDao(EnterpriseDao enterpriseDao) {
        this.enterpriseDao = enterpriseDao;
    }

    @Override
    public User addOne(User po) {
        if (po.getEnterpriseId() != null) {
            Enterprise enterprise = enterpriseDao.getOne(po.getEnterpriseId());
            po.setEnterprise(enterprise);
        }
        return userDao.save(po);
    }

    @Override
    public void deleteOne(User po) {
        userDao.delete(po);
    }

    @Override
    public User updateOne(User po) {
        if (po.getEnterpriseId() != null) {
            Enterprise enterprise = enterpriseDao.getOne(po.getEnterpriseId());
            po.setEnterprise(enterprise);
        }
        return userDao.saveAndFlush(po);
    }

    @Override
    public Page<User> findAll(Integer pageNumber) {
        return userDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    @Override
    public Page<User> findAll(Integer pageNumber, Enterprise enterprise) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        User user = new User();
        user.setEnterprise(enterprise);
        Example<User> example = Example.of(user);
        return userDao.findAll(example, pageable);
    }



}
