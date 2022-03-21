package com.example.cyjauth.service.custom;

import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface RoleCustomService {

    Set<String> getRoleAuthority(String roleId);

    void setRoleAuthority(String roleId, Set<String> authorityIds);

}
