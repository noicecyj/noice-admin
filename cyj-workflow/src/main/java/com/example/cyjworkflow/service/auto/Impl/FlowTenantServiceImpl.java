package com.example.cyjworkflow.service.auto.Impl;

import com.example.cyjcommon.dao.FlowTenantDao;
import com.example.cyjcommon.entity.po.FlowTenantPO;
import com.example.cyjcommon.entity.po.QFlowTenantPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjworkflow.service.auto.FlowTenantService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FlowTenantServiceImpl extends BaseService implements FlowTenantService {

    private FlowTenantDao flowTenantDao;

    @Autowired
    public void setFlowTenantDao(FlowTenantDao flowTenantDao) {
        this.flowTenantDao = flowTenantDao;
    }

    @Override
    public FlowTenantPO addOne(FlowTenantPO po) {
        return flowTenantDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        flowTenantDao.deleteById(id);
    }

    @Override
    public FlowTenantPO updateOne(FlowTenantPO po) {
        return flowTenantDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<FlowTenantPO> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QFlowTenantPO.flowTenantPO)
                .where(QFlowTenantPO.flowTenantPO.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QFlowTenantPO.flowTenantPO.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public FlowTenantPO findOneById(String id) {
        return flowTenantDao.findById(id).orElse(null);
    }

}
