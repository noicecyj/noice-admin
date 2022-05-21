package com.example.cyjentitycreater.controller.custom.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.controller.custom.FirstMenuCustomController;
import com.example.cyjentitycreater.service.custom.FirstMenuCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 * @version 1.0
 * @date 2022-02-20
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
public class FirstMenuCustomControllerImpl implements FirstMenuCustomController {

    private FirstMenuCustomService firstMenuCustomService;

    @Autowired
    public void setFirstMenuCustomService(FirstMenuCustomService firstMenuCustomService) {
        this.firstMenuCustomService = firstMenuCustomService;
    }

    @Override
    public ResultVO createMenu() {
        firstMenuCustomService.createMenu();
        return ResultVO.success();
    }
}
