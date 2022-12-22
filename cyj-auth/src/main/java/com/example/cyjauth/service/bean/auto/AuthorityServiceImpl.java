package com.example.cyjauth.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.AuthorityBean;
import com.example.cyjcommon.mapper.bean.AuthorityMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityServiceImpl
        extends ServiceImpl<AuthorityMapper, AuthorityBean>
        implements IService<AuthorityBean> {

    public AuthorityBean addOne(AuthorityBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(AuthorityBean po) {
        po.deleteById();
    }

    public AuthorityBean updateOne(AuthorityBean po) {
        po.updateById();
        return po;
    }

    public Page<AuthorityBean> findAll(AuthorityBean po, Integer pageNumber, Integer pageSize) {
        Page<AuthorityBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<AuthorityBean> queryWrapper = searchHandler(po);
        return new AuthorityBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<AuthorityBean> searchHandler(AuthorityBean po) {
        return new LambdaQueryWrapper<AuthorityBean>()
                .eq(StringUtils.isNotEmpty(po.getPersistentId()),
                        AuthorityBean::getPersistentId, po.getPersistentId())
                .like(StringUtils.isNotEmpty(po.getAuthorityName()),
                        AuthorityBean::getAuthorityName, po.getAuthorityName())
                .orderByAsc(AuthorityBean::getSortCode);
    }

}