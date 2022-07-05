package com.example.cyjentitycreater.service.auto;

import com.example.cyjcommon.dao.SubjectDao;
import com.example.cyjcommon.entity.Subject;
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
public class SubjectService extends BaseService implements autoService<Subject> {

    private SubjectDao dao;

    @Autowired
    public void setDao(SubjectDao dao) {
        this.dao = dao;
    }

    @Override
    public Subject addOne(Subject po) {
        return dao.save(po);
    }

    @Override
    public void deleteOne(Subject po) {
        dao.delete(po);
    }

    @Override
    public Subject updateOne(Subject po) {
        return dao.saveAndFlush(po);
    }

    @Override
    public Page<Subject> findAll(Integer pageNumber) {
        return dao.findAll(PageRequest.of(pageNumber - 1, 10, Sort.by("sortCode").ascending()));
    }

}
