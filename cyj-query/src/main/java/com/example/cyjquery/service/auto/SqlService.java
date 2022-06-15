package com.example.cyjquery.service.auto;

import com.example.cyjcommon.dao.SqlDao;
import com.example.cyjcommon.entity.Sql;
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
public class SqlService extends BaseService implements autoService<Sql> {

    private SqlDao dao;

    @Autowired
    public void setDao(SqlDao dao) {
        this.dao = dao;
    }

    @Override
    public Sql addOne(Sql po) {
        return dao.save(po);
    }

    @Override
    public void deleteOne(Sql po) {
        dao.delete(po);
    }

    @Override
    public Sql updateOne(Sql po) {
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Sql> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
