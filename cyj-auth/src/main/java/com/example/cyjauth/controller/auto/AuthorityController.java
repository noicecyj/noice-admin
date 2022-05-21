package com.example.cyjauth.controller.auto;

import com.example.cyjcommon.entity.dto.RoleAuthorityDTO;
import com.example.cyjcommon.entity.dto.UserAuthorityDTO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Noice
 * @version 1.0
 */
@Tag(name = "Authority")
public interface AuthorityController {

    @Operation(summary = "查询所有Authority")
    @PostMapping(value = "authorityPage")
    ResultVO authorityPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存Authority")
    @PostMapping(value = "authoritySave")
    ResultVO authoritySave(@RequestBody AuthorityPO po);

    @Operation(summary = "删除Authority")
    @PostMapping(value = "authorityDelete")
    void authorityDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Authority")
    @PostMapping(value = "findAuthorityById")
    ResultVO findAuthorityById(@RequestParam("id") String id);

    @Operation(summary = "获取用户权限")
    @PostMapping(value = "getUserAuthority")
    ResultVO getUserAuthority(@RequestParam("userId") String userId);

    @Operation(summary = "设置用户权限")
    @PostMapping(value = "setUserAuthority")
    ResultVO setUserAuthority(@RequestBody UserAuthorityDTO userAuthorityDTO);

    @Operation(summary = "获取角色权限")
    @PostMapping(value = "getRoleAuthority")
    ResultVO getRoleAuthority(@RequestParam("roleId") String roleId);

    @Operation(summary = "设置角色权限")
    @PostMapping(value = "setRoleAuthority")
    ResultVO setRoleAuthority(@RequestBody RoleAuthorityDTO roleAuthorityDTO);

}
