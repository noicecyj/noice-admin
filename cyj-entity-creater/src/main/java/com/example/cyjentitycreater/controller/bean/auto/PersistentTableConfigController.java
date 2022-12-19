package com.example.cyjentitycreater.controller.bean.auto;

import com.example.cyjcommon.entity.bean.PersistentTableConfig;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.PersistentTableConfigServiceImpl;
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
@Tag(name = "PersistentTableConfig")
public class PersistentTableConfigController {

    private PersistentTableConfigServiceImpl service;

    @Autowired
    public void setService(PersistentTableConfigServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有PersistentTableConfig")
    @PostMapping(value = "pagePersistentTableConfig")
    public ResultVO page(@RequestBody @Validated PersistentTableConfig po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存PersistentTableConfig")
    @PostMapping(value = "savePersistentTableConfig")
    public ResultVO save(@RequestBody @Validated PersistentTableConfig po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除PersistentTableConfig")
    @PostMapping(value = "deletePersistentTableConfig")
    public ResultVO delete(@RequestBody PersistentTableConfig po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据PersistentTableId查询所有PersistentTableConfig")
    @PostMapping(value = "pagePersistentTableConfigByPersistentTableId")
    public ResultVO pagePersistentTableConfigByPersistentTableId(@RequestBody @Validated PersistentTableConfig po,
                                               @RequestParam("pageNumber") Integer pageNumber,
                                               @RequestParam("pageSize") Integer pageSize,
                                               @RequestParam("persistentTableId") String persistentTableId) {
        return ResultVO.success(service.pagePersistentTableConfigByPersistentTableId(po, pageNumber, pageSize, persistentTableId));
    }

}
