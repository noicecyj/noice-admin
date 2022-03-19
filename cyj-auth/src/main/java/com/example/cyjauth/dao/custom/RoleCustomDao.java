package com.example.cyjauth.dao.custom;

import com.example.cyjauth.entity.custom.po.RoleCustomPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface RoleCustomDao extends JpaRepository<RoleCustomPO, String> {
}
