package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.dao.auto.FirstMenuDao;
import com.example.cyjentitycreater.entity.auto.po.FirstMenuPO;
import com.example.cyjentitycreater.entity.auto.po.QFirstMenuPO;
import com.example.cyjentitycreater.service.auto.FirstMenuService;
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
public class FirstMenuServiceImpl extends BaseService implements FirstMenuService {

    private FirstMenuDao firstMenuDao;

    @Autowired
    public void setFirstMenuDao(FirstMenuDao firstMenuDao) {
        this.firstMenuDao = firstMenuDao;
    }

    @Override
    public FirstMenuPO addOne(FirstMenuPO po) {
        return firstMenuDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        firstMenuDao.deleteById(id);
    }

    @Override
    public FirstMenuPO updateOne(FirstMenuPO po) {
        return firstMenuDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<FirstMenuPO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QFirstMenuPO.firstMenuPO)
                .where(QFirstMenuPO.firstMenuPO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QFirstMenuPO.firstMenuPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public FirstMenuPO findOneById(String id) {
        return firstMenuDao.findById(id).orElse(null);
    }

}
