package com.example.cyjworkflow.service.auto.Impl;

import com.example.cyjcommon.service.BaseService;
import com.example.cyjworkflow.dao.auto.FlowUserDao;
import com.example.cyjworkflow.entity.auto.po.QFlowUserPO;
import com.example.cyjworkflow.entity.auto.po.FlowUserPO;
import com.example.cyjworkflow.service.auto.FlowUserService;
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
public class FlowUserServiceImpl extends BaseService implements FlowUserService {

    private FlowUserDao flowUserDao;

    @Autowired
    public void setFlowUserDao(FlowUserDao flowUserDao) {
        this.flowUserDao = flowUserDao;
    }

    @Override
    public FlowUserPO addOne(FlowUserPO po) {
        return flowUserDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        flowUserDao.deleteById(id);
    }

    @Override
    public FlowUserPO updateOne(FlowUserPO po) {
        return flowUserDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<FlowUserPO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QFlowUserPO.flowUserPO)
                .where(QFlowUserPO.flowUserPO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QFlowUserPO.flowUserPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public FlowUserPO findOneById(String id) {
        return flowUserDao.findById(id).orElse(null);
    }

}
