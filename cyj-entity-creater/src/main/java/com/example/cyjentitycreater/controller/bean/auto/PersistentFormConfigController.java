package com.example.cyjentitycreater.controller.bean.auto;

import com.example.cyjcommon.entity.bean.PersistentFormConfig;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.PersistentFormConfigServiceImpl;
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
@Tag(name = "PersistentFormConfig")
public class PersistentFormConfigController {

    private PersistentFormConfigServiceImpl service;

    @Autowired
    public void setService(PersistentFormConfigServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有PersistentFormConfig")
    @PostMapping(value = "pagePersistentFormConfig")
    public ResultVO page(@RequestBody @Validated PersistentFormConfig po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存PersistentFormConfig")
    @PostMapping(value = "savePersistentFormConfig")
    public ResultVO save(@RequestBody @Validated PersistentFormConfig po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除PersistentFormConfig")
    @PostMapping(value = "deletePersistentFormConfig")
    public ResultVO delete(@RequestBody PersistentFormConfig po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
