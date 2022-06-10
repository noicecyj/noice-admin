package com.example.cyjcommon.dao;

import com.example.cyjcommon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Noice
 */
public interface UserDao extends JpaRepository<User, String> {

}
