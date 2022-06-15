package com.example.cyjworkflow.controller.auto;

import com.example.cyjworkflow.service.auto.FlowGroupService;
import com.example.cyjcommon.controller.autoController;
import com.example.cyjcommon.entity.FlowGroup;
import com.example.cyjcommon.utils.ResultVO;
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
@Tag(name = "FlowGroup")
public class FlowGroupController implements autoController<FlowGroup> {

    private FlowGroupService service;

    @Autowired
    public void setService(FlowGroupService service) {
        this.service = service;
    }

    @Override
    @Operation(summary = "分页查询所有FlowGroup")
    @PostMapping(value = "pageFlowGroup")
    public ResultVO page(@RequestParam("pageNumber") Integer pageNumber) {
        return ResultVO.success(service.findAll(pageNumber));
    }

    @Override
    @Operation(summary = "保存FlowGroup")
    @PostMapping(value = "saveFlowGroup")
    public ResultVO save(@RequestBody @Validated FlowGroup po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Override
    @Operation(summary = "删除FlowGroup")
    @PostMapping(value = "deleteFlowGroup")
    public ResultVO delete(@RequestBody FlowGroup po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
