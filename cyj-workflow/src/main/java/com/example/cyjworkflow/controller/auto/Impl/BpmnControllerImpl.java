package com.example.cyjworkflow.controller.auto.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjworkflow.controller.auto.BpmnController;
import com.example.cyjworkflow.entity.auto.po.BpmnPO;
import com.example.cyjworkflow.service.auto.BpmnService;
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
public class BpmnControllerImpl implements BpmnController {

    private BpmnService bpmnService;

    @Autowired
    public void setBpmnService(BpmnService bpmnService) {
        this.bpmnService = bpmnService;
    }

    @Override
    public ResultVO bpmnPage(Integer pageNumber) {
        return ResultVO.success(bpmnService.findAll(pageNumber));
    }

    @Override
    public ResultVO bpmnSave(BpmnPO po) {
        if (po.getId() == null) {
            return ResultVO.success(bpmnService.addOne(po));
        }
        return ResultVO.success(bpmnService.updateOne(po));
    }

    @Override
    public void bpmnDelete(String id) {
        bpmnService.deleteOne(id);
    }

    @Override
    public ResultVO findBpmnById(String id) {
        return ResultVO.success(bpmnService.findOneById(id));
    }

}
