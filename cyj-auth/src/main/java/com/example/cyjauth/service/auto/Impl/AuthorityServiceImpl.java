package com.example.cyjauth.service.auto.Impl;

import com.example.cyjauth.dao.auto.AuthorityDao;
import com.example.cyjauth.entity.auto.po.AuthorityPO;
import com.example.cyjauth.entity.auto.po.QAuthorityPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjauth.service.auto.AuthorityService;
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

}
