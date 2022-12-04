package com.example.cyjauth.entity.bo;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author Noice
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
