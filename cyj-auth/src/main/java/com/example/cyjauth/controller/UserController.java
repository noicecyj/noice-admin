package com.example.cyjauth.controller;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
@Tag(name = "用户相关接口")
public interface UserController {

    @Operation(summary = "查询所有User")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "userPage")
    ResultVO userFindAll(@RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize,
                         @RequestParam("sortCode") String sortCode);

    @Operation(summary = "保存User")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "userSave")
    ResultVO userSave(@RequestBody Map<String, Object> vo);

    @Operation(summary = "删除User")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "userDelete")
    void userDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询User")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "findUserById")
    ResultVO findUserById(@RequestParam("id") String id);

}
