package com.example.cyjauth.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.User;
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
        extends ServiceImpl<UserMapper, User>
        implements IService<User> {

    public User addOne(User po) {
        po.insert();
        return po;
    }

    public void deleteOne(User po) {
        po.deleteById();
    }

    public User updateOne(User po) {
        po.updateById();
        return po;
    }

    public Page<User> findAll(User po, Integer pageNumber, Integer pageSize) {
        Page<User> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<User> queryWrapper = searchHandler(po);
        return new User().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<User> searchHandler(User po) {
        return new QueryWrapper<User>().lambda()
                .like(StringUtils.isNotEmpty(po.getUserName()),
                        User::getUserName, po.getUserName())
                .orderByAsc(User::getSortCode);
    }

    public Page<User> pageUserByEnterpriseId(User po, Integer pageNumber, Integer pageSize, String enterpriseId) {
        Page<User> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<User> queryWrapper = searchHandler(po);
        queryWrapper.eq(User::getEnterpriseId, enterpriseId);
        return new User().selectPage(page, queryWrapper);
    }

}