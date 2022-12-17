package com.example.cyjauth.controller.bean.custom;

import com.example.cyjauth.entity.dto.PasswordDTO;
import com.example.cyjauth.service.bean.custom.UserCustomServiceImpl;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("authApi")
@Tag(name = "User")
public class UserCustomController {

    private UserCustomServiceImpl service;

    @Autowired
    public void setService(UserCustomServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "重置密码")
    @PostMapping(value = "resetPassword")
    public ResultVO resetPassword(@RequestBody PasswordDTO passwordDTO) {
        service.resetPassword(passwordDTO.getUserId(), passwordDTO.getNewPassword(), passwordDTO.getCheckPassword());
        return ResultVO.success();
    }

}