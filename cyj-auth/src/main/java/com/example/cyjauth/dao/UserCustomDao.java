package com.example.cyjauth.dao;

import com.example.cyjauth.entity.po.UserCustomPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface UserCustomDao extends JpaRepository<UserCustomPO, String> {

    UserCustomPO findByUserName(String name);

}
