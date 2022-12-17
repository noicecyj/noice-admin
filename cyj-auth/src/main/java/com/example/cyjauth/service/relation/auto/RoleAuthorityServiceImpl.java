package com.example.cyjauth.service.relation.auto;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.relation.RoleAuthority;
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
        extends ServiceImpl<RoleAuthorityMapper, RoleAuthority>
        implements IService<RoleAuthority> {

    public List<RoleAuthority> getRoleAuthority(RoleAuthority po) {
        return new RoleAuthority().selectList(new QueryWrapper<RoleAuthority>().lambda()
                .eq(StringUtils.isNotEmpty(po.getAuthorityId()),
                        RoleAuthority::getAuthorityId, po.getAuthorityId())
                .eq(StringUtils.isNotEmpty(po.getRoleId()),
                        RoleAuthority::getRoleId, po.getRoleId())
        );
    }

    public void setRoleAuthority(RoleAuthority po, List<RoleAuthority> newPoList) {
        List<RoleAuthority> oldRoleAuthorityList = getRoleAuthority(po);
        for (RoleAuthority oldRoleAuthority : oldRoleAuthorityList) {
            oldRoleAuthority.deleteById();
        }
        for (RoleAuthority newRoleAuthority : newPoList) {
            newRoleAuthority.insert();
        }
    }

}
