package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.entity.po.RolePO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
public interface RoleDao extends JpaRepository<RolePO, String> {

    List<RolePO> findByUserIn(Collection<Set<UserPO>> userList);

    List<RolePO> findByAuthorityIn(Collection<Set<AuthorityPO>> authorityList);

}
