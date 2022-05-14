package com.example.cyjauth.controller.custom.Impl;

import com.example.cyjauth.controller.custom.AuthorityCustomController;
import com.example.cyjauth.service.custom.AuthorityCustomService;
import com.example.cyjcommon.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-03-02
 */
@CrossOrigin
@RestController
@RequestMapping(value = "authApi")
public class AuthorityCustomControllerImpl implements AuthorityCustomController {

    private AuthorityCustomService authorityCustomService;

    @Autowired
    public void setAuthorityCustomService(AuthorityCustomService authorityCustomService) {
        this.authorityCustomService = authorityCustomService;
    }

//    @Override
//    public ResultVO createAuthority() {
//        authorityCustomService.createAuthority();
//        return ResultVO.success();
//    }
}
