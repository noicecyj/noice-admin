package com.example.cyjauth.controller.Impl;

import com.example.cyjauth.controller.UserController;
import com.example.cyjauth.entity.po.RolePO;
import com.example.cyjauth.entity.po.UserPO;
import com.example.cyjauth.service.Impl.UserServiceImpl;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjcommon.utils.VoPoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
public class UserControllerImpl implements UserController {

        private UserServiceImpl userService;

        @Autowired
        public void setUserService(UserServiceImpl userService) {
                this.userService = userService;
        }

        @Override
        public ResultVO userFindAll(Integer pageNumber, Integer pageSize, String sortCode) {
                return ResultVO.success(userService.findAll(pageNumber - 1, pageSize, sortCode));
        }

        @Override
        public ResultVO userSave(Map<String, Object> vo) {
                UserPO po = userService.findOneById(vo.get("id").toString());
                Set<RolePO> role = po.getRole();
                Set<AuthorityPO> authority = po.getAuthority();
                VoPoConverter.copyProperties(vo, po);
                po.setRole(role);
                po.setAuthority(authority);
                if (po.getId() == null) {
                        return ResultVO.success(userService.addOne(po));
                }
                return ResultVO.success(userService.updateOne(po));
        }

        @Override
        public void userDelete(String id) {
                userService.deleteOne(id);
        }

        @Override
        public ResultVO findUserById(String id) {
                return ResultVO.success(userService.findOneById(id));
        }

}
