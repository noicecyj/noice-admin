package com.example.cyjauth.service.auto.Impl;

import com.example.cyjauth.service.auto.RoleService;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.RoleDao;
import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.entity.Role;
import com.example.cyjcommon.entity.User;
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
public class RoleServiceImpl extends BaseService implements autoService<Role>, RoleService {

    private RoleDao roleDao;
    private UserDao userDao;

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Role addOne(Role po) {
        return roleDao.save(po);
    }

    @Override
    public void deleteOne(Role po) {
        roleDao.delete(po);
    }

    @Override
    public Role updateOne(Role po) {
        return roleDao.saveAndFlush(po);
    }

    @Override
    public Page<Role> findAll(Integer pageNumber) {
        return roleDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    @Override
    public Set<String> roleByUser(String userId) {
        Set<String> roleIds = new HashSet<>();
        Optional<User> user = userDao.findById(userId);
        if (user.isPresent()) {
            Set<Role> roleSet = user.get().getRole();
            for (Role role : roleSet) {
                roleIds.add(role.getId());
            }
        }
        return roleIds;
    }

    @Override
    public void roleSaveUser(String userId, Set<String> roleIds) {
        Set<Role> roleSet = new HashSet<>();
        Optional<User> user = userDao.findById(userId);
        if (user.isPresent()) {
            for (String roleId : roleIds) {
                Role role = roleDao.getOne(roleId);
                roleSet.add(role);
            }
            user.get().setRole(roleSet);
            userDao.save(user.get());
        }
    }

}
