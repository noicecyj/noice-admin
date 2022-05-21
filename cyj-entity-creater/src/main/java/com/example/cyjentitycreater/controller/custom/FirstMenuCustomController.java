package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-02-20
 */
@Tag(name = "FirstMenu")
public interface FirstMenuCustomController {

    @Operation(summary = "生成目录")
    @PostMapping(value = "createMenu")
    ResultVO createMenu();

}
