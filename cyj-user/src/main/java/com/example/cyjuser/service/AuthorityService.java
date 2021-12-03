package com.example.cyjuser.service;


import com.example.cyjuser.entity.po.AuthorityPO;

import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-20
 */
public interface AuthorityService {

        List<AuthorityPO> findRoleAndAuthority();

}
