package com.example.cyjworkflow.controller.bean.auto;

import com.example.cyjcommon.entity.bean.FlowTenant;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjworkflow.service.bean.auto.FlowTenantServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "workFlowApi")
@Tag(name = "FlowTenant")
public class FlowTenantController {

    private FlowTenantServiceImpl service;

    @Autowired
    public void setService(FlowTenantServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有FlowTenant")
    @PostMapping(value = "pageFlowTenant")
    public ResultVO page(@RequestBody @Validated FlowTenant po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存FlowTenant")
    @PostMapping(value = "saveFlowTenant")
    public ResultVO save(@RequestBody @Validated FlowTenant po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除FlowTenant")
    @PostMapping(value = "deleteFlowTenant")
    public ResultVO delete(@RequestBody FlowTenant po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
