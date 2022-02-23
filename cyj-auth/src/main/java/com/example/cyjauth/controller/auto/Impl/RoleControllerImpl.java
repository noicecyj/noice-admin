package com.example.cyjauth.controller.auto.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.controller.auto.RoleController;
import com.example.cyjauth.entity.auto.po.RolePO;
import com.example.cyjauth.service.auto.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-23
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
    public ResultVO roleSave(RolePO po) {
        if (po.getId() == null) {
            return ResultVO.success(roleService.addOne(po));
        }
        return ResultVO.success(roleService.updateOne(po));
    }

    @Override
    public void roleDelete(String id) {
        roleService.deleteOne(id);
    }

    @Override
    public ResultVO findRoleById(String id) {
        return ResultVO.success(roleService.findOneById(id));
    }

}
