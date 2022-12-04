package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.entity.vo.CreateVO;
import com.example.cyjentitycreater.service.bean.custom.AppServiceCustomServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
public class AppServiceCustomController {

    private AppServiceCustomServiceImpl appServiceCustomServiceImpl;

    @Autowired
    public void setAppServiceCustomService(AppServiceCustomServiceImpl appServiceCustomServiceImpl) {
        this.appServiceCustomServiceImpl = appServiceCustomServiceImpl;
    }

    @Operation(summary = "生成服务文件")
    @PostMapping(value = "createAppFile")
    public ResultVO createAppFile(CreateVO createVO) {
        appServiceCustomServiceImpl.createAppFile(createVO.getId());
        return ResultVO.success();
    }
}
