package com.example.cyjauth.entity.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
@Data
public class RoleAuthorityDTO implements Serializable {

    private String roleId;
    private Set<String> authorityIds;

}
