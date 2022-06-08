package com.example.cyjworkflow.service.auto.Impl;

import com.example.cyjcommon.dao.FlowTenantDao;
import com.example.cyjcommon.entity.FlowTenant;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjworkflow.service.auto.FlowTenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
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
    public FlowTenant addOne(FlowTenant po) {
        return flowTenantDao.save(po);
    }

    @Override
    public void deleteOne(FlowTenant po) {
        flowTenantDao.delete(po);
    }

    @Override
    public FlowTenant updateOne(FlowTenant po) {
        return flowTenantDao.saveAndFlush(po);
    }

    @Override
    public Page<FlowTenant> findAll(Integer pageNumber) {
        return flowTenantDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
