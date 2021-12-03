package com.example.cyjauth.controller.Impl;

import com.example.cyjauth.controller.IndexController;
import com.example.cyjauth.dao.UserDao;
import com.example.cyjauth.entity.po.UserPO;
import com.example.cyjauth.entity.vo.PasswordVO;
import com.example.cyjcommon.utils.ResultCode;
import com.example.cyjcommon.utils.ResultVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
public class IndexControllerImpl implements IndexController {

        private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        private StringRedisTemplate stringRedisTemplate;
        private UserDao userDao;

        @Autowired
        public void setUserDao(UserDao userDao) {
                this.userDao = userDao;
        }

        @Autowired
        public void setStringRedisTemplate(StringRedisTemplate stringRedisTemplate) {
                this.stringRedisTemplate = stringRedisTemplate;
        }

        @Override
        public String exit(@RequestParam("userName") String userName) {
                String token = stringRedisTemplate.opsForValue().get("token_" + userName);
                if (StringUtils.isBlank(token)) {
                        return ResultVO.failure(ResultCode.UNAUTHORIZED).getMsg();
                }
                stringRedisTemplate.delete("token_" + userName);
                return ResultVO.success().getMsg();
        }

        @Override
        public Boolean setPassword(PasswordVO passwordVO) {
                if (passwordVO.getCheckPassword().equals(passwordVO.getNewPassword())) {
                        Optional<UserPO> po = userDao.findById(passwordVO.getId());
                        if (po.isPresent()) {
                                UserPO user = po.get();
                                String hash = encoder.encode(user.getPassword());
                                user.setPassword(hash);
                                userDao.save(user);
                                return true;
                        }
                }
                return false;
        }

}