package com.example.cyjauth.controller.custom.Impl;

import com.example.cyjauth.controller.custom.UserCustomController;
import com.example.cyjauth.entity.custom.dto.PasswordDTO;
import com.example.cyjauth.entity.custom.dto.UserAuthorityDTO;
import com.example.cyjauth.entity.custom.dto.UserRoleDTO;
import com.example.cyjauth.service.custom.UserCustomService;
import com.example.cyjcommon.utils.ResultCode;
import com.example.cyjcommon.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
public class UserCustomControllerImpl implements UserCustomController {

    private UserCustomService userCustomService;

    @Autowired
    public void setUserCustomService(UserCustomService userCustomService) {
        this.userCustomService = userCustomService;
    }

    @Override
    public ResultVO getUserRole(String userId) {
        Set<String> userRole = userCustomService.getUserRole(userId);
        return ResultVO.success(userRole);
    }

    @Override
    public ResultVO setUserRole(UserRoleDTO userRoleDTO) {
        userCustomService.setUserRole(userRoleDTO.getUserId(), userRoleDTO.getRoleIds());
        return ResultVO.success();
    }

    @Override
    public ResultVO getUserAuthority(String userId) {
        Set<String> userAuthority = userCustomService.getUserAuthority(userId);
        return ResultVO.success(userAuthority);
    }

    @Override
    public ResultVO setUserAuthority(UserAuthorityDTO userAuthorityDTO) {
        userCustomService.setUserAuthority(userAuthorityDTO.getUserId(), userAuthorityDTO.getAuthorityIds());
        return ResultVO.success();
    }

    @Override
    public ResultVO resetPassword(PasswordDTO passwordDTO) {
        userCustomService.resetPassword(passwordDTO.getUserId(), passwordDTO.getNewPassword(), passwordDTO.getCheckPassword());
        return ResultVO.success();
    }

}
