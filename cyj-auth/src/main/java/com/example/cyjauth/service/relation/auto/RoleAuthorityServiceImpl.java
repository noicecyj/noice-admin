package com.example.cyjauth.service.relation.auto;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Authority;
import com.example.cyjcommon.entity.bean.Role;
import com.example.cyjcommon.entity.relation.RoleAuthority;
import com.example.cyjcommon.mapper.relation.RoleAuthorityMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleAuthorityServiceImpl
        extends ServiceImpl<RoleAuthorityMapper, RoleAuthority>
        implements IService<RoleAuthority> {

    public List<Role> roleByAuthority(String authorityId) {
        List<Role> roleList = new ArrayList<>();
        List<RoleAuthority> roleAuthorityList = new RoleAuthority()
                .selectList(new QueryWrapper<RoleAuthority>().lambda()
                        .eq(RoleAuthority::getAuthorityId, authorityId));
        for (RoleAuthority roleAuthority : roleAuthorityList) {
            Role role = new Role().selectById(roleAuthority.getRoleId());
            roleList.add(role);
        }
        return roleList;
    }

    public void roleSaveAuthority(String authorityId, List<String> roleIds) {
        if (StringUtils.isEmpty(authorityId)) {
            return;
        }
        boolean delete = new RoleAuthority()
                .delete(new QueryWrapper<RoleAuthority>().lambda()
                        .eq(RoleAuthority::getAuthorityId, authorityId)
                        .in(RoleAuthority::getRoleId, roleIds));
        if (delete) {
            for (String roleId : roleIds) {
                RoleAuthority roleAuthority = new RoleAuthority();
                roleAuthority.setAuthorityId(authorityId);
                roleAuthority.setRoleId(roleId);
                roleAuthority.insert();
            }
        }
    }

    public List<Authority> authorityByRole(String roleId) {
        List<Authority> authorityList = new ArrayList<>();
        List<RoleAuthority> roleAuthorityList = new RoleAuthority()
                .selectList(new QueryWrapper<RoleAuthority>().lambda()
                        .eq(RoleAuthority::getRoleId, roleId));
        for (RoleAuthority roleAuthority : roleAuthorityList) {
            Authority authority = new Authority().selectById(roleAuthority.getAuthorityId());
            authorityList.add(authority);
        }
        return authorityList;
    }

    public void authoritySaveRole(String roleId, List<String> authorityIds) {
        if (StringUtils.isEmpty(roleId)) {
            return;
        }
        boolean delete = new RoleAuthority()
                .delete(new QueryWrapper<RoleAuthority>().lambda()
                        .eq(RoleAuthority::getRoleId, roleId)
                        .in(RoleAuthority::getAuthorityId, authorityIds));
        if (delete) {
            for (String authorityId : authorityIds) {
                RoleAuthority roleAuthority = new RoleAuthority();
                roleAuthority.setAuthorityId(authorityId);
                roleAuthority.setRoleId(roleId);
                roleAuthority.insert();
            }
        }
    }
}
