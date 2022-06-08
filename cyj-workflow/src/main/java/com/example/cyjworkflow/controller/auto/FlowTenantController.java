package com.example.cyjworkflow.controller.auto;

import com.example.cyjcommon.entity.FlowTenant;
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
@Tag(name = "FlowTenant")
public interface FlowTenantController {

    @Operation(summary = "查询所有FlowTenant")
    @PostMapping(value = "flowTenantPage")
    ResultVO flowTenantPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存FlowTenant")
    @PostMapping(value = "flowTenantSave")
    ResultVO flowTenantSave(@RequestBody @Validated FlowTenant po, BindingResult bindingResult);

    @Operation(summary = "删除FlowTenant")
    @PostMapping(value = "flowTenantDelete")
    ResultVO flowTenantDelete(@RequestBody FlowTenant po);

}
