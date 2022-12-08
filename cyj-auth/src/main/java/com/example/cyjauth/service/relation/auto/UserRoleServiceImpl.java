package com.example.cyjauth.service.relation.auto;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Role;
import com.example.cyjcommon.entity.bean.User;
import com.example.cyjcommon.entity.relation.UserRole;
import com.example.cyjcommon.mapper.relation.UserRoleMapper;
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
public class UserRoleServiceImpl
        extends ServiceImpl<UserRoleMapper, UserRole>
        implements IService<UserRole> {

    public List<Role> roleByUser(String userId) {
        List<Role> roleList = new ArrayList<>();
        List<UserRole> userRoleList = new UserRole()
                .selectList(new QueryWrapper<UserRole>().lambda()
                        .eq(UserRole::getUserId, userId));
        for (UserRole userRole : userRoleList) {
            Role role = new Role().selectById(userRole.getRoleId());
            roleList.add(role);
        }
        return roleList;
    }

    public void roleSaveUser(String userId, List<String> roleIds) {
        if (StringUtils.isEmpty(userId)) {
            return;
        }
        boolean delete = new UserRole()
                .delete(new QueryWrapper<UserRole>().lambda()
                        .eq(UserRole::getUserId, userId)
                        .in(UserRole::getRoleId, roleIds));
        if (delete) {
            for (String roleId : roleIds) {
                UserRole userRole = new UserRole();
                userRole.setUserId(userId);
                userRole.setRoleId(roleId);
                userRole.insert();
            }
        }
    }

    public List<User> userByRole(String roleId) {
        List<User> userList = new ArrayList<>();
        List<UserRole> userRoleList = new UserRole()
                .selectList(new QueryWrapper<UserRole>().lambda()
                        .eq(UserRole::getRoleId, roleId));
        for (UserRole userRole : userRoleList) {
            User user = new User().selectById(userRole.getUserId());
            userList.add(user);
        }
        return userList;
    }

    public void userSaveRole(String roleId, List<String> userIds) {
        if (StringUtils.isEmpty(roleId)) {
            return;
        }
        boolean delete = new UserRole()
                .delete(new QueryWrapper<UserRole>().lambda()
                        .eq(UserRole::getRoleId, roleId)
                        .in(UserRole::getUserId, userIds));
        if (delete) {
            for (String userId : userIds) {
                UserRole userRole = new UserRole();
                userRole.setUserId(userId);
                userRole.setRoleId(roleId);
                userRole.insert();
            }
        }
    }
}
