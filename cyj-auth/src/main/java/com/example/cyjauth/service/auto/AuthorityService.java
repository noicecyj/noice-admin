package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.po.AuthorityPO;
import com.querydsl.core.QueryResults;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 * @version 1.0
 */
public interface AuthorityService {

    AuthorityPO addOne(AuthorityPO po);

    void deleteOne(String id);

    AuthorityPO updateOne(AuthorityPO po);

    QueryResults<AuthorityPO> findAll(Integer pageNumber);

    AuthorityPO findOneById(String id);

    List<String> getRoleAuthority(String roleId);

    void setRoleAuthority(String roleId, Set<String> authorityIds);

    List<String> getUserAuthority(String userId);

    void setUserAuthority(String userId, Set<String> authorityIds);

}
