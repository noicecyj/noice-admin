package com.example.cyjauth.controller.auto.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.controller.auto.UserController;
import com.example.cyjauth.entity.auto.po.UserPO;
import com.example.cyjauth.service.auto.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
public class UserControllerImpl implements UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResultVO userPage(Integer pageNumber) {
        return ResultVO.success(userService.findAll(pageNumber));
    }

    @Override
    public ResultVO userSave(UserPO po) {
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
