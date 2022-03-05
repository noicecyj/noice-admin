package com.example.cyjauth.service.auto;

import com.example.cyjauth.entity.auto.po.AuthorityPO;
import com.querydsl.core.QueryResults;
/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-03-02
 */
public interface AuthorityService {

    AuthorityPO addOne(AuthorityPO po);
    void deleteOne(String id);
    AuthorityPO updateOne(AuthorityPO po);
    QueryResults<AuthorityPO> findAll(Integer pageNumber);
    AuthorityPO findOneById(String id);

}
