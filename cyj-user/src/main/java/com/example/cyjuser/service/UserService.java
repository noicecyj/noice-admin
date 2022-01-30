package com.example.cyjuser.service;

import com.example.cyjuser.entity.po.UserPO;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
public interface UserService {

    UserPO findAuthUserByUsername(String username);

}
