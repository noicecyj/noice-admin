package com.example.cyjauth.controller.custom;

import com.example.cyjauth.entity.dto.RoleAuthorityDTO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
@Tag(name = "Role")
public interface RoleCustomController {

    @Operation(summary = "获取角色权限")
    @PostMapping(value = "getRoleAuthority")
    ResultVO getRoleAuthority(@RequestParam("roleId") String roleId);

    @Operation(summary = "设置角色权限")
    @PostMapping(value = "setRoleAuthority")
    ResultVO setRoleAuthority(@RequestBody RoleAuthorityDTO roleAuthorityDTO);

}
