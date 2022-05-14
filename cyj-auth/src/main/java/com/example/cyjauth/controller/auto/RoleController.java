package com.example.cyjauth.controller.auto;

import com.example.cyjcommon.entity.dto.UserRoleDTO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Tag(name = "Role")
public interface RoleController {

    @Operation(summary = "查询所有Role")
    @PostMapping(value = "rolePage")
    ResultVO rolePage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存Role")
    @PostMapping(value = "roleSave")
    ResultVO roleSave(@RequestBody RolePO po);

    @Operation(summary = "删除Role")
    @PostMapping(value = "roleDelete")
    void roleDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Role")
    @PostMapping(value = "findRoleById")
    ResultVO findRoleById(@RequestParam("id") String id);

    @Operation(summary = "获取用户角色")
    @PostMapping(value = "getUserRole")
    ResultVO getUserRole(@RequestParam("userId") String userId);

    @Operation(summary = "设置用户角色")
    @PostMapping(value = "setUserRole")
    ResultVO setUserRole(@RequestBody UserRoleDTO userRoleDTO);

}
