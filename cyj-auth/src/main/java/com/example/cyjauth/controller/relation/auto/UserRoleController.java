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

    @Operation(summary = "根据UserId查询所有Role")
    @PostMapping(value = "roleByUserId")
    public ResultVO roleByUserId(@RequestParam("userId") String userId) {
        if (userId == null) {
            return ResultVO.failure();
        }
        return ResultVO.success(service.roleByUserId(userId));
    }

    @Operation(summary = "根据UserId保存Role")
    @PostMapping(value = "roleSaveUserId")
    public ResultVO roleSaveUserId(@RequestParam("userId") String userId, @RequestBody List<String> roleIds) {
        if (userId == null) {
            return ResultVO.failure();
        }
        service.roleSaveUserId(userId, roleIds);
        return ResultVO.success();
    }

    @Operation(summary = "根据RoleId查询所有User")
    @PostMapping(value = "userByRoleId")
    public ResultVO userByRoleId(@RequestParam("roleId") String roleId) {
        if (roleId == null) {
            return ResultVO.failure();
        }
        return ResultVO.success(service.userByRoleId(roleId));
    }

    @Operation(summary = "根据UserId保存Role")
    @PostMapping(value = "userSaveRoleId")
    public ResultVO userSaveRoleId(@RequestParam("roleId") String roleId, @RequestBody List<String> userIds) {
        if (roleId == null) {
            return ResultVO.failure();
        }
        service.userSaveRoleId(roleId, userIds);
        return ResultVO.success();
    }


}
