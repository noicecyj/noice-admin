package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.po.EnterprisePO;
import com.querydsl.core.QueryResults;

/**
 * @author Noice
 * @version 1.0
 */
public interface EnterpriseService {

    EnterprisePO addOne(EnterprisePO po);

    void deleteOne(String id);

    EnterprisePO updateOne(EnterprisePO po);

    QueryResults<EnterprisePO> findAll(Integer pageNumber);

    EnterprisePO findOneById(String id);

}
