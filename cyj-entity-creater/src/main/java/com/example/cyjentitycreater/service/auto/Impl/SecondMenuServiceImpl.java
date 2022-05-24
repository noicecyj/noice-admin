package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.dao.SecondMenuDao;
import com.example.cyjcommon.entity.po.FirstMenuPO;
import com.example.cyjcommon.entity.po.SecondMenuPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjentitycreater.service.auto.SecondMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SecondMenuServiceImpl extends BaseService implements SecondMenuService {

    private SecondMenuDao secondMenuDao;

    @Autowired
    public void setSecondMenuDao(SecondMenuDao secondMenuDao) {
        this.secondMenuDao = secondMenuDao;
    }

    @Override
    public SecondMenuPO addOne(SecondMenuPO po) {
        return secondMenuDao.save(po);
    }

    @Override
    public void deleteOne(SecondMenuPO po) {
        secondMenuDao.delete(po);
    }

    @Override
    public SecondMenuPO updateOne(SecondMenuPO po) {
        return secondMenuDao.saveAndFlush(po);
    }

    @Override
    public Page<SecondMenuPO> findAll(Integer pageNumber, FirstMenuPO firstMenu) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        SecondMenuPO secondMenuPO = new SecondMenuPO();
        secondMenuPO.setFirstMenu(firstMenu);
        Example<SecondMenuPO> example = Example.of(secondMenuPO);
        return secondMenuDao.findAll(example, pageable);
    }

}
