package com.example.cyjauth.service.custom;


import com.example.cyjcommon.entity.Authority;

import java.util.List;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-03-02
 */
public interface AuthorityCustomService {

    List<Authority> findRoleAndAuthority();

    void createAuthority();

    Authority findByPathAndName(String path, String name);

}
