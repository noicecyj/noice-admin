package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.entity.Persistent;
import com.example.cyjcommon.entity.TestPaperInstance;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.custom.TestPaperInstanceCustomService;
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
public class TestPaperInstanceCustomController {

    private TestPaperInstanceCustomService testPaperInstanceCustomService;

    @Autowired
    public void setTestPaperInstanceCustomService(TestPaperInstanceCustomService testPaperInstanceCustomService) {
        this.testPaperInstanceCustomService = testPaperInstanceCustomService;
    }

    @Operation(summary = "生成试卷")
    @PostMapping(value = "createTestPaperInstance")
    public ResultVO createTestPaperInstance(@RequestBody TestPaperInstance po) {
        testPaperInstanceCustomService.createTestPaperInstance(po);
        return ResultVO.success();
    }

}
