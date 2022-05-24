package com.example.cyjauth.controller.auto.Impl;

import com.example.cyjcommon.entity.po.EnterprisePO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.controller.auto.EnterpriseController;
import com.example.cyjauth.service.auto.EnterpriseService;
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
@RequestMapping(value = "authApi")
public class EnterpriseControllerImpl implements EnterpriseController {

    private EnterpriseService enterpriseService;

    @Autowired
    public void setEnterpriseService(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    @Override
    public ResultVO enterprisePage(Integer pageNumber) {
        return ResultVO.success(enterpriseService.findAll(pageNumber));
    }

    @Override
    public ResultVO enterpriseSave(EnterprisePO po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(enterpriseService.addOne(po));
        }
        return ResultVO.success(enterpriseService.updateOne(po));
    }

    @Override
    public ResultVO enterpriseDelete(EnterprisePO po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        enterpriseService.deleteOne(po);
        return ResultVO.success();
    }

}
