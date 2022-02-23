package com.example.cyjauth.dao.auto;

import com.example.cyjauth.entity.auto.po.RolePO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-23
 */
public interface RoleDao extends JpaRepository<RolePO, String> {
}
