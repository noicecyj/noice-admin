package com.example.cyjauth.controller.relation.auto;

import com.example.cyjauth.service.relation.auto.UserRoleServiceImpl;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
@Tag(name = "UserRole")
public class UserRoleController {

    private UserRoleServiceImpl service;

    @Autowired
    public void setService(UserRoleServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "根据User查询所有Role")
    @PostMapping(value = "roleByUser")
    public ResultVO roleByUser(@RequestParam("userId") String userId) {
        if (userId == null) {
            return ResultVO.failure();
        }
        return ResultVO.success(service.roleByUser(userId));
    }

    @Operation(summary = "根据User保存Role")
    @PostMapping(value = "roleSaveUser")
    public ResultVO roleSaveUser(@RequestParam("userId") String userId, @RequestBody List<String> roleIds) {
        if (userId == null) {
            return ResultVO.failure();
        }
        service.roleSaveUser(userId, roleIds);
        return ResultVO.success();
    }

    @Operation(summary = "根据Role查询所有User")
    @PostMapping(value = "userByRole")
    public ResultVO userByRole(@RequestParam("roleId") String roleId) {
        if (roleId == null) {
            return ResultVO.failure();
        }
        return ResultVO.success(service.userByRole(roleId));
    }

    @Operation(summary = "根据User保存Role")
    @PostMapping(value = "userSaveRole")
    public ResultVO userSaveRole(@RequestParam("roleId") String roleId, @RequestBody List<String> userIds) {
        if (roleId == null) {
            return ResultVO.failure();
        }
        service.userSaveRole(roleId, userIds);
        return ResultVO.success();
    }


}
