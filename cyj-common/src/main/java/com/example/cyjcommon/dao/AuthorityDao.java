package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Entity;
import com.example.cyjcommon.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Noice
 */
public interface AuthorityDao extends JpaRepository<Authority, String> {

    List<Authority> findByAppServiceOrderBySortCode(AppService appService);

    List<Authority> findByEntityOrderBySortCode(Entity entity);

}
