package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.dao.FlowUserDao;
import com.example.cyjcommon.entity.FlowUser;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.service.autoService;
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
public class FlowUserService extends BaseService implements autoService<FlowUser> {

    private FlowUserDao dao;

    @Autowired
    public void setDao(FlowUserDao dao) {
        this.dao = dao;
    }

    @Override
    public FlowUser addOne(FlowUser po) {
        return dao.save(po);
    }

    @Override
    public void deleteOne(FlowUser po) {
        dao.delete(po);
    }

    @Override
    public FlowUser updateOne(FlowUser po) {
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<FlowUser> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
