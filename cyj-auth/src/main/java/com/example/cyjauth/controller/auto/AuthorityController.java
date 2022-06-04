package com.example.cyjauth.controller.auto;

import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.entity.po.AuthorityPO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

/**
 * @author Noice
 */
@Tag(name = "Authority")
public interface AuthorityController {

    @Operation(summary = "查询所有Authority")
    @PostMapping(value = "authorityPage")
    ResultVO authorityPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "根据AppService查询所有Authority")
    @PostMapping(value = "authorityPageByAppService")
    ResultVO authorityPage(@RequestParam("pageNumber") Integer pageNumber, @RequestBody AppServicePO appService);

    @Operation(summary = "根据Entity查询所有Authority")
    @PostMapping(value = "authorityPageByEntity")
    ResultVO authorityPage(@RequestParam("pageNumber") Integer pageNumber, @RequestBody EntityPO entity);

    @Operation(summary = "根据UserList查询所有Authority")
    @PostMapping(value = "authorityPageByUserList")
    ResultVO authorityPageByUserList(@RequestParam("pageNumber") Integer pageNumber, @RequestBody Set<String> userList);

    @Operation(summary = "根据RoleList查询所有Authority")
    @PostMapping(value = "authorityPageByRoleList")
    ResultVO authorityPageByRoleList(@RequestParam("pageNumber") Integer pageNumber, @RequestBody Set<String> roleList);

    @Operation(summary = "保存Authority")
    @PostMapping(value = "authoritySave")
    ResultVO authoritySave(@RequestBody @Validated AuthorityPO po, BindingResult bindingResult);

    @Operation(summary = "删除Authority")
    @PostMapping(value = "authorityDelete")
    ResultVO authorityDelete(@RequestBody AuthorityPO po);

}
