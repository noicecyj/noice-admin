package com.example.cyjauth.controller.auto;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.entity.auto.po.UserPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-20
 */
@Tag(name = "User")
public interface UserController {

    @Operation(summary = "查询所有User")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "userPage")
    ResultVO userPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存User")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "userSave")
    ResultVO userSave(@RequestBody UserPO po);

    @Operation(summary = "删除User")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "userDelete")
    void userDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询User")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "findUserById")
    ResultVO findUserById(@RequestParam("id") String id);

}
