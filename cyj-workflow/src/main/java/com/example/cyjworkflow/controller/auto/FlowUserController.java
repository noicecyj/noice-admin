package com.example.cyjworkflow.controller.auto;

import com.example.cyjcommon.entity.po.FlowUserPO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Noice
 * @version 1.0
 */
@Tag(name = "FlowUser")
public interface FlowUserController {

    @Operation(summary = "查询所有FlowUser")
    @PostMapping(value = "flowUserPage")
    ResultVO flowUserPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存FlowUser")
    @PostMapping(value = "flowUserSave")
    ResultVO flowUserSave(@RequestBody FlowUserPO po);

    @Operation(summary = "删除FlowUser")
    @PostMapping(value = "flowUserDelete")
    void flowUserDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询FlowUser")
    @PostMapping(value = "findFlowUserById")
    ResultVO findFlowUserById(@RequestParam("id") String id);

}
