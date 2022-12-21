package com.example.cyjauth.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.UserBean;
import com.example.cyjcommon.mapper.bean.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl
        extends ServiceImpl<UserMapper, UserBean>
        implements IService<UserBean> {

    public UserBean addOne(UserBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(UserBean po) {
        po.deleteById();
    }

    public UserBean updateOne(UserBean po) {
        po.updateById();
        return po;
    }

    public Page<UserBean> findAll(UserBean po, Integer pageNumber, Integer pageSize) {
        Page<UserBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<UserBean> queryWrapper = searchHandler(po);
        return new UserBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<UserBean> searchHandler(UserBean po) {
        return new LambdaQueryWrapper<UserBean>()
                .eq(StringUtils.isNotEmpty(po.getEnterpriseId()),
                        UserBean::getEnterpriseId, po.getEnterpriseId())
                .like(StringUtils.isNotEmpty(po.getUserName()),
                        UserBean::getUserName, po.getUserName())
                .orderByAsc(UserBean::getSortCode);
    }

}