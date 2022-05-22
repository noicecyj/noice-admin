package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.entity.po.RolePO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface RoleDao extends JpaRepository<RolePO, String> {

    List<RolePO> findAllByUser(UserPO user);

}
