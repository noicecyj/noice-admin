package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.AuthorityPO;
import com.querydsl.core.QueryResults;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface AuthorityService {

    AuthorityPO addOne(AuthorityPO po);

    void deleteOne(String id);

    AuthorityPO updateOne(AuthorityPO po);

    QueryResults<AuthorityPO> findAll(Integer pageNumber);

    AuthorityPO findOneById(String id);

}
