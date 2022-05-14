package com.example.cyjauth.controller.custom;

import com.example.cyjauth.entity.dto.PasswordDTO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
@Tag(name = "User")
public interface UserCustomController {

    @Operation(summary = "重置密码")
    @PostMapping(value = "resetPassword")
    ResultVO resetPassword(@RequestBody PasswordDTO passwordDTO);

}
