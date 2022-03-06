package com.example.cyjauth.entity.custom.bo;

import com.example.cyjauth.entity.custom.po.UserPO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-20
 */
public class AuthUserDetails extends UserPO implements UserDetails {

    private static final long serialVersionUID = 1L;

    public AuthUserDetails(UserPO po) {
        if (po != null) {
            this.setUserName(po.getUserName());
            this.setPassword(po.getPassword());
            this.setStatus(po.getStatus());
            this.setRole(po.getRole());
            this.setAuthority(po.getAuthority());
        }
    }

    //将角色权限 放入GrantedAuthor的自定义实现类MyGrantedAuthority中  为权限判定提供数据
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        Set<AuthorityPO> authorityPOList = this.getAuthority();
        if (authorityPOList != null) {
            for (AuthorityPO po : authorityPOList) {
                GrantedAuthority grantedAuthority = new AuthGrantedAuthority(po.getPath(), po.getMethod());
                authorityList.add(grantedAuthority);
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