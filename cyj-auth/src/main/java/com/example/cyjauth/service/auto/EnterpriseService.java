package com.example.cyjauth.service.auto;

import com.example.cyjcommon.dao.EnterpriseDao;
import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.entity.Enterprise;
import com.example.cyjcommon.entity.User;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.service.autoService;
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
public class EnterpriseService extends BaseService implements autoService<Enterprise> {

    private EnterpriseDao dao;
    private UserDao userDao;

    @Autowired
    public void setDao(EnterpriseDao dao) {
        this.dao = dao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Enterprise addOne(Enterprise po) {
        return dao.save(po);
    }

    @Override
    public void deleteOne(Enterprise po) {
        dao.delete(po);
    }

    @Override
    public Enterprise updateOne(Enterprise po) {
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Enterprise> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

    public Page<User> findAll(Integer pageNumber, Enterprise enterprise) {
        Pageable pageable = PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending());
        User po = new User();
        po.setEnterprise(enterprise);
        Example<User> example = Example.of(po);
        return userDao.findAll(example, pageable);
    }

}
