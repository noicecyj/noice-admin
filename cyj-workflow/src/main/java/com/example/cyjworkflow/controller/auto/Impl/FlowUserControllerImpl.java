package com.example.cyjworkflow.controller.auto.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjworkflow.controller.auto.FlowUserController;
import com.example.cyjworkflow.entity.auto.po.FlowUserPO;
import com.example.cyjworkflow.service.auto.FlowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
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
    public ResultVO flowUserSave(FlowUserPO po) {
        if (po.getId() == null) {
            return ResultVO.success(flowUserService.addOne(po));
        }
        return ResultVO.success(flowUserService.updateOne(po));
    }

    @Override
    public void flowUserDelete(String id) {
        flowUserService.deleteOne(id);
    }

    @Override
    public ResultVO findFlowUserById(String id) {
        return ResultVO.success(flowUserService.findOneById(id));
    }

}