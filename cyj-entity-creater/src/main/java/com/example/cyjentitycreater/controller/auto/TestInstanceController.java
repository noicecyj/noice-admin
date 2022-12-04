package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.bean.TestInstance;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.TestInstanceServiceImpl;
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
@Tag(name = "TestInstance")
public class TestInstanceController {

    private TestInstanceServiceImpl service;

    @Autowired
    public void setService(TestInstanceServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有TestInstance")
    @PostMapping(value = "pageTestInstance")
    public ResultVO page(@RequestBody @Validated TestInstance po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存TestInstance")
    @PostMapping(value = "saveTestInstance")
    public ResultVO save(@RequestBody @Validated TestInstance po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除TestInstance")
    @PostMapping(value = "deleteTestInstance")
    public ResultVO delete(@RequestBody TestInstance po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
