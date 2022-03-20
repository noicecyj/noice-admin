package com.example.cyjauth.controller.custom;

import com.example.cyjauth.entity.custom.dto.UserAuthorityDTO;
import com.example.cyjauth.entity.custom.dto.UserRoleDTO;
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
@Tag(name = "User")
public interface UserCustomController {

    @Operation(summary = "获取用户角色")
    @PostMapping(value = "getUserRole")
    ResultVO getUserRole(@RequestParam("userId") String userId);

    @Operation(summary = "设置用户角色")
    @PostMapping(value = "setUserRole")
    ResultVO setUserRole(@RequestBody UserRoleDTO userRoleDTO);

    @Operation(summary = "获取用户权限")
    @PostMapping(value = "getUserAuthority")
    ResultVO getUserAuthority(@RequestParam("userId") String userId);

    @Operation(summary = "设置用户权限")
    @PostMapping(value = "setUserAuthority")
    ResultVO setUserAuthority(@RequestBody UserAuthorityDTO userAuthorityDTO);

}
