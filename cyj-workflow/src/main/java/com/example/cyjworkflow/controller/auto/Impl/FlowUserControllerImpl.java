package com.example.cyjworkflow.controller.auto.Impl;

import com.example.cyjcommon.entity.po.FlowUserPO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjworkflow.controller.auto.FlowUserController;
import com.example.cyjworkflow.service.auto.FlowUserService;
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
public class FlowUserControllerImpl implements FlowUserController {

    private FlowUserService flowUserService;

    @Autowired
    public void setFlowUserService(FlowUserService flowUserService) {
        this.flowUserService = flowUserService;
    }

    @Override
    public ResultVO flowUserPage(Integer pageNumber) {
        return ResultVO.success(flowUserService.findAll(pageNumber));
    }

    @Override
    public ResultVO flowUserSave(FlowUserPO po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(flowUserService.addOne(po));
        }
        return ResultVO.success(flowUserService.updateOne(po));
    }

    @Override
    public ResultVO flowUserDelete(FlowUserPO po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        flowUserService.deleteOne(po);
        return ResultVO.success();
    }

}
