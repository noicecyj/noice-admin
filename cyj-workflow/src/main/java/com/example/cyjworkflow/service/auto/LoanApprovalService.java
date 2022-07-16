package com.example.cyjworkflow.service.auto;

import com.example.cyjcommon.dao.LoanApprovalDao;
import com.example.cyjcommon.entity.LoanApproval;
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
public class LoanApprovalService extends BaseService implements autoService<LoanApproval> {

    private LoanApprovalDao dao;

    @Autowired
    public void setDao(LoanApprovalDao dao) {
        this.dao = dao;
    }

    @Override
    public LoanApproval addOne(LoanApproval po) {
        return dao.save(po);
    }

    @Override
    public void deleteOne(LoanApproval po) {
        dao.delete(po);
    }

    @Override
    public LoanApproval updateOne(LoanApproval po) {
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<LoanApproval> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending()));
    }

}
