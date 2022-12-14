package com.example.cyjauth.controller.bean.auto;

import com.example.cyjcommon.entity.bean.Enterprise;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl;
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
@RequestMapping(value = "authApi")
@Tag(name = "Enterprise")
public class EnterpriseController {

    private EnterpriseServiceImpl service;

    @Autowired
    public void setService(EnterpriseServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有Enterprise")
    @PostMapping(value = "pageEnterprise")
    public ResultVO page(@RequestBody @Validated Enterprise po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存Enterprise")
    @PostMapping(value = "saveEnterprise")
    public ResultVO save(@RequestBody @Validated Enterprise po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除Enterprise")
    @PostMapping(value = "deleteEnterprise")
    public ResultVO delete(@RequestBody Enterprise po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
