package com.example.cyjauth.controller.custom.Impl;

import com.example.cyjauth.controller.custom.RoleCustomController;
import com.example.cyjauth.entity.custom.dto.RoleAuthorityDTO;
import com.example.cyjauth.service.custom.RoleCustomService;
import com.example.cyjcommon.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
public class RoleCustomControllerImpl implements RoleCustomController {

    private RoleCustomService roleCustomService;

    @Autowired
    public void setRoleCustomService(RoleCustomService roleCustomService) {
        this.roleCustomService = roleCustomService;
    }

    @Override
    public ResultVO getRoleAuthority(String roleId) {
        Set<String> roleAuthority = roleCustomService.getRoleAuthority(roleId);
        return ResultVO.success(roleAuthority);
    }

    @Override
    public ResultVO setRoleAuthority(RoleAuthorityDTO roleAuthorityDTO) {
        roleCustomService.setRoleAuthority(roleAuthorityDTO.getRoleId(), roleAuthorityDTO.getAuthorityIds());
        return ResultVO.success();
    }
}
