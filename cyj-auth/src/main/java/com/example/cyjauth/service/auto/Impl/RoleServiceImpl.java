package com.example.cyjauth.service.auto.Impl;

import com.example.cyjauth.service.auto.RoleService;
import com.example.cyjcommon.dao.RoleDao;
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
 * @author 曹元杰
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleServiceImpl extends BaseService implements RoleService {

    private RoleDao roleDao;

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public RolePO addOne(RolePO po) {
        return roleDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        roleDao.deleteById(id);
    }

    @Override
    public RolePO updateOne(RolePO po) {
        return roleDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<RolePO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QRolePO.rolePO)
                .where(QRolePO.rolePO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QRolePO.rolePO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public RolePO findOneById(String id) {
        return roleDao.findById(id).orElse(null);
    }

    @Override
    public List<String> getUserRole(String userId) {
        UserPO userPO = queryFactory
                .selectFrom(QUserPO.userPO)
                .where(QUserPO.userPO.id.eq(userId))
                .fetchOne();
        return userPO == null ? null : queryFactory
                .select(QRolePO.rolePO.id)
                .from(QRolePO.rolePO)
                .where(QRolePO.rolePO.user.eq(userPO))
                .fetch();
    }

    @Override
    public void setUserRole(String userId, Set<String> roleIds) {
        UserPO userPO = queryFactory
                .selectFrom(QUserPO.userPO)
                .where(QUserPO.userPO.id.eq(userId))
                .fetchOne();
        List<RolePO> rolePOList = queryFactory
                .selectFrom(QRolePO.rolePO)
                .fetch();
        for (RolePO rolePO : rolePOList) {
            rolePO.setUser(null);
            for (String roleId : roleIds) {
                if (rolePO.getId().equals(roleId)) {
                    rolePO.setUser(userPO);
                }
            }
            roleDao.saveAndFlush(rolePO);
        }
    }

}
