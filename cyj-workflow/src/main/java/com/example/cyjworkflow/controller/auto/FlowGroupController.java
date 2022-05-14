package com.example.cyjworkflow.controller.auto;

import com.example.cyjcommon.entity.FlowGroupPO;
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
@Tag(name = "FlowGroup")
public interface FlowGroupController {

    @Operation(summary = "查询所有FlowGroup")
    @PostMapping(value = "flowGroupPage")
    ResultVO flowGroupPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存FlowGroup")
    @PostMapping(value = "flowGroupSave")
    ResultVO flowGroupSave(@RequestBody FlowGroupPO po);

    @Operation(summary = "删除FlowGroup")
    @PostMapping(value = "flowGroupDelete")
    void flowGroupDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询FlowGroup")
    @PostMapping(value = "findFlowGroupById")
    ResultVO findFlowGroupById(@RequestParam("id") String id);

}
