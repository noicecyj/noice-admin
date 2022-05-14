package com.example.cyjauth.service.custom.Impl;

import com.example.cyjauth.dao.AuthorityCustomDao;
import com.example.cyjauth.dao.RoleCustomDao;
import com.example.cyjauth.entity.po.AuthorityCustomPO;
import com.example.cyjauth.entity.po.RoleCustomPO;
import com.example.cyjauth.service.custom.RoleCustomService;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.RoleDao;
import com.example.cyjcommon.entity.AuthorityPO;
import com.example.cyjcommon.entity.RolePO;
import com.example.cyjcommon.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleCustomServiceImpl extends BaseService implements RoleCustomService {

    private RoleDao roleDao;
    private AuthorityDao authorityDao;

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }
    @Autowired
    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    @Override
    public Set<String> getRoleAuthority(String roleId) {
        Optional<RolePO> rolePOOptional = roleDao.findById(roleId);
        if (rolePOOptional.isPresent()) {
            RolePO rolePO = rolePOOptional.get();
            Set<String> authorityIds = new HashSet<>();
            if (rolePO.getAuthority() != null) {
                for (AuthorityPO authorityPO : rolePO.getAuthority()) {
                    authorityIds.add(authorityPO.getId());
                }
            }
            return authorityIds;
        }
        return null;
    }

    @Override
    public void setRoleAuthority(String roleId, Set<String> authorityIds) {
        Optional<RolePO> rolePOOptional = roleDao.findById(roleId);
        if (rolePOOptional.isPresent()) {
            RolePO rolePO = rolePOOptional.get();
            Set<AuthorityPO> authorityPOSet = new HashSet<>();
            for (String authorityId : authorityIds) {
                Optional<AuthorityPO> authorityPOOptional = authorityDao.findById(authorityId);
                if (authorityPOOptional.isPresent()) {
                    AuthorityPO authorityPO = authorityPOOptional.get();
                    authorityPOSet.add(authorityPO);
                }
            }
            rolePO.setAuthority(authorityPOSet);
            roleDao.saveAndFlush(rolePO);
        }
    }
}
