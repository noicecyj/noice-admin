package com.example.cyjworkflow.service.auto.Impl;

import com.example.cyjcommon.dao.BpmnDao;
import com.example.cyjcommon.entity.BpmnPO;
import com.example.cyjcommon.entity.QBpmnPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjworkflow.service.auto.BpmnService;
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
public class BpmnServiceImpl extends BaseService implements BpmnService {

    private BpmnDao bpmnDao;

    @Autowired
    public void setBpmnDao(BpmnDao bpmnDao) {
        this.bpmnDao = bpmnDao;
    }

    @Override
    public BpmnPO addOne(BpmnPO po) {
        return bpmnDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        bpmnDao.deleteById(id);
    }

    @Override
    public BpmnPO updateOne(BpmnPO po) {
        return bpmnDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<BpmnPO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QBpmnPO.bpmnPO)
                .where(QBpmnPO.bpmnPO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QBpmnPO.bpmnPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public BpmnPO findOneById(String id) {
        return bpmnDao.findById(id).orElse(null);
    }

}
