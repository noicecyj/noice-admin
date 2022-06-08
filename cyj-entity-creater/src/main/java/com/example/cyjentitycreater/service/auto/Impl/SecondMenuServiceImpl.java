package com.example.cyjentitycreater.service.auto.Impl;

import com.example.cyjcommon.dao.SecondMenuDao;
import com.example.cyjcommon.entity.FirstMenu;
import com.example.cyjcommon.entity.SecondMenu;
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
    public SecondMenu addOne(SecondMenu po) {
        return secondMenuDao.save(po);
    }

    @Override
    public void deleteOne(SecondMenu po) {
        secondMenuDao.delete(po);
    }

    @Override
    public SecondMenu updateOne(SecondMenu po) {
        return secondMenuDao.saveAndFlush(po);
    }

    @Override
    public Page<SecondMenu> findAll(Integer pageNumber, FirstMenu firstMenu) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        SecondMenu secondMenu = new SecondMenu();
        secondMenu.setFirstMenu(firstMenu);
        Example<SecondMenu> example = Example.of(secondMenu);
        return secondMenuDao.findAll(example, pageable);
    }

}
