package com.example.cyjauth.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.RoleBean;
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
        extends ServiceImpl<RoleMapper, RoleBean>
        implements IService<RoleBean> {

    public RoleBean addOne(RoleBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(RoleBean po) {
        po.deleteById();
    }

    public RoleBean updateOne(RoleBean po) {
        po.updateById();
        return po;
    }

    public Page<RoleBean> findAll(RoleBean po, Integer pageNumber, Integer pageSize) {
        Page<RoleBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<RoleBean> queryWrapper = searchHandler(po);
        return new RoleBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<RoleBean> searchHandler(RoleBean po) {
        return new LambdaQueryWrapper<RoleBean>()
                .like(StringUtils.isNotEmpty(po.getRoleName()),
                        RoleBean::getRoleName, po.getRoleName())
                .orderByAsc(RoleBean::getSortCode);
    }

}