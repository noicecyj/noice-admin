package com.example.cyjauth.entity.bo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cyjcommon.entity.bean.Authority;
import com.example.cyjcommon.entity.bean.User;
import com.example.cyjcommon.entity.relation.RoleAuthority;
import com.example.cyjcommon.entity.relation.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Noice
 */
public class AuthUserDetails extends User implements UserDetails {

    private static final long serialVersionUID = 1L;

    public AuthUserDetails(User po) {
        if (po != null) {
            this.setUserName(po.getUserName());
            this.setPassword(po.getPassword());
            this.setStatus(po.getStatus());
        }
    }

    //将角色权限 放入GrantedAuthor的自定义实现类MyGrantedAuthority中  为权限判定提供数据
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        List<UserRole> userRoleList = new UserRole()
                .selectList(new QueryWrapper<UserRole>().lambda()
                        .eq(UserRole::getUserId, this.getId()));
        for (UserRole userRole : userRoleList) {
            List<RoleAuthority> roleAuthorityList = new RoleAuthority()
                    .selectList(new QueryWrapper<RoleAuthority>().lambda()
                            .eq(RoleAuthority::getRoleId, userRole.getRoleId()));
            for (RoleAuthority roleAuthority : roleAuthorityList) {
                Authority authority = new Authority().selectById(roleAuthority.getAuthorityId());
                GrantedAuthority grantedAuthority = new AuthGrantedAuthority(authority.getAuthorityPath(),
                        authority.getAuthorityMethod());
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