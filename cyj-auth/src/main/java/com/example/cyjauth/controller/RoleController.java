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
@Tag(name = "角色相关接口")
public interface RoleController {

    @Operation(summary = "查询所有Role")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "rolePage")
    ResultVO roleFindAll(@RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize,
                         @RequestParam("sortCode") String sortCode);

    @Operation(summary = "保存Role")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "roleSave")
    ResultVO roleSave(@RequestBody Map<String, Object> vo);

    @Operation(summary = "删除Role")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "roleDelete")
    void roleDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Role")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "findRoleById")
    ResultVO findRoleById(@RequestParam("id") String id);

}
