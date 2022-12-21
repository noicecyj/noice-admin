package com.example.cyjauth.entity.bo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cyjcommon.entity.bean.AuthorityBean;
import com.example.cyjcommon.entity.bean.UserBean;
import com.example.cyjcommon.entity.relation.RoleAuthorityRelation;
import com.example.cyjcommon.entity.relation.UserRoleRelation;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Noice
 */
public class AuthUserDetails extends UserBean implements UserDetails {

    private static final long serialVersionUID = 1L;

    public AuthUserDetails(UserBean po) {
        if (po != null) {
            this.setId(po.getId());
            this.setSortCode(po.getSortCode());
            this.setUserName(po.getUserName());
            this.setUserPassword(po.getUserPassword());
            this.setStatus(po.getStatus());
        }
    }

    //将角色权限 放入GrantedAuthor的自定义实现类MyGrantedAuthority中  为权限判定提供数据
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        List<UserRoleRelation> userRoleList = new UserRoleRelation()
                .selectList(new QueryWrapper<UserRoleRelation>().lambda()
                        .eq(UserRoleRelation::getUserId, this.getId()));
        for (UserRoleRelation userRole : userRoleList) {
            List<RoleAuthorityRelation> roleAuthorityList = new RoleAuthorityRelation()
                    .selectList(new QueryWrapper<RoleAuthorityRelation>().lambda()
                            .eq(RoleAuthorityRelation::getRoleId, userRole.getRoleId()));
            for (RoleAuthorityRelation roleAuthority : roleAuthorityList) {
                AuthorityBean authority = new AuthorityBean().selectById(roleAuthority.getAuthorityId());
                GrantedAuthority grantedAuthority = new AuthGrantedAuthority(authority.getAuthorityPath(),
                        authority.getAuthorityMethod());
                authorityList.add(grantedAuthority);
            }
        }
        return authorityList;
    }

    @Override
    public String getPassword() {
        return super.getUserPassword();
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