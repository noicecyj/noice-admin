package com.example.cyjworkflow.controller.auto;

import com.example.cyjcommon.entity.po.FlowGroupPO;
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
@Tag(name = "FlowGroup")
public interface FlowGroupController {

    @Operation(summary = "查询所有FlowGroup")
    @PostMapping(value = "flowGroupPage")
    ResultVO flowGroupPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存FlowGroup")
    @PostMapping(value = "flowGroupSave")
    ResultVO flowGroupSave(@RequestBody @Validated FlowGroupPO po, BindingResult bindingResult);

    @Operation(summary = "删除FlowGroup")
    @PostMapping(value = "flowGroupDelete")
    ResultVO flowGroupDelete(@RequestBody FlowGroupPO po);

}
