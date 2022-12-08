package com.example.cyjauth.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Role;
import com.example.cyjcommon.mapper.bean.RoleMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleServiceImpl
        extends ServiceImpl<RoleMapper, Role>
        implements IService<Role> {

    public Role addOne(Role po) {
        po.insert();
        return po;
    }

    public void deleteOne(Role po) {
        po.deleteById();
    }

    public Role updateOne(Role po) {
        po.updateById();
        return po;
    }

    public Page<Role> findAll(Role po, Integer pageNumber, Integer pageSize) {
        Page<Role> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Role> queryWrapper = searchHandler(po);
        return new Role().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<Role> searchHandler(Role po) {
        return new QueryWrapper<Role>().lambda()
                .like(StringUtils.isNotEmpty(po.getRoleName()),
                        Role::getRoleName, po.getRoleName())
                .orderByAsc(Role::getSortCode);
    }

}
