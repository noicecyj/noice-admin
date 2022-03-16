package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.dao.auto.SecondMenuDao;
import com.example.cyjentitycreater.entity.auto.po.QSecondMenuPO;
import com.example.cyjentitycreater.entity.auto.po.SecondMenuPO;
import com.example.cyjentitycreater.service.auto.SecondMenuService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SecondMenuServiceImpl extends BaseService implements SecondMenuService {

    private SecondMenuDao secondMenuDao;

    @Autowired
    public void setSecondMenuDao(SecondMenuDao secondMenuDao) {
        this.secondMenuDao = secondMenuDao;
    }

    @Override
    public SecondMenuPO addOne(SecondMenuPO po) {
        return secondMenuDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        secondMenuDao.deleteById(id);
    }

    @Override
    public SecondMenuPO updateOne(SecondMenuPO po) {
        return secondMenuDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<SecondMenuPO> findAll(Integer pageNumber, String pid) {
        return queryFactory
                .selectFrom(QSecondMenuPO.secondMenuPO)
                .where(QSecondMenuPO.secondMenuPO.pid.eq(pid).and(QSecondMenuPO.secondMenuPO.sortCode.isNotNull()))
                .offset((pageNumber - 1) * 10L)
                .orderBy(QSecondMenuPO.secondMenuPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public SecondMenuPO findOneById(String id) {
        return secondMenuDao.findById(id).orElse(null);
    }

    @Override
    public List<SecondMenuPO> findListByPid(String id) {
        return queryFactory
                .selectFrom(QSecondMenuPO.secondMenuPO)
                .where(QSecondMenuPO.secondMenuPO.pid.eq(id))
                .fetch();
    }

}
