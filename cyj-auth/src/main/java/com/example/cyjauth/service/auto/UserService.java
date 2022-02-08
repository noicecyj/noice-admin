package com.example.cyjauth.service.auto;

import com.example.cyjauth.entity.auto.po.UserPO;
import com.querydsl.core.QueryResults;
/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-08
 */
public interface UserService {

    UserPO addOne(UserPO po);
    void deleteOne(String id);
    UserPO updateOne(UserPO po);
    QueryResults<UserPO> findAll(Integer pageNumber);
    UserPO findOneById(String id);

}
