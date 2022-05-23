package com.example.cyjauth.controller.auto;

import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.entity.po.RolePO;
import com.example.cyjcommon.entity.po.UserPO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

/**
 * @author Noice
 * @version 1.0
 */
@Tag(name = "User")
public interface UserController {

    @Operation(summary = "查询所有User")
    @PostMapping(value = "userPage")
    ResultVO userPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "根据RoleList查询所有User")
    @PostMapping(value = "userPageByRoleList")
    ResultVO userPageByRoleList(@RequestParam("pageNumber") Integer pageNumber, @RequestBody Set<RolePO> roleList);

    @Operation(summary = "根据AuthorityList查询所有User")
    @PostMapping(value = "userPageByRoleList")
    ResultVO userPageByAuthorityList(@RequestParam("pageNumber") Integer pageNumber, @RequestBody Set<AuthorityPO> authorityList);

    @Operation(summary = "保存User")
    @PostMapping(value = "userSave")
    ResultVO userSave(@RequestBody UserPO po);

    @Operation(summary = "删除User")
    @PostMapping(value = "userDelete")
    void userDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询User")
    @PostMapping(value = "findUserById")
    ResultVO findUserById(@RequestParam("id") String id);

}
