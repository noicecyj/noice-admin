package com.example.cyjworkflow.controller.auto.Impl;

import com.example.cyjcommon.entity.FlowGroup;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjworkflow.controller.auto.FlowGroupController;
import com.example.cyjworkflow.service.auto.FlowGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "workFlowApi")
public class FlowGroupControllerImpl implements FlowGroupController {

    private FlowGroupService flowGroupService;

    @Autowired
    public void setFlowGroupService(FlowGroupService flowGroupService) {
        this.flowGroupService = flowGroupService;
    }

    @Override
    public ResultVO flowGroupPage(Integer pageNumber) {
        return ResultVO.success(flowGroupService.findAll(pageNumber));
    }

    @Override
    public ResultVO flowGroupSave(FlowGroup po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(flowGroupService.addOne(po));
        }
        return ResultVO.success(flowGroupService.updateOne(po));
    }

    @Override
    public ResultVO flowGroupDelete(FlowGroup po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        flowGroupService.deleteOne(po);
        return ResultVO.success();
    }

}
