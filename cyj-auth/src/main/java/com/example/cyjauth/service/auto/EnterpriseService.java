package com.example.cyjauth.service.auto;

import com.example.cyjcommon.dao.EnterpriseDao;
import com.example.cyjcommon.entity.Enterprise;
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
public class EnterpriseService extends BaseService implements autoService<Enterprise> {

    private EnterpriseDao enterpriseDao;

    @Autowired
    public void setEnterpriseDao(EnterpriseDao enterpriseDao) {
        this.enterpriseDao = enterpriseDao;
    }

    @Override
    public Enterprise addOne(Enterprise po) {
        return enterpriseDao.save(po);
    }

    @Override
    public void deleteOne(Enterprise po) {
        enterpriseDao.delete(po);
    }

    @Override
    public Enterprise updateOne(Enterprise po) {
        return enterpriseDao.saveAndFlush(po);
    }

    @Override
    public Page<Enterprise> findAll(Integer pageNumber) {
        return enterpriseDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
