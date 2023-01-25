package com.example.cyjuser.service.relation.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.relation.RoleAuthorityRelation;
import com.example.cyjcommon.mapper.relation.RoleAuthorityMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleAuthorityServiceImpl
        extends ServiceImpl<RoleAuthorityMapper, RoleAuthorityRelation>
        implements IService<RoleAuthorityRelation> {

    public List<RoleAuthorityRelation> getRoleAuthority(RoleAuthorityRelation po) {
        return new RoleAuthorityRelation().selectList(new LambdaQueryWrapper<RoleAuthorityRelation>()
                .eq(StringUtils.isNotEmpty(po.getRoleId()),
                        RoleAuthorityRelation::getRoleId, po.getRoleId())
                .eq(StringUtils.isNotEmpty(po.getAuthorityId()),
                        RoleAuthorityRelation::getAuthorityId, po.getAuthorityId())
        );
    }

    public void setRoleAuthority(RoleAuthorityRelation po, List<RoleAuthorityRelation> newRoleAuthorityList) {
        List<RoleAuthorityRelation> oldRoleAuthorityList = getRoleAuthority(po);
        for (RoleAuthorityRelation oldRoleAuthority : oldRoleAuthorityList) {
            oldRoleAuthority.deleteById();
        }
        for (RoleAuthorityRelation newRoleAuthority : newRoleAuthorityList) {
            newRoleAuthority.insert();
        }
    }

}