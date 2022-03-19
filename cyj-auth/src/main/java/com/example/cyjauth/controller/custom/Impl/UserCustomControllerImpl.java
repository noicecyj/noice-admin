package com.example.cyjauth.controller.custom.Impl;

import com.alibaba.fastjson.JSONObject;
import com.example.cyjauth.controller.custom.UserCustomController;
import com.example.cyjauth.entity.custom.dto.UserRoleDTO;
import com.example.cyjauth.service.custom.UserCustomService;
import com.example.cyjcommon.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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
public class UserCustomControllerImpl implements UserCustomController {

    public UserCustomService userCustomService;

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

}
