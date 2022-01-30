package com.example.cyjauth.controller;

import com.example.cyjauth.entity.vo.PasswordVO;
import com.example.cyjcommon.annotation.InterFaceMapping;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Tag(name = "自定义相关接口")
public interface IndexController {

    @Operation(summary = "退出登录")
    @InterFaceMapping(api = "authApi")
    @GetMapping(value = "exit")
    String exit(@RequestParam("userName") String userName);

    @Operation(summary = "设置密码")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "setPassword")
    Boolean setPassword(@RequestBody PasswordVO passwordVO);

}