package com.example.cyjworkflow.controller.auto;

import com.example.cyjcommon.entity.FlowUser;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Noice
 */
@Tag(name = "FlowUser")
public interface FlowUserController {

    @Operation(summary = "查询所有FlowUser")
    @PostMapping(value = "flowUserPage")
    ResultVO flowUserPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存FlowUser")
    @PostMapping(value = "flowUserSave")
    ResultVO flowUserSave(@RequestBody @Validated FlowUser po, BindingResult bindingResult);

    @Operation(summary = "删除FlowUser")
    @PostMapping(value = "flowUserDelete")
    ResultVO flowUserDelete(@RequestBody FlowUser po);

}
