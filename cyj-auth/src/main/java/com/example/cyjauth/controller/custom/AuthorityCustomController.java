package com.example.cyjauth.controller.custom;

import com.example.cyjauth.service.custom.AuthorityCustomService;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-03-02
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
@Tag(name = "Authority")
public class AuthorityCustomController {

    private AuthorityCustomService service;

    @Autowired
    public void setService(AuthorityCustomService service) {
        this.service = service;
    }

    @Operation(summary = "生成所有权限")
    @PostMapping(value = "createAuthority")
    public ResultVO createAuthority() {
        service.createAuthority();
        return ResultVO.success();
    }

}
