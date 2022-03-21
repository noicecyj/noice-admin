package com.example.cyjauth.service.auto.Impl;

import com.example.cyjauth.dao.auto.UserDao;
import com.example.cyjauth.entity.auto.po.QUserPO;
import com.example.cyjauth.entity.auto.po.UserPO;
import com.example.cyjauth.service.auto.UserService;
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
public class UserServiceImpl extends BaseService implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserPO addOne(UserPO po) {
        return userDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        userDao.deleteById(id);
    }

    @Override
    public UserPO updateOne(UserPO po) {
        return userDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<UserPO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QUserPO.userPO)
                .where(QUserPO.userPO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QUserPO.userPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public UserPO findOneById(String id) {
        return userDao.findById(id).orElse(null);
    }

}
