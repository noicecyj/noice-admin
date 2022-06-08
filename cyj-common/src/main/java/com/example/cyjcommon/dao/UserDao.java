package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.Enterprise;
import com.example.cyjcommon.entity.Role;
import com.example.cyjcommon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
public interface UserDao extends JpaRepository<User, String> {

    List<User> findByEnterpriseOrderBySortCode(Enterprise enterprise);

    List<User> findByRoleInOrderBySortCode(Collection<Set<Role>> roleList);

}
