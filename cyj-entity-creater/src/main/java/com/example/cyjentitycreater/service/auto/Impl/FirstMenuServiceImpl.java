package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.dao.FirstMenuDao;
import com.example.cyjcommon.entity.po.FirstMenuPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.auto.FirstMenuService;
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
public class FirstMenuServiceImpl extends BaseService implements FirstMenuService {

    private FirstMenuDao firstMenuDao;

    @Autowired
    public void setFirstMenuDao(FirstMenuDao firstMenuDao) {
        this.firstMenuDao = firstMenuDao;
    }

    @Override
    public FirstMenuPO addOne(FirstMenuPO po) {
        return firstMenuDao.save(po);
    }

    @Override
    public void deleteOne(FirstMenuPO po) {
        firstMenuDao.delete(po);
    }

    @Override
    public FirstMenuPO updateOne(FirstMenuPO po) {
        return firstMenuDao.saveAndFlush(po);
    }

    @Override
    public Page<FirstMenuPO> findAll(Integer pageNumber) {
        return firstMenuDao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
