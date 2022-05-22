package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface AuthorityDao extends JpaRepository<AuthorityPO, String> {

    List<AuthorityPO> findAllByEntity(EntityPO entity);

    List<AuthorityPO> findAllByAppService(AppServicePO appService);

    List<AuthorityPO> findAllByUser(UserPO user);

    List<AuthorityPO> findAllByRole(RolePO role);

}
