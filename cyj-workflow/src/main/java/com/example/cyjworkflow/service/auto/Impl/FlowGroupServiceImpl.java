package com.example.cyjworkflow.service.auto.Impl;

import com.example.cyjcommon.dao.FlowGroupDao;
import com.example.cyjcommon.entity.po.FlowGroupPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjworkflow.service.auto.FlowGroupService;
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
    public void deleteOne(FlowGroupPO po) {
        flowGroupDao.delete(po);
    }

    @Override
    public FlowGroupPO updateOne(FlowGroupPO po) {
        return flowGroupDao.saveAndFlush(po);
    }

    @Override
    public Page<FlowGroupPO> findAll(Integer pageNumber) {
        return flowGroupDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
