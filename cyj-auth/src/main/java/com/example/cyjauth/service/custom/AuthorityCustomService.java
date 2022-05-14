package com.example.cyjauth.service.custom;


import com.example.cyjauth.entity.po.AuthorityCustomPO;
import com.example.cyjcommon.entity.AuthorityPO;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-03-02
 */
public interface AuthorityCustomService {

    List<AuthorityPO> findRoleAndAuthority();

    void createAuthority();

    AuthorityPO findByPathAndName(String path, String name);

}
