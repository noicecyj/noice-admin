package com.example.cyjworkflow.controller.auto.Impl;

import com.example.cyjcommon.entity.po.FlowTenantPO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjworkflow.controller.auto.FlowTenantController;
import com.example.cyjworkflow.service.auto.FlowTenantService;
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
    public ResultVO flowTenantSave(FlowTenantPO po) {
        if (po.getId() == null) {
            return ResultVO.success(flowTenantService.addOne(po));
        }
        return ResultVO.success(flowTenantService.updateOne(po));
    }

    @Override
    public void flowTenantDelete(String id) {
        flowTenantService.deleteOne(id);
    }

    @Override
    public ResultVO findFlowTenantById(String id) {
        return ResultVO.success(flowTenantService.findOneById(id));
    }

}
