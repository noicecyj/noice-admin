package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.UserPO;
import com.querydsl.core.QueryResults;
import org.springframework.data.domain.Page;

import java.util.Set;

/**
 * @author Noice
 * @version 1.0
 */
public interface UserService {

    UserPO addOne(UserPO po);

    void deleteOne(UserPO po);

    UserPO updateOne(UserPO po);

    Page<UserPO> findAll(Integer pageNumber);

    Page<UserPO> findAllByRoleList(Integer pageNumber, Set<RolePO> roleList);

    Page<UserPO> findAllByAuthorityList(Integer pageNumber, Set<AuthorityPO> authorityList);
}
