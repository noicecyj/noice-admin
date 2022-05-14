package com.example.cyjauth.controller.auto;

import com.example.cyjcommon.entity.AuthorityPO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Tag(name = "Authority")
public interface AuthorityController {

    @Operation(summary = "查询所有Authority")
    @PostMapping(value = "authorityPage")
    ResultVO authorityPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存Authority")
    @PostMapping(value = "authoritySave")
    ResultVO authoritySave(@RequestBody AuthorityPO po);

    @Operation(summary = "删除Authority")
    @PostMapping(value = "authorityDelete")
    void authorityDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Authority")
    @PostMapping(value = "findAuthorityById")
    ResultVO findAuthorityById(@RequestParam("id") String id);

}
