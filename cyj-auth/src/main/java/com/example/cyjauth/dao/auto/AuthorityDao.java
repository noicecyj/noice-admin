package com.example.cyjauth.dao.auto;

import com.example.cyjauth.entity.auto.po.AuthorityPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 */
public interface AuthorityDao extends JpaRepository<AuthorityPO, String> {
}
