package com.example.cyjauth.service.custom.Impl;

import com.example.cyjauth.dao.custom.RoleCustomDao;
import com.example.cyjauth.dao.custom.UserCustomDao;
import com.example.cyjauth.entity.custom.bo.AuthUserDetails;
import com.example.cyjauth.entity.custom.po.RoleCustomPO;
import com.example.cyjauth.entity.custom.po.UserCustomPO;
import com.example.cyjauth.service.custom.UserCustomService;
import com.example.cyjcommon.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

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
    private RoleCustomDao roleCustomDao;

    @Autowired
    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Autowired
    public void setUserCustomDao(UserCustomDao userCustomDao) {
        this.userCustomDao = userCustomDao;
    }

    @Autowired
    public void setRoleCustomDao(RoleCustomDao roleCustomDao) {
        this.roleCustomDao = roleCustomDao;
    }

    @Override
    public UserCustomPO findAuthUserByUsername(String username) {
        return userCustomDao.findByUserName(username);
    }

    @Override
    public Set<String> getUserRole(String userId) {
        Optional<UserCustomPO> userCustomPOOptional = userCustomDao.findById(userId);
        if (userCustomPOOptional.isPresent()) {
            UserCustomPO userCustomPO = userCustomPOOptional.get();
            Set<String> roleIds = new HashSet<>();
            if (userCustomPO.getRole() != null) {
                for (RoleCustomPO roleCustomPO : userCustomPO.getRole()) {
                    roleIds.add(roleCustomPO.getId());
                }
            }
            return roleIds;
        }
        return null;
    }

    @Override
    public void setUserRole(String userId, Set<String> roleIds) {
        Optional<UserCustomPO> userCustomPOOptional = userCustomDao.findById(userId);
        if (userCustomPOOptional.isPresent()) {
            UserCustomPO userCustomPO = userCustomPOOptional.get();
            Set<RoleCustomPO> roleCustomPOSet = new HashSet<>();
            for (String roleId : roleIds) {
                Optional<RoleCustomPO> rolePOOptional = roleCustomDao.findById(roleId);
                if (rolePOOptional.isPresent()) {
                    RoleCustomPO roleCustomPO = rolePOOptional.get();
                    roleCustomPOSet.add(roleCustomPO);
                }
            }
            userCustomPO.setRole(roleCustomPOSet);
            userCustomDao.saveAndFlush(userCustomPO);
        }
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
