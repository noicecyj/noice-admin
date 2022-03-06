package com.example.cyjauth.service.custom.Impl;

import com.example.cyjauth.dao.custom.UserCustomDao;
import com.example.cyjauth.entity.custom.bo.AuthUserDetails;
import com.example.cyjauth.entity.custom.po.UserCustomPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjauth.service.custom.UserCustomService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserCustomServiceImpl extends BaseService implements UserCustomService, UserDetailsService {

    private StringRedisTemplate redisTemplate;
    private UserCustomDao userCustomDao;

    @Autowired
    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Autowired
    public void setUserCustomDao(UserCustomDao userCustomDao) {
        this.userCustomDao = userCustomDao;
    }

    @Override
    public UserCustomPO findAuthUserByUsername(String username) {
        return userCustomDao.findByUserName(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String flagKey = "loginFailFlag:" + username;
        String value = redisTemplate.opsForValue().get(flagKey);
        if (StringUtils.isNotBlank(value)) {
            //超过限制次数
            throw new UsernameNotFoundException("登录错误次数超过限制");
        }
        //查询用户信息
        UserCustomPO po = findAuthUserByUsername(username);
        if (null == po) {
            throw new UsernameNotFoundException("当前用户不存在");
        }
        if (po.getRole() == null || po.getRole().isEmpty()) {
            throw new UsernameNotFoundException("当前用户无角色");
        }
        return new AuthUserDetails(po);
    }

}
