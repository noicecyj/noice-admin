package com.example.cyjentitycreater.controller.auto.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.auto.AppServiceController;
import com.example.cyjentitycreater.entity.auto.po.AppServicePO;
import com.example.cyjentitycreater.service.auto.AppServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-01
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
    public ResultVO appServiceSave(AppServicePO po) {
        if (po.getId() == null) {
            return ResultVO.success(appServiceService.addOne(po));
        }
        return ResultVO.success(appServiceService.updateOne(po));
    }

    @Override
    public void appServiceDelete(String id) {
        appServiceService.deleteOne(id);
    }

    @Override
    public ResultVO findAppServiceById(String id) {
        return ResultVO.success(appServiceService.findOneById(id));
    }

}
