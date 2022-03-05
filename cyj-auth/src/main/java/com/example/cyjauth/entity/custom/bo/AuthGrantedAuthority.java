package com.example.cyjauth.entity.custom.bo;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-20
 */
@Data
public class AuthGrantedAuthority implements GrantedAuthority {

    private String url;
    private String method;

    public AuthGrantedAuthority(String url, String method) {
        this.url = url;
        this.method = method;
    }

    @Override
    public String getAuthority() {
        return this.url + ";" + this.method;
    }

}
