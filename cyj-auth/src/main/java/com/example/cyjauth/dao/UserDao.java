package com.example.cyjauth.dao;

import com.example.cyjauth.entity.po.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
public interface UserDao extends JpaRepository<UserPO, String> {
}
