package com.example.cyjauth.service.custom;


import com.example.cyjauth.entity.custom.po.AuthorityPO;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-03-02
 */
public interface AuthorityCustomService {

    List<AuthorityPO> findRoleAndAuthority();

}
