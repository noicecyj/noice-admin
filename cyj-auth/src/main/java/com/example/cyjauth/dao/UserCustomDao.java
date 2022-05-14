package com.example.cyjauth.dao;

import com.example.cyjcommon.dao.UserDao;
import com.example.cyjcommon.entity.UserPO;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface UserCustomDao extends UserDao {

    UserPO findByUserName(String name);

}
