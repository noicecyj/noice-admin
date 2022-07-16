package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.dao.FlowGroupDao;
import com.example.cyjcommon.entity.FlowGroup;
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
public class FlowGroupService extends BaseService implements autoService<FlowGroup> {

    private FlowGroupDao dao;

    @Autowired
    public void setDao(FlowGroupDao dao) {
        this.dao = dao;
    }

    @Override
    public FlowGroup addOne(FlowGroup po) {
        return dao.save(po);
    }

    @Override
    public void deleteOne(FlowGroup po) {
        dao.delete(po);
    }

    @Override
    public FlowGroup updateOne(FlowGroup po) {
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<FlowGroup> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

}
