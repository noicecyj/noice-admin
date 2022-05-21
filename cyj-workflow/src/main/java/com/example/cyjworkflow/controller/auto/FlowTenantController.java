package com.example.cyjworkflow.controller.auto;

import com.example.cyjcommon.entity.po.FlowTenantPO;
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
@Tag(name = "FlowTenant")
public interface FlowTenantController {

    @Operation(summary = "查询所有FlowTenant")
    @PostMapping(value = "flowTenantPage")
    ResultVO flowTenantPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存FlowTenant")
    @PostMapping(value = "flowTenantSave")
    ResultVO flowTenantSave(@RequestBody FlowTenantPO po);

    @Operation(summary = "删除FlowTenant")
    @PostMapping(value = "flowTenantDelete")
    void flowTenantDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询FlowTenant")
    @PostMapping(value = "findFlowTenantById")
    ResultVO findFlowTenantById(@RequestParam("id") String id);

}
