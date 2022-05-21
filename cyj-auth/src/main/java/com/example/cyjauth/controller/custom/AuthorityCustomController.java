package com.example.cyjauth.controller.custom;

import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-03-02
 */
@Tag(name = "Authority")
public interface AuthorityCustomController {

    @Operation(summary = "生成所有权限")
    @PostMapping(value = "createAuthority")
    ResultVO createAuthority();

}
