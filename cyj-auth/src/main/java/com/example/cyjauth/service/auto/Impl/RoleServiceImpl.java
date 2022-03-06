package com.example.cyjauth.service.auto.Impl;

import com.example.cyjauth.dao.auto.RoleDao;
import com.example.cyjauth.entity.auto.po.RolePO;
import com.example.cyjauth.entity.auto.po.QRolePO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjauth.service.auto.RoleService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}
