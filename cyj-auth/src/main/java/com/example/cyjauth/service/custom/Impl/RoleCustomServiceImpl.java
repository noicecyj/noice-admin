package com.example.cyjauth.service.custom.Impl;

import com.example.cyjauth.dao.custom.AuthorityCustomDao;
import com.example.cyjauth.dao.custom.RoleCustomDao;
import com.example.cyjauth.entity.custom.po.AuthorityCustomPO;
import com.example.cyjauth.entity.custom.po.RoleCustomPO;
import com.example.cyjauth.service.custom.RoleCustomService;
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

    private RoleCustomDao roleCustomDao;
    private AuthorityCustomDao authorityCustomDao;

    @Autowired
    public void setRoleCustomDao(RoleCustomDao roleCustomDao) {
        this.roleCustomDao = roleCustomDao;
    }

    @Autowired
    public void setAuthorityCustomDao(AuthorityCustomDao authorityCustomDao) {
        this.authorityCustomDao = authorityCustomDao;
    }

    @Override
    public Set<String> getRoleAuthority(String roleId) {
        Optional<RoleCustomPO> roleCustomPOOptional = roleCustomDao.findById(roleId);
        if (roleCustomPOOptional.isPresent()) {
            RoleCustomPO roleCustomPO = roleCustomPOOptional.get();
            Set<String> authorityIds = new HashSet<>();
            if (roleCustomPO.getAuthority() != null) {
                for (AuthorityCustomPO authorityCustomPO : roleCustomPO.getAuthority()) {
                    authorityIds.add(authorityCustomPO.getId());
                }
            }
            return authorityIds;
        }
        return null;
    }

    @Override
    public void setRoleAuthority(String roleId, Set<String> authorityIds) {
        Optional<RoleCustomPO> roleCustomPOOptional = roleCustomDao.findById(roleId);
        if (roleCustomPOOptional.isPresent()) {
            RoleCustomPO roleCustomPO = roleCustomPOOptional.get();
            Set<AuthorityCustomPO> authorityCustomPOSet = new HashSet<>();
            for (String authorityId : authorityIds) {
                Optional<AuthorityCustomPO> authorityCustomPOOptional = authorityCustomDao.findById(authorityId);
                if (authorityCustomPOOptional.isPresent()) {
                    AuthorityCustomPO authorityCustomPO = authorityCustomPOOptional.get();
                    authorityCustomPOSet.add(authorityCustomPO);
                }
            }
            roleCustomPO.setAuthority(authorityCustomPOSet);
            roleCustomDao.saveAndFlush(roleCustomPO);
        }
    }
}
