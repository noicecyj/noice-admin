package com.example.cyjentitycreater.controller.bean.auto;

import com.example.cyjcommon.entity.bean.PersistentBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.PersistentServiceImpl;
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
@RequestMapping("entityCreateApi")
@Tag(name = "PersistentBean")
public class PersistentController {

    private PersistentServiceImpl service;

    @Autowired
    public void setService(PersistentServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有Persistent")
    @PostMapping(value = "pagePersistent")
    public ResultVO page(@RequestBody @Validated PersistentBean po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存Persistent")
    @PostMapping(value = "savePersistent")
    public ResultVO save(@RequestBody @Validated PersistentBean po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除Persistent")
    @PostMapping(value = "deletePersistent")
    public ResultVO delete(@RequestBody PersistentBean po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
