package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.entity.vo.CreateVO;
import com.example.cyjentitycreater.service.custom.AppServiceCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 * @version 1.0
 * @date 2021-10-16
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
public class AppServiceCustomController {

    private AppServiceCustomService appServiceCustomService;

    @Autowired
    public void setAppServiceCustomService(AppServiceCustomService appServiceCustomService) {
        this.appServiceCustomService = appServiceCustomService;
    }

    public ResultVO createAppFile(CreateVO createVO) {
        appServiceCustomService.createAppFile(createVO.getId());
        return ResultVO.success();
    }
}
