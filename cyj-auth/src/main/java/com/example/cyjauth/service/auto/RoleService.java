package com.example.cyjauth.service.auto;

import com.example.cyjauth.entity.auto.po.RolePO;
import com.querydsl.core.QueryResults;
/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface RoleService {

    RolePO addOne(RolePO po);
    void deleteOne(String id);
    RolePO updateOne(RolePO po);
    QueryResults<RolePO> findAll(Integer pageNumber);
    RolePO findOneById(String id);

}
