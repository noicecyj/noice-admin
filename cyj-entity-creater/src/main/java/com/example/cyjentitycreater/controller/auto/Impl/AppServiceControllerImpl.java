package com.example.cyjentitycreater.controller.auto.Impl;

import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.auto.AppServiceController;
import com.example.cyjentitycreater.service.auto.AppServiceService;
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
@RequestMapping(value = "entityCreateApi")
public class AppServiceControllerImpl implements AppServiceController {

    private AppServiceService appServiceService;

    @Autowired
    public void setAppServiceService(AppServiceService appServiceService) {
        this.appServiceService = appServiceService;
    }

    @Override
    public ResultVO appServicePage(Integer pageNumber) {
        return ResultVO.success(appServiceService.findAll(pageNumber));
    }

    @Override
    public ResultVO appServiceSave(AppServicePO po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(appServiceService.addOne(po));
        }
        return ResultVO.success(appServiceService.updateOne(po));
    }

    @Override
    public ResultVO appServiceDelete(AppServicePO po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        appServiceService.deleteOne(po);
        return ResultVO.success();
    }

}
