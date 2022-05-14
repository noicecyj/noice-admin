package com.example.cyjauth.service.custom;

import com.example.cyjauth.entity.po.UserCustomPO;
import com.example.cyjcommon.entity.UserPO;

import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface UserCustomService {

    UserPO findAuthUserByUsername(String username);

    Set<String> getUserRole(String userId);

    void setUserRole(String userId, Set<String> roleIds);

    Set<String> getUserAuthority(String userId);

    void setUserAuthority(String userId, Set<String> authorityIds);

    void resetPassword(String userId, String newPassword, String checkPassword);

}
