package com.example.cyjentitycreater.controller.auto;

import com.example.cyjentitycreater.service.auto.TestPaperConfigService;
import com.example.cyjcommon.controller.autoController;
import com.example.cyjcommon.entity.TestPaperConfig;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "entityCreateApi")
@Tag(name = "TestPaperConfig")
public class TestPaperConfigController implements autoController<TestPaperConfig> {

    private TestPaperConfigService service;

    @Autowired
    public void setService(TestPaperConfigService service) {
        this.service = service;
    }

    @Override
    @Operation(summary = "分页查询所有TestPaperConfig")
    @PostMapping(value = "pageTestPaperConfig")
    public ResultVO page(@RequestParam("pageNumber") Integer pageNumber) {
        return ResultVO.success(service.findAll(pageNumber));
    }

    @Override
    @Operation(summary = "保存TestPaperConfig")
    @PostMapping(value = "saveTestPaperConfig")
    public ResultVO save(@RequestBody @Validated TestPaperConfig po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Override
    @Operation(summary = "删除TestPaperConfig")
    @PostMapping(value = "deleteTestPaperConfig")
    public ResultVO delete(@RequestBody TestPaperConfig po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
