package com.example.cyjworkflow.service.auto.Impl;

import com.example.cyjcommon.dao.FlowUserDao;
import com.example.cyjcommon.entity.FlowUser;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjworkflow.service.auto.FlowUserService;
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
public class FlowUserServiceImpl extends BaseService implements FlowUserService {

    private FlowUserDao flowUserDao;

    @Autowired
    public void setFlowUserDao(FlowUserDao flowUserDao) {
        this.flowUserDao = flowUserDao;
    }

    @Override
    public FlowUser addOne(FlowUser po) {
        return flowUserDao.save(po);
    }

    @Override
    public void deleteOne(FlowUser po) {
        flowUserDao.delete(po);
    }

    @Override
    public FlowUser updateOne(FlowUser po) {
        return flowUserDao.saveAndFlush(po);
    }

    @Override
    public Page<FlowUser> findAll(Integer pageNumber) {
        return flowUserDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
