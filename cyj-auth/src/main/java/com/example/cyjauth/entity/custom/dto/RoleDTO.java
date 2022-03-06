package com.example.cyjauth.entity.custom.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
@Data
public class RoleDTO implements Serializable {

    private String id;
    private String name;
    private String value;
    private String description;
    private Integer status;
    private String sortCode;
    private Set<AuthorityDTO> authority = new HashSet<>();

}