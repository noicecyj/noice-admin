package com.example.cyjauth.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Noice
 */
@Data
public class PasswordDTO implements Serializable {

    private String userId;
    private String newPassword;
    private String checkPassword;

}
