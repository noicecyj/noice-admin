package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.EnterprisePO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.entity.po.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
public interface UserDao extends JpaRepository<UserPO, String> {

    List<UserPO> findByEnterprise(EnterprisePO enterprise);

    List<UserPO> findByRoleIn(Collection<Set<RolePO>> roleList);

    List<UserPO> findByAuthorityIn(Collection<Set<AuthorityPO>> authorityList);

}
