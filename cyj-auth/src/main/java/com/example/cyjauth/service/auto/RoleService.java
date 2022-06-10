package com.example.cyjauth.service.auto;

import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.RoleDao;
import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.entity.Authority;
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
public class RoleService extends BaseService implements autoService<Role> {

    private RoleDao dao;
    private AuthorityDao authorityDao;

    @Autowired
    public void setDao(RoleDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    @Override
    public Role addOne(Role po) {
        return dao.save(po);
    }

    @Override
    public void deleteOne(Role po) {
        dao.delete(po);
    }

    @Override
    public Role updateOne(Role po) {
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Role> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    public Set<String> authorityByRole(String roleId) {
        Set<String> authorityIds = new HashSet<>();
        Optional<Role> role = dao.findById(roleId);
        if (role.isPresent()) {
            Set<Authority> authoritySet = role.get().getAuthority();
            for (Authority authority : authoritySet) {
                authorityIds.add(authority.getId());
            }
        }
        return authorityIds;
    }

    public void authoritySaveRole(String roleId, Set<String> authorityIds) {
        Set<Authority> authoritySet = new HashSet<>();
        Optional<Role> role = dao.findById(roleId);
        if (role.isPresent()) {
            for (String authorityId : authorityIds) {
                Authority authority = authorityDao.getOne(authorityId);
                authoritySet.add(authority);
            }
            role.get().setAuthority(authoritySet);
            dao.save(role.get());
        }
    }

}
