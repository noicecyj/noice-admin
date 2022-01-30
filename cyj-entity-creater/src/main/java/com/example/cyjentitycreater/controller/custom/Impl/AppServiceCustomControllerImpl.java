package com.example.cyjentitycreater.controller.custom.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.custom.AppServiceCustomController;
import com.example.cyjentitycreater.entity.custom.vo.CreateVO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
public class AppServiceCustomControllerImpl implements AppServiceCustomController {

    @Override
    public ResultVO createAppFile(CreateVO createVO) {
        return null;
    }
}
