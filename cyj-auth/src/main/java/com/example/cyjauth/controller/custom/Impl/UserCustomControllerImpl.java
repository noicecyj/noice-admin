package com.example.cyjauth.controller.custom.Impl;

import com.example.cyjauth.controller.custom.UserCustomController;
import com.example.cyjauth.entity.dto.PasswordDTO;
import com.example.cyjauth.service.custom.UserCustomService;
import com.example.cyjcommon.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResultVO resetPassword(PasswordDTO passwordDTO) {
        userCustomService.resetPassword(passwordDTO.getUserId(), passwordDTO.getNewPassword(), passwordDTO.getCheckPassword());
        return ResultVO.success();
    }

}
