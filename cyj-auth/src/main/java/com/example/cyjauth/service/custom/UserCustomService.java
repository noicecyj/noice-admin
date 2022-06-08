package com.example.cyjauth.service.custom;

import com.example.cyjcommon.entity.User;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-02-07
 */
public interface UserCustomService {

    User findAuthUserByUsername(String username);
    void resetPassword(String userId, String newPassword, String checkPassword);

}
