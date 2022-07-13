package com.example.cyjentitycreater.controller.auto;

import com.example.cyjentitycreater.service.auto.TestPaperService;
import com.example.cyjcommon.controller.autoController;
import com.example.cyjcommon.entity.TestPaper;
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
@Tag(name = "TestPaper")
public class TestPaperController implements autoController<TestPaper> {

    private TestPaperService service;

    @Autowired
    public void setService(TestPaperService service) {
        this.service = service;
    }

    @Override
    @Operation(summary = "分页查询所有TestPaper")
    @PostMapping(value = "pageTestPaper")
    public ResultVO page(@RequestParam("pageNumber") Integer pageNumber) {
        return ResultVO.success(service.findAll(pageNumber));
    }

    @Override
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

    @Override
    @Operation(summary = "删除TestPaper")
    @PostMapping(value = "deleteTestPaper")
    public ResultVO delete(@RequestBody TestPaper po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据TestPaper查询所有TestPaperConfig")
    @PostMapping(value = "pageTestPaperConfigByTestPaper")
    public ResultVO pageTestPaperConfigByTestPaper(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("id") String id) {
        return ResultVO.success(service.pageTestPaperConfigByTestPaper(pageNumber, id));
    }

    @Operation(summary = "根据TestPaper查询所有TestPaperInstance")
    @PostMapping(value = "pageTestPaperInstanceByTestPaper")
    public ResultVO pageTestPaperInstanceByTestPaper(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("id") String id) {
        return ResultVO.success(service.pageTestPaperInstanceByTestPaper(pageNumber, id));
    }

}
