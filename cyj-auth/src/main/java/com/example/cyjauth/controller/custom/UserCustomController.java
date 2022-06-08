package com.example.cyjauth.controller.custom;

import com.example.cyjauth.entity.dto.PasswordDTO;
import com.example.cyjauth.service.custom.UserCustomService;
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
 * @version 1.0
 * @date 2022-02-07
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
@Tag(name = "User")
public class UserCustomController {

    private UserCustomService service;

    @Autowired
    public void setService(UserCustomService service) {
        this.service = service;
    }

    @Operation(summary = "重置密码")
    @PostMapping(value = "resetPassword")
    public ResultVO resetPassword(@RequestBody PasswordDTO passwordDTO) {
        service.resetPassword(passwordDTO.getUserId(), passwordDTO.getNewPassword(), passwordDTO.getCheckPassword());
        return ResultVO.success();
    }

}
