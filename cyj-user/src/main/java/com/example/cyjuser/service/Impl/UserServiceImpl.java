package com.example.cyjuser.service.Impl;

import com.example.cyjcommon.service.Impl.BaseService;
import com.example.cyjuser.dao.UserDao;
import com.example.cyjuser.entity.bo.AuthUserDetails;
import com.example.cyjuser.entity.po.UserPO;
import com.example.cyjuser.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends BaseService implements UserService, UserDetailsService {

        @Value("${security.loginAfterTime}")
        private Integer loginAfterTime;
        private StringRedisTemplate redisTemplate;
        private UserDao userDao;

        @Autowired
        public void setRedisTemplate(StringRedisTemplate redisTemplate) {
                this.redisTemplate = redisTemplate;
        }

        @Autowired
        public void setUserDao(UserDao userDao) {
                this.userDao = userDao;
        }

        @Override
        public UserPO findAuthUserByUsername(String username) {
                return userDao.findByUserName(username);
        }

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                String flagKey = "loginFailFlag:" + username;
                String value = redisTemplate.opsForValue().get(flagKey);
                if (StringUtils.isNotBlank(value)) {
                        //超过限制次数
                        throw new UsernameNotFoundException("登录错误次数超过限制，请" + loginAfterTime + "分钟后再试");
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
