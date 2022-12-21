package com.example.cyjentitycreater.controller.bean.auto;

import com.example.cyjcommon.entity.bean.PersistentTableBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.PersistentTableServiceImpl;
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
@Tag(name = "PersistentTableBean")
public class PersistentTableController {

    private PersistentTableServiceImpl service;

    @Autowired
    public void setService(PersistentTableServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有PersistentTable")
    @PostMapping(value = "pagePersistentTable")
    public ResultVO page(@RequestBody @Validated PersistentTableBean po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存PersistentTable")
    @PostMapping(value = "savePersistentTable")
    public ResultVO save(@RequestBody @Validated PersistentTableBean po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除PersistentTable")
    @PostMapping(value = "deletePersistentTable")
    public ResultVO delete(@RequestBody PersistentTableBean po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
