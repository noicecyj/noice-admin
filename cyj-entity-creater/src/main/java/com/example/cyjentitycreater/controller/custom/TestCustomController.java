package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.entity.Test;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.custom.TestCustomService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
public class TestCustomController {

    private TestCustomService testCustomService;

    @Autowired
    public void setTestCustomService(TestCustomService testCustomService) {
        this.testCustomService = testCustomService;
    }

    @Operation(summary = "开始考试")
    @PostMapping(value = "startTest")
    public ResultVO startTest(@RequestBody Test po) {
        return ResultVO.success(testCustomService.startTest(po));
    }

}