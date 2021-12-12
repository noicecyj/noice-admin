package com.example.cyjuser.entity.dto;

import com.example.cyjcommon.entity.dto.AuthorityDTO;
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
public class UserDTO implements Serializable {

        private String id;
        private String userName;
        private String password;
        private String name;
        private String phone;
        private Integer status;
        private String sortCode;
        private Set<RoleDTO> role = new HashSet<>();
        private Set<AuthorityDTO> authority = new HashSet<>();

}