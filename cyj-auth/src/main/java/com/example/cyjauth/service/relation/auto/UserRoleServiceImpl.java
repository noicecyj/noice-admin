package com.example.cyjauth.service.relation.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.relation.UserRole;
import com.example.cyjcommon.mapper.relation.UserRoleMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserRoleServiceImpl
        extends ServiceImpl<UserRoleMapper, UserRole>
        implements IService<UserRole> {

    public List<UserRole> getUserRole(UserRole po) {
        return new UserRole().selectList(new LambdaQueryWrapper<UserRole>()
                .eq(StringUtils.isNotEmpty(po.getUserId()),
                        UserRole::getUserId, po.getUserId())
                .eq(StringUtils.isNotEmpty(po.getRoleId()),
                        UserRole::getRoleId, po.getRoleId())
        );
    }

    public void setUserRole(UserRole po, List<UserRole> newUserRoleList) {
        List<UserRole> oldUserRoleList = getUserRole(po);
        for (UserRole oldUserRole : oldUserRoleList) {
            oldUserRole.deleteById();
        }
        for (UserRole newUserRole : newUserRoleList) {
            newUserRole.insert();
        }
    }

}