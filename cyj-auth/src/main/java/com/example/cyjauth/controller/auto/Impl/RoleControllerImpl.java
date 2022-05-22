package com.example.cyjauth.controller.auto.Impl;

import com.example.cyjauth.controller.auto.RoleController;
import com.example.cyjauth.service.auto.RoleService;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.utils.ResultVO;
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
public class RoleControllerImpl implements RoleController {

    private RoleService roleService;

    @Autowired
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public ResultVO rolePage(Integer pageNumber) {
        return ResultVO.success(roleService.findAll(pageNumber));
    }

    @Override
    public ResultVO rolePageByUserList(Integer pageNumber, Set<UserPO> userList) {
        return ResultVO.success(roleService.findAllByUserList(pageNumber, userList));
    }

    @Override
    public ResultVO roleSave(RolePO po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(roleService.addOne(po));
        }
        return ResultVO.success(roleService.updateOne(po));
    }

    @Override
    public ResultVO roleDelete(RolePO po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        roleService.deleteOne(po);
        return ResultVO.success();
    }

}
