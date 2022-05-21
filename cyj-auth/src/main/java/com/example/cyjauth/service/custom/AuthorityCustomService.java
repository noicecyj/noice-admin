package com.example.cyjauth.service.custom;


import com.example.cyjcommon.entity.po.AuthorityPO;

import java.util.List;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-03-02
 */
public interface AuthorityCustomService {

    List<AuthorityPO> findRoleAndAuthority();

    void createAuthority();

    AuthorityPO findByPathAndName(String path, String name);

}
