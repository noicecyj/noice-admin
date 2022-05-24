package com.example.cyjauth.service.auto.Impl;

import com.example.cyjcommon.dao.EnterpriseDao;
import com.example.cyjcommon.entity.po.EnterprisePO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjauth.service.auto.EnterpriseService;
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
public class EnterpriseServiceImpl extends BaseService implements EnterpriseService {

    private EnterpriseDao enterpriseDao;

    @Autowired
    public void setEnterpriseDao(EnterpriseDao enterpriseDao) {
        this.enterpriseDao = enterpriseDao;
    }

    @Override
    public EnterprisePO addOne(EnterprisePO po) {
        return enterpriseDao.save(po);
    }

    @Override
    public void deleteOne(EnterprisePO po) {
        enterpriseDao.delete(po);
    }

    @Override
    public EnterprisePO updateOne(EnterprisePO po) {
        return enterpriseDao.saveAndFlush(po);
    }

    @Override
    public Page<EnterprisePO> findAll(Integer pageNumber) {
        return enterpriseDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
