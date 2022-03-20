package com.example.cyjauth.service.custom;

import com.example.cyjauth.entity.custom.po.UserCustomPO;

import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface UserCustomService {

    UserCustomPO findAuthUserByUsername(String username);

    Set<String> getUserRole(String userId);

    void setUserRole(String userId, Set<String> roleIds);

    Set<String> getUserAuthority(String userId);

    void setUserAuthority(String userId, Set<String> authorityIds);

}
