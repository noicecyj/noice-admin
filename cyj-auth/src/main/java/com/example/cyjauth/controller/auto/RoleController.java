package com.example.cyjauth.controller.auto;

import com.example.cyjauth.service.auto.RoleService;
import com.example.cyjcommon.controller.autoController;
import com.example.cyjcommon.entity.Role;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
@Tag(name = "Role")
public class RoleController implements autoController<Role> {

    private RoleService service;

    @Autowired
    public void setService(RoleService service) {
        this.service = service;
    }

    @Override
    @Operation(summary = "分页查询所有Role")
    @PostMapping(value = "pageRole")
    public ResultVO page(Integer pageNumber) {
        return ResultVO.success(service.findAll(pageNumber));
    }

    @Override
    @Operation(summary = "保存Role")
    @PostMapping(value = "saveRole")
    public ResultVO save(Role po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Override
    @Operation(summary = "删除Role")
    @PostMapping(value = "deleteRole")
    public ResultVO delete(Role po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据User查询所有Role")
    @PostMapping(value = "roleByUser")
    public ResultVO roleByUser(String userId) {
        if (userId == null) {
            return ResultVO.failure();
        }
        return ResultVO.success(service.roleByUser(userId));
    }

    @Operation(summary = "根据User保存Role")
    @PostMapping(value = "roleSaveUser")
    public ResultVO roleSaveUser(String userId, Set<String> roleIds) {
        if (userId == null) {
            return ResultVO.failure();
        }
        service.roleSaveUser(userId, roleIds);
        return ResultVO.success();
    }

}
