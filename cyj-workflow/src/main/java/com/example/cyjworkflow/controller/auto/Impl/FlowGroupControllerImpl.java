package com.example.cyjworkflow.controller.auto.Impl;

import com.example.cyjcommon.entity.po.FlowGroupPO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjworkflow.controller.auto.FlowGroupController;
import com.example.cyjworkflow.service.auto.FlowGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 * @version 1.0
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
    public ResultVO flowGroupSave(FlowGroupPO po) {
        if (po.getId() == null) {
            return ResultVO.success(flowGroupService.addOne(po));
        }
        return ResultVO.success(flowGroupService.updateOne(po));
    }

    @Override
    public void flowGroupDelete(String id) {
        flowGroupService.deleteOne(id);
    }

    @Override
    public ResultVO findFlowGroupById(String id) {
        return ResultVO.success(flowGroupService.findOneById(id));
    }

}
