package com.example.cyjworkflow.service.auto.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjworkflow.dao.auto.FlowGroupDao;
import com.example.cyjworkflow.entity.auto.po.QFlowGroupPO;
import com.example.cyjworkflow.entity.auto.po.FlowGroupPO;
import com.example.cyjworkflow.service.auto.FlowGroupService;
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
public class FlowGroupServiceImpl extends BaseService implements FlowGroupService {

    private FlowGroupDao flowGroupDao;

    @Autowired
    public void setFlowGroupDao(FlowGroupDao flowGroupDao) {
        this.flowGroupDao = flowGroupDao;
    }

    @Override
    public FlowGroupPO addOne(FlowGroupPO po) {
        return flowGroupDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        flowGroupDao.deleteById(id);
    }

    @Override
    public FlowGroupPO updateOne(FlowGroupPO po) {
        return flowGroupDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<FlowGroupPO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QFlowGroupPO.flowGroupPO)
                .where(QFlowGroupPO.flowGroupPO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QFlowGroupPO.flowGroupPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public FlowGroupPO findOneById(String id) {
        return flowGroupDao.findById(id).orElse(null);
    }

}
