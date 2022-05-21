package com.example.cyjcommon.entity.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Noice
 * @version 1.0
 */
@Data
public class UserRoleDTO implements Serializable {

    private String userId;
    private Set<String> roleIds;

}
