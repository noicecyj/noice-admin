package com.example.cyjworkflow.controller.bean.auto;

import com.example.cyjcommon.entity.bean.FlowUser;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjworkflow.service.bean.auto.FlowUserServiceImpl;
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
@Tag(name = "FlowUser")
public class FlowUserController {

    private FlowUserServiceImpl service;

    @Autowired
    public void setService(FlowUserServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有FlowUser")
    @PostMapping(value = "pageFlowUser")
    public ResultVO page(@RequestBody @Validated FlowUser po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存FlowUser")
    @PostMapping(value = "saveFlowUser")
    public ResultVO save(@RequestBody @Validated FlowUser po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除FlowUser")
    @PostMapping(value = "deleteFlowUser")
    public ResultVO delete(@RequestBody FlowUser po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
