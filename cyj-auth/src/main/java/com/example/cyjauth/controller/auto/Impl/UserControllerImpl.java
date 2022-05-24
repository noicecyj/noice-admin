package com.example.cyjauth.controller.auto.Impl;

import com.example.cyjcommon.entity.po.EnterprisePO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.controller.auto.UserController;
import com.example.cyjauth.service.auto.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author Noice
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
    public ResultVO userPage(Integer pageNumber, EnterprisePO enterprise) {
        return ResultVO.success(userService.findAll(pageNumber, enterprise));
    }

    @Override
    public ResultVO userPageByRoleList(Integer pageNumber, Set<RolePO> roleList) {
        return ResultVO.success(userService.findAllByRoleList(pageNumber, roleList));
    }

    @Override
    public ResultVO userPageByAuthorityList(Integer pageNumber, Set<AuthorityPO> authorityList) {
        return ResultVO.success(userService.findAllByAuthorityList(pageNumber, authorityList));
    }

    @Override
    public ResultVO userSave(UserPO po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(userService.addOne(po));
        }
        return ResultVO.success(userService.updateOne(po));
    }

    @Override
    public ResultVO userDelete(UserPO po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        userService.deleteOne(po);
        return ResultVO.success();
    }

}
