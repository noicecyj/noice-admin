package com.example.cyjuser.dao;

import com.example.cyjuser.entity.po.RolePO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
public interface RoleDao extends JpaRepository<RolePO, String> {
}
