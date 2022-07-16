package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.dao.FlowTenantDao;
import com.example.cyjcommon.entity.FlowTenant;
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
public class FlowTenantService extends BaseService implements autoService<FlowTenant> {

    private FlowTenantDao dao;

    @Autowired
    public void setDao(FlowTenantDao dao) {
        this.dao = dao;
    }

    @Override
    public FlowTenant addOne(FlowTenant po) {
        return dao.save(po);
    }

    @Override
    public void deleteOne(FlowTenant po) {
        dao.delete(po);
    }

    @Override
    public FlowTenant updateOne(FlowTenant po) {
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<FlowTenant> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

}
