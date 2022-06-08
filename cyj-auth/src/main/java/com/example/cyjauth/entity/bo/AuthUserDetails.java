package com.example.cyjauth.entity.bo;

import com.example.cyjcommon.entity.Authority;
import com.example.cyjcommon.entity.Role;
import com.example.cyjcommon.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author Noice
 * @version 1.0
 * @date 2021-03-20
 */
public class AuthUserDetails extends User implements UserDetails {

    private static final long serialVersionUID = 1L;

    public AuthUserDetails(User po) {
        if (po != null) {
            this.setUserName(po.getUserName());
            this.setPassword(po.getPassword());
            this.setStatus(po.getStatus());
            this.setRole(po.getRole());
        }
    }

    //将角色权限 放入GrantedAuthor的自定义实现类MyGrantedAuthority中  为权限判定提供数据
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        Set<Role> roles = this.getRole();
        for (Role role : roles) {
            Set<Authority> authorityCustomList = role.getAuthority();
            if (authorityCustomList != null) {
                for (Authority po : authorityCustomList) {
                    GrantedAuthority grantedAuthority = new AuthGrantedAuthority(po.getAuthorityPath(), po.getAuthorityMethod());
                    authorityList.add(grantedAuthority);
                }
            }
        }
        return authorityList;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUserName();
    }

    /**
     * 账户是否过期
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 是否禁用
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 密码是否过期
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 是否启用
     */
    @Override
    public boolean isEnabled() {
        return true;
    }

}