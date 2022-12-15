package com.example.cyjauth.controller.relation.auto;

import com.example.cyjauth.service.relation.auto.RoleAuthorityServiceImpl;
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
@Tag(name = "RoleAuthority")
public class RoleAuthorityController {

    private RoleAuthorityServiceImpl service;

    @Autowired
    public void setService(RoleAuthorityServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "根据RoleId查询所有Authority")
    @PostMapping(value = "authorityByRoleId")
    public ResultVO authorityByRoleId(@RequestParam("roleId") String roleId) {
        if (roleId == null) {
            return ResultVO.failure();
        }
        return ResultVO.success(service.authorityByRoleId(roleId));
    }

    @Operation(summary = "根据RoleId保存Authority")
    @PostMapping(value = "authoritySaveRoleId")
    public ResultVO authoritySaveRoleId(@RequestParam("roleId") String roleId, @RequestBody List<String> authorityIds) {
        if (roleId == null) {
            return ResultVO.failure();
        }
        service.authoritySaveRoleId(roleId, authorityIds);
        return ResultVO.success();
    }

    @Operation(summary = "根据AuthorityId查询所有Role")
    @PostMapping(value = "roleByAuthorityId")
    public ResultVO roleByAuthorityId(@RequestParam("authorityId") String authorityId) {
        if (authorityId == null) {
            return ResultVO.failure();
        }
        return ResultVO.success(service.roleByAuthorityId(authorityId));
    }

    @Operation(summary = "根据AuthorityId保存Role")
    @PostMapping(value = "roleSaveAuthorityId")
    public ResultVO roleSaveAuthorityId(@RequestParam("authorityId") String authorityId, @RequestBody List<String> roleIds) {
        if (authorityId == null) {
            return ResultVO.failure();
        }
        service.roleSaveAuthorityId(authorityId, roleIds);
        return ResultVO.success();
    }

}
