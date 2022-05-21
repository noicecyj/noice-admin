package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.po.RolePO;
import com.querydsl.core.QueryResults;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 * @version 1.0
 */
public interface RoleService {

    RolePO addOne(RolePO po);

    void deleteOne(String id);

    RolePO updateOne(RolePO po);

    QueryResults<RolePO> findAll(Integer pageNumber);

    RolePO findOneById(String id);

    List<String> getUserRole(String userId);

    void setUserRole(String userId, Set<String> roleIds);

}
