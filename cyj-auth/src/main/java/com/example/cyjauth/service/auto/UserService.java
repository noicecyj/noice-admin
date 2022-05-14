package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.UserPO;
import com.querydsl.core.QueryResults;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface UserService {

    UserPO addOne(UserPO po);

    void deleteOne(String id);

    UserPO updateOne(UserPO po);

    QueryResults<UserPO> findAll(Integer pageNumber);

    UserPO findOneById(String id);

}
