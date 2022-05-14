package com.example.cyjauth.controller.auto.Impl;

import com.example.cyjauth.controller.auto.EnterpriseController;
import com.example.cyjauth.service.auto.EnterpriseService;
import com.example.cyjcommon.entity.EnterprisePO;
import com.example.cyjcommon.utils.ResultVO;
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
    public ResultVO enterpriseSave(EnterprisePO po) {
        if (po.getId() == null) {
            return ResultVO.success(enterpriseService.addOne(po));
        }
        return ResultVO.success(enterpriseService.updateOne(po));
    }

    @Override
    public void enterpriseDelete(String id) {
        enterpriseService.deleteOne(id);
    }

    @Override
    public ResultVO findEnterpriseById(String id) {
        return ResultVO.success(enterpriseService.findOneById(id));
    }

}
