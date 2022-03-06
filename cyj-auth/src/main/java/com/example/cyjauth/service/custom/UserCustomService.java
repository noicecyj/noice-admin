package com.example.cyjauth.service.custom;

import com.example.cyjauth.entity.custom.po.UserCustomPO;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface UserCustomService {

    UserCustomPO findAuthUserByUsername(String username);

}
