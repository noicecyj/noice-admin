package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.bean.TestPaperConfig;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.TestPaperConfigServiceImpl;
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
public class TestPaperConfigController {

    private TestPaperConfigServiceImpl service;

    @Autowired
    public void setService(TestPaperConfigServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有TestPaperConfig")
    @PostMapping(value = "pageTestPaperConfig")
    public ResultVO page(@RequestBody @Validated TestPaperConfig po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

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

    @Operation(summary = "删除TestPaperConfig")
    @PostMapping(value = "deleteTestPaperConfig")
    public ResultVO delete(@RequestBody TestPaperConfig po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据TestPaper查询所有TestPaperConfig")
    @PostMapping(value = "pageTestPaperConfigByTestPaper")
    public ResultVO pageTestPaperConfigByTestPaper(@RequestBody @Validated TestPaperConfig po,
                                                   @RequestParam("pageNumber") Integer pageNumber,
                                                   @RequestParam("pageSize") Integer pageSize,
                                                   @RequestParam("id") String id) {
        return ResultVO.success(service.pageTestPaperConfigByTestPaper(po, pageNumber, pageSize, id));
    }

}
