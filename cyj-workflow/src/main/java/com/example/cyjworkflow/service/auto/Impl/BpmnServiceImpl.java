package com.example.cyjworkflow.service.auto.Impl;

import com.example.cyjcommon.dao.BpmnDao;
import com.example.cyjcommon.entity.Bpmn;
import com.example.cyjcommon.entity.QBpmn;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjworkflow.service.auto.BpmnService;
import com.querydsl.core.QueryResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class BpmnServiceImpl extends BaseService implements BpmnService {

    private BpmnDao bpmnDao;

    @Autowired
    public void setBpmnDao(BpmnDao bpmnDao) {
        this.bpmnDao = bpmnDao;
    }

    @Override
    public Bpmn addOne(Bpmn po) {
        return bpmnDao.save(po);
    }

    @Override
    public void deleteOne(String id) {
        bpmnDao.deleteById(id);
    }

    @Override
    public Bpmn updateOne(Bpmn po) {
        return bpmnDao.saveAndFlush(po);
    }

    @Override
    public QueryResults<Bpmn> findAll(Integer pageNumber) {
        return queryFactory
                .selectFrom(QBpmn.bpmn)
                .where(QBpmn.bpmn.sortCode.isNotNull())
                .offset((pageNumber - 1) * 10L)
                .orderBy(QBpmn.bpmn.sortCode.asc())
                .limit(10)
                .fetchResults();
    }

    @Override
    public Bpmn findOneById(String id) {
        return bpmnDao.findById(id).orElse(null);
    }

}
