package com.example.cyjauth.service.auto;

import com.example.cyjcommon.dao.EnterpriseDao;
import com.example.cyjcommon.dao.RoleDao;
import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.entity.Enterprise;
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
public class UserService extends BaseService implements autoService<User> {

    private UserDao dao;
    private EnterpriseDao enterpriseDao;
    private RoleDao roleDao;

    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setEnterpriseDao(EnterpriseDao enterpriseDao) {
        this.enterpriseDao = enterpriseDao;
    }

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public User addOne(User po) {
        if (po.getEnterpriseId() != null) {
            Enterprise enterprise = enterpriseDao.getOne(po.getEnterpriseId());
            po.setEnterprise(enterprise);
        }
        return dao.save(po);
    }

    @Override
    public void deleteOne(User po) {
        dao.delete(po);
    }

    @Override
    public User updateOne(User po) {
        if (po.getEnterpriseId() != null) {
            Enterprise enterprise = enterpriseDao.getOne(po.getEnterpriseId());
            po.setEnterprise(enterprise);
        }
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<User> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    public Set<String> roleByUser(String id) {
        Set<String> roleIds = new HashSet<>();
        Optional<User> po = dao.findById(id);
        if (po.isPresent()) {
            Set<Role> roleSet = po.get().getRole();
            for (Role role : roleSet) {
                roleIds.add(role.getId());
            }
        }
        return roleIds;
    }

    public void roleSaveUser(String id, Set<String> roleIds) {
        Set<Role> roleSet = new HashSet<>();
        Optional<User> po = dao.findById(id);
        if (po.isPresent()) {
            for (String roleId : roleIds) {
                Role role = roleDao.getOne(roleId);
                roleSet.add(role);
            }
            po.get().setRole(roleSet);
            dao.save(po.get());
        }
    }

}
