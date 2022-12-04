package com.example.cyjauth.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjauth.mapper.bean.AuthorityMapper;
import com.example.cyjcommon.entity.bean.Authority;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityServiceImpl
        extends ServiceImpl<AuthorityMapper, Authority>
        implements IService<Authority> {

    public Authority addOne(Authority po) {
        po.insert();
        return po;
    }

    public void deleteOne(Authority po) {
        po.deleteById();
    }

    public Authority updateOne(Authority po) {
        po.updateById();
        return po;
    }

    public Page<Authority> findAll(Authority po, Integer pageNumber, Integer pageSize) {
        Page<Authority> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Authority> queryWrapper = searchHandler(po);
        return new Authority().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<Authority> searchHandler(Authority po) {
        return new QueryWrapper<Authority>().lambda()
                .like(StringUtils.isNotEmpty(po.getAuthorityName()),
                        Authority::getAuthorityName, po.getAuthorityName())
                .orderByAsc(Authority::getSortCode);
    }

    public Page<Authority> pageAuthorityByAppService(Authority po, Integer pageNumber, Integer pageSize, String appServiceId) {
        Page<Authority> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Authority> queryWrapper = searchHandler(po);
        queryWrapper.eq(Authority::getAppServiceId, appServiceId);
        return new Authority().selectPage(page, queryWrapper);
    }

    public Page<Authority> pageAuthorityByPersistent(Authority po, Integer pageNumber, Integer pageSize, String persistentId) {
        Page<Authority> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Authority> queryWrapper = searchHandler(po);
        queryWrapper.eq(Authority::getPersistentId, persistentId);
        return new Authority().selectPage(page, queryWrapper);
    }
}
