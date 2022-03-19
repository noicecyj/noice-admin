package com.example.cyjauth.dao.custom;

import com.example.cyjauth.entity.custom.po.UserCustomPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface UserCustomDao extends JpaRepository<UserCustomPO, String> {

    UserCustomPO findByUserName(String name);

}
