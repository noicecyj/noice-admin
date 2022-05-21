package com.example.cyjauth.service.auto.Impl;

import com.example.cyjauth.service.auto.AuthorityService;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.entity.po.QAuthorityPO;
import com.example.cyjcommon.entity.po.QRolePO;
import com.example.cyjcommon.entity.po.QUserPO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.service.BaseService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 * @version 1.0
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
    public void deleteOne(String id) {
        authorityDao.deleteById(id);
    }

    @Override
    public AuthorityPO updateOne(AuthorityPO po) {
        return authorityDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<AuthorityPO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QAuthorityPO.authorityPO)
                .where(QAuthorityPO.authorityPO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QAuthorityPO.authorityPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public AuthorityPO findOneById(String id) {
        return authorityDao.findById(id).orElse(null);
    }

    @Override
    public List<String> getRoleAuthority(String roleId) {
        RolePO rolePO = queryFactory
                .selectFrom(QRolePO.rolePO)
                .where(QRolePO.rolePO.id.eq(roleId))
                .fetchOne();
        return rolePO == null ? null : queryFactory
                .select(QAuthorityPO.authorityPO.id)
                .from(QAuthorityPO.authorityPO)
                .where(QAuthorityPO.authorityPO.role.eq(rolePO))
                .fetch();
    }

    @Override
    public void setRoleAuthority(String roleId, Set<String> authorityIds) {
        RolePO rolePO = queryFactory
                .selectFrom(QRolePO.rolePO)
                .where(QRolePO.rolePO.id.eq(roleId))
                .fetchOne();
        List<AuthorityPO> authorityPOList = queryFactory
                .selectFrom(QAuthorityPO.authorityPO)
                .fetch();
        for (AuthorityPO authorityPO : authorityPOList) {
            authorityPO.setRole(null);
            for (String authorityId : authorityIds) {
                if (authorityPO.getId().equals(authorityId)) {
                    authorityPO.setRole(rolePO);
                }
            }
            authorityDao.saveAndFlush(authorityPO);
        }
    }

    @Override
    public List<String> getUserAuthority(String userId) {
        UserPO userPO = queryFactory
                .selectFrom(QUserPO.userPO)
                .where(QUserPO.userPO.id.eq(userId))
                .fetchOne();
        return userPO == null ? null : queryFactory
                .select(QAuthorityPO.authorityPO.id)
                .from(QAuthorityPO.authorityPO)
                .where(QAuthorityPO.authorityPO.user.eq(userPO))
                .fetch();
    }

    @Override
    public void setUserAuthority(String userId, Set<String> authorityIds) {
        UserPO userPO = queryFactory
                .selectFrom(QUserPO.userPO)
                .where(QUserPO.userPO.id.eq(userId))
                .fetchOne();
        List<AuthorityPO> authorityPOList = queryFactory
                .selectFrom(QAuthorityPO.authorityPO)
                .fetch();
        for (AuthorityPO authorityPO : authorityPOList) {
            authorityPO.setUser(null);
            for (String authorityId : authorityIds) {
                if (authorityPO.getId().equals(authorityId)) {
                    authorityPO.setUser(userPO);
                }
            }
            authorityDao.saveAndFlush(authorityPO);
        }
    }

}
