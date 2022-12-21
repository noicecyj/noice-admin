package com.example.cyjauth.service.relation.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.relation.UserRoleRelation;
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
        extends ServiceImpl<UserRoleMapper, UserRoleRelation>
        implements IService<UserRoleRelation> {

    public List<UserRoleRelation> getUserRole(UserRoleRelation po) {
        return new UserRoleRelation().selectList(new LambdaQueryWrapper<UserRoleRelation>()
                .eq(StringUtils.isNotEmpty(po.getUserId()),
                        UserRoleRelation::getUserId, po.getUserId())
                .eq(StringUtils.isNotEmpty(po.getRoleId()),
                        UserRoleRelation::getRoleId, po.getRoleId())
        );
    }

    public void setUserRole(UserRoleRelation po, List<UserRoleRelation> newUserRoleList) {
        List<UserRoleRelation> oldUserRoleList = getUserRole(po);
        for (UserRoleRelation oldUserRole : oldUserRoleList) {
            oldUserRole.deleteById();
        }
        for (UserRoleRelation newUserRole : newUserRoleList) {
            newUserRole.insert();
        }
    }

}