package com.example.cyjcommon.entity.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Data
public class UserAuthorityDTO implements Serializable {

    private String userId;
    private Set<String> authorityIds;

}
