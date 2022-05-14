package com.example.cyjauth.service.auto.Impl;

import com.example.cyjauth.service.auto.EnterpriseService;
import com.example.cyjcommon.dao.EnterpriseDao;
import com.example.cyjcommon.entity.po.EnterprisePO;
import com.example.cyjcommon.entity.po.QEnterprisePO;
import com.example.cyjcommon.service.BaseService;
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
public class EnterpriseServiceImpl extends BaseService implements EnterpriseService {

    private EnterpriseDao enterpriseDao;

    @Autowired
    public void setEnterpriseDao(EnterpriseDao enterpriseDao) {
        this.enterpriseDao = enterpriseDao;
    }

    @Override
    public EnterprisePO addOne(EnterprisePO po) {
        return enterpriseDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        enterpriseDao.deleteById(id);
    }

    @Override
    public EnterprisePO updateOne(EnterprisePO po) {
        return enterpriseDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<EnterprisePO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QEnterprisePO.enterprisePO)
                .where(QEnterprisePO.enterprisePO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QEnterprisePO.enterprisePO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public EnterprisePO findOneById(String id) {
        return enterpriseDao.findById(id).orElse(null);
    }

}
