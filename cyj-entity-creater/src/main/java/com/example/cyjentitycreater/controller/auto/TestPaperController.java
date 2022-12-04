package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.bean.TestPaper;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.TestPaperServiceImpl;
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
@Tag(name = "TestPaper")
public class TestPaperController {

    private TestPaperServiceImpl service;

    @Autowired
    public void setService(TestPaperServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有TestPaper")
    @PostMapping(value = "pageTestPaper")
    public ResultVO page(@RequestBody @Validated TestPaper po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存TestPaper")
    @PostMapping(value = "saveTestPaper")
    public ResultVO save(@RequestBody @Validated TestPaper po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除TestPaper")
    @PostMapping(value = "deleteTestPaper")
    public ResultVO delete(@RequestBody TestPaper po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
