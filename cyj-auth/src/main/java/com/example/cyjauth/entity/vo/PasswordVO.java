package com.example.cyjauth.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/7/03 14:46
 */
@Data
public class PasswordVO implements Serializable {

        private String id;
        private String newPassword;
        private String checkPassword;

}
