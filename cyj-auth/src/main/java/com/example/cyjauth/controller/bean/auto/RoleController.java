package com.example.cyjauth.controller.bean.auto;

import com.example.cyjcommon.entity.bean.RoleBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.service.bean.auto.RoleServiceImpl;
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
@RequestMapping("authApi")
@Tag(name = "RoleBean")
public class RoleController {

    private RoleServiceImpl service;

    @Autowired
    public void setService(RoleServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有Role")
    @PostMapping(value = "pageRole")
    public ResultVO page(@RequestBody @Validated RoleBean po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存Role")
    @PostMapping(value = "saveRole")
    public ResultVO save(@RequestBody @Validated RoleBean po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除Role")
    @PostMapping(value = "deleteRole")
    public ResultVO delete(@RequestBody RoleBean po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
