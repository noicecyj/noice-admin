package com.example.cyjauth.dao.custom;

import com.example.cyjauth.entity.auto.po.EnterprisePO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface EnterpriseCustomDao extends JpaRepository<EnterprisePO, String> {
}
