package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
public interface AuthorityDao extends JpaRepository<AuthorityPO, String> {

    List<AuthorityPO> findByEntity(EntityPO entity);

    List<AuthorityPO> findByAppService(AppServicePO appService);

    List<AuthorityPO> findByUserIn(Collection<Set<UserPO>> userList);

    List<AuthorityPO> findByRoleIn(Collection<Set<RolePO>> roleList);

}
