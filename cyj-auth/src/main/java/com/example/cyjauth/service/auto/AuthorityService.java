package com.example.cyjauth.service.auto;

import com.example.cyjcommon.dao.AppServiceDao;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.EntityDao;
import com.example.cyjcommon.dao.RoleDao;
import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Authority;
import com.example.cyjcommon.entity.Entity;
import com.example.cyjcommon.entity.Role;
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
public class AuthorityService extends BaseService implements autoService<Authority> {

    private AuthorityDao authorityDao;
    private AppServiceDao appServiceDao;
    private EntityDao entityDao;
    private RoleDao roleDao;

    @Autowired
    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    @Autowired
    public void setAppServiceDao(AppServiceDao appServiceDao) {
        this.appServiceDao = appServiceDao;
    }

    @Autowired
    public void setEntityDao(EntityDao entityDao) {
        this.entityDao = entityDao;
    }

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Authority addOne(Authority po) {
        if (po.getAppServiceId() != null) {
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        if (po.getEntityId() != null) {
            Entity entity = entityDao.getOne(po.getEntityId());
            po.setEntity(entity);
        }
        return authorityDao.save(po);
    }

    @Override
    public void deleteOne(Authority po) {
        authorityDao.delete(po);
    }

    @Override
    public Authority updateOne(Authority po) {
        if (po.getAppServiceId() != null) {
            AppService appService = appServiceDao.getOne(po.getAppServiceId());
            po.setAppService(appService);
        }
        if (po.getEntityId() != null) {
            Entity entity = entityDao.getOne(po.getEntityId());
            po.setEntity(entity);
        }
        return authorityDao.saveAndFlush(po);
    }

    @Override
    public Page<Authority> findAll(Integer pageNumber) {
        return authorityDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    public Set<String> authorityByRole(String roleId) {
        Set<String> authorityIds = new HashSet<>();
        Optional<Role> role = roleDao.findById(roleId);
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
        Optional<Role> role = roleDao.findById(roleId);
        if (role.isPresent()) {
            for (String authorityId : authorityIds) {
                Authority authority = authorityDao.getOne(authorityId);
                authoritySet.add(authority);
            }
            role.get().setAuthority(authoritySet);
            roleDao.save(role.get());
        }
    }

}
