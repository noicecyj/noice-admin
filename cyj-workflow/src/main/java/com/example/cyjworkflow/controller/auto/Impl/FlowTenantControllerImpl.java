package com.example.cyjworkflow.controller.auto.Impl;

import com.example.cyjcommon.entity.po.FlowTenantPO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjworkflow.controller.auto.FlowTenantController;
import com.example.cyjworkflow.service.auto.FlowTenantService;
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
public class FlowTenantControllerImpl implements FlowTenantController {

    private FlowTenantService flowTenantService;

    @Autowired
    public void setFlowTenantService(FlowTenantService flowTenantService) {
        this.flowTenantService = flowTenantService;
    }

    @Override
    public ResultVO flowTenantPage(Integer pageNumber) {
        return ResultVO.success(flowTenantService.findAll(pageNumber));
    }

    @Override
    public ResultVO flowTenantSave(FlowTenantPO po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(flowTenantService.addOne(po));
        }
        return ResultVO.success(flowTenantService.updateOne(po));
    }

    @Override
    public ResultVO flowTenantDelete(FlowTenantPO po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        flowTenantService.deleteOne(po);
        return ResultVO.success();
    }

}
