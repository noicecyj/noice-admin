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

    @Operation(summary = "根据Role查询所有Authority")
    @PostMapping(value = "authorityByRole")
    public ResultVO authorityByRole(@RequestParam("roleId") String roleId) {
        if (roleId == null) {
            return ResultVO.failure();
        }
        return ResultVO.success(service.authorityByRole(roleId));
    }

    @Operation(summary = "根据Role保存Authority")
    @PostMapping(value = "authoritySaveRole")
    public ResultVO authoritySaveRole(@RequestParam("roleId") String roleId, @RequestBody List<String> authorityIds) {
        if (roleId == null) {
            return ResultVO.failure();
        }
        service.authoritySaveRole(roleId, authorityIds);
        return ResultVO.success();
    }

    @Operation(summary = "根据Authority查询所有Role")
    @PostMapping(value = "roleByAuthority")
    public ResultVO roleByAuthority(@RequestParam("authorityId") String authorityId) {
        if (authorityId == null) {
            return ResultVO.failure();
        }
        return ResultVO.success(service.roleByAuthority(authorityId));
    }

    @Operation(summary = "根据Authority保存Role")
    @PostMapping(value = "roleSaveAuthority")
    public ResultVO roleSaveAuthority(@RequestParam("authorityId") String authorityId, @RequestBody List<String> roleIds) {
        if (authorityId == null) {
            return ResultVO.failure();
        }
        service.roleSaveAuthority(authorityId, roleIds);
        return ResultVO.success();
    }

}
