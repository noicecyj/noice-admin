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
 * @date 2021-03-20
 */
@Tag(name = "权限相关接口")
public interface AuthorityController {

        @Operation(summary = "查询所有Authority")
        @InterFaceMapping(api = "authApi")
        @PostMapping(value = "authorityPage")
        ResultVO authorityFindAll(@RequestParam("pageNumber") Integer pageNumber,
                                  @RequestParam("pageSize") Integer pageSize,
                                  @RequestParam("sortCode") String sortCode);

        @Operation(summary = "保存Authority")
        @InterFaceMapping(api = "authApi")
        @PostMapping(value = "authoritySave")
        ResultVO authoritySave(@RequestBody Map<String, Object> vo);

        @Operation(summary = "删除Authority")
        @InterFaceMapping(api = "authApi")
        @PostMapping(value = "authorityDelete")
        void authorityDelete(@RequestParam("id") String id);

        @Operation(summary = "根据ID查询Authority")
        @InterFaceMapping(api = "authApi")
        @PostMapping(value = "findAuthorityById")
        ResultVO findAuthorityById(@RequestParam("id") String id);

}
