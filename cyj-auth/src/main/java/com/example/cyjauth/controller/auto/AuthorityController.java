package com.example.cyjauth.controller.auto;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.entity.auto.po.AuthorityPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-03-02
 */
@Tag(name = "Authority")
public interface AuthorityController {

    @Operation(summary = "查询所有Authority")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "authorityPage")
    ResultVO authorityPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存Authority")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "authoritySave")
    ResultVO authoritySave(@RequestBody AuthorityPO po);

    @Operation(summary = "删除Authority")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "authorityDelete")
    void authorityDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Authority")
    @InterFaceMapping(api = "authApi")
    @PostMapping(value = "findAuthorityById")
    ResultVO findAuthorityById(@RequestParam("id") String id);

}
