package com.example.cyjauth.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Noice
 * @version 1.0
 * @date 2021-03-07
 */
@Data
public class PasswordDTO implements Serializable {

    private String userId;
    private String newPassword;
    private String checkPassword;

}
