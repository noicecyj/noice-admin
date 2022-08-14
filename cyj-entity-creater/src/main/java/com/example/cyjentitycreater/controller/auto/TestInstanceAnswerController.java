package com.example.cyjentitycreater.controller.auto;

import com.example.cyjentitycreater.service.auto.TestInstanceAnswerService;
import com.example.cyjcommon.controller.autoController;
import com.example.cyjcommon.entity.TestInstanceAnswer;
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
@Tag(name = "TestInstanceAnswer")
public class TestInstanceAnswerController implements autoController<TestInstanceAnswer> {

    private TestInstanceAnswerService service;

    @Autowired
    public void setService(TestInstanceAnswerService service) {
        this.service = service;
    }

    @Override
    @Operation(summary = "分页查询所有TestInstanceAnswer")
    @PostMapping(value = "pageTestInstanceAnswer")
    public ResultVO page(@RequestParam("pageNumber") Integer pageNumber) {
        return ResultVO.success(service.findAll(pageNumber));
    }

    @Override
    @Operation(summary = "保存TestInstanceAnswer")
    @PostMapping(value = "saveTestInstanceAnswer")
    public ResultVO save(@RequestBody @Validated TestInstanceAnswer po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Override
    @Operation(summary = "删除TestInstanceAnswer")
    @PostMapping(value = "deleteTestInstanceAnswer")
    public ResultVO delete(@RequestBody TestInstanceAnswer po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
