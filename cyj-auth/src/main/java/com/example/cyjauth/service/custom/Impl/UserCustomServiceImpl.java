package com.example.cyjauth.service.custom.Impl;

import com.example.cyjauth.dao.UserCustomDao;
import com.example.cyjauth.entity.bo.AuthUserDetails;
import com.example.cyjauth.service.custom.UserCustomService;
import com.example.cyjcommon.dao.AuthorityDao;
import com.example.cyjcommon.dao.RoleDao;
import com.example.cyjcommon.entity.AuthorityPO;
import com.example.cyjcommon.entity.RolePO;
import com.example.cyjcommon.entity.UserPO;
import com.example.cyjcommon.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
    private UserCustomDao userDao;
    private RoleDao roleDao;
    private AuthorityDao authorityDao;

    @Autowired
    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Autowired
    public void setUserDao(UserCustomDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Autowired
    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    @Override
    public UserPO findAuthUserByUsername(String username) {
        return userDao.findByUserName(username);
    }

    @Override
    public Set<String> getUserRole(String userId) {
        Optional<UserPO> userPOOptional = userDao.findById(userId);
        if (userPOOptional.isPresent()) {
            UserPO userPO = userPOOptional.get();
            Set<String> roleIds = new HashSet<>();
            if (userPO.getRole() != null) {
                for (RolePO rolePO : userPO.getRole()) {
                    roleIds.add(rolePO.getId());
                }
            }
            return roleIds;
        }
        return null;
    }

    @Override
    public void setUserRole(String userId, Set<String> roleIds) {
        Optional<UserPO> userPOOptional = userDao.findById(userId);
        if (userPOOptional.isPresent()) {
            UserPO userPO = userPOOptional.get();
            Set<RolePO> rolePOSet = new HashSet<>();
            for (String roleId : roleIds) {
                Optional<RolePO> rolePOOptional = roleDao.findById(roleId);
                if (rolePOOptional.isPresent()) {
                    RolePO rolePO = rolePOOptional.get();
                    rolePOSet.add(rolePO);
                }
            }
            userPO.setRole(rolePOSet);
            userDao.saveAndFlush(userPO);
        }
    }

    @Override
    public Set<String> getUserAuthority(String userId) {
        Optional<UserPO> userPOOptional = userDao.findById(userId);
        if (userPOOptional.isPresent()) {
            UserPO userPO = userPOOptional.get();
            Set<String> authorityIds = new HashSet<>();
            if (userPO.getAuthority() != null) {
                for (AuthorityPO authorityPO : userPO.getAuthority()) {
                    authorityIds.add(authorityPO.getId());
                }
            }
            return authorityIds;
        }
        return null;
    }

    @Override
    public void setUserAuthority(String userId, Set<String> authorityIds) {
        Optional<UserPO> userPOOptional = userDao.findById(userId);
        if (userPOOptional.isPresent()) {
            UserPO userPO = userPOOptional.get();
            Set<AuthorityPO> authorityPOSet = new HashSet<>();
            for (String authorityId : authorityIds) {
                Optional<AuthorityPO> authorityPOOptional = authorityDao.findById(authorityId);
                if (authorityPOOptional.isPresent()) {
                    AuthorityPO authorityPO = authorityPOOptional.get();
                    authorityPOSet.add(authorityPO);
                }
            }
            userPO.setAuthority(authorityPOSet);
            userDao.saveAndFlush(userPO);
        }
    }

    @Override
    public void resetPassword(String userId, String newPassword, String checkPassword) {
        if (newPassword.equals(checkPassword)) {
            Optional<UserPO> userPOOptional = userDao.findById(userId);
            if (userPOOptional.isPresent()) {
                UserPO userPO = userPOOptional.get();
                BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                String password = passwordEncoder.encode(newPassword);
                userPO.setPassword(password);
                userDao.saveAndFlush(userPO);
            }
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
        UserPO po = findAuthUserByUsername(username);
        if (null == po) {
            throw new UsernameNotFoundException("当前用户不存在");
        }
        if (po.getRole() == null || po.getRole().isEmpty()) {
            throw new UsernameNotFoundException("当前用户无角色");
        }
        return new AuthUserDetails(po);
    }

}
