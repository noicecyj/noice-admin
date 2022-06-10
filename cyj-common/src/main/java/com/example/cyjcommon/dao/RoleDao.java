package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.Role;
import com.example.cyjcommon.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
public interface RoleDao extends JpaRepository<Role, String> {

}
