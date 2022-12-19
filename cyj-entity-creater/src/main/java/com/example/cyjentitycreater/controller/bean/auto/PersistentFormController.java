package com.example.cyjentitycreater.controller.bean.auto;

import com.example.cyjcommon.entity.bean.PersistentForm;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.service.bean.auto.PersistentFormServiceImpl;
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
@Tag(name = "PersistentForm")
public class PersistentFormController {

    private PersistentFormServiceImpl service;

    @Autowired
    public void setService(PersistentFormServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有PersistentForm")
    @PostMapping(value = "pagePersistentForm")
    public ResultVO page(@RequestBody @Validated PersistentForm po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存PersistentForm")
    @PostMapping(value = "savePersistentForm")
    public ResultVO save(@RequestBody @Validated PersistentForm po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除PersistentForm")
    @PostMapping(value = "deletePersistentForm")
    public ResultVO delete(@RequestBody PersistentForm po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据PersistentId查询所有PersistentForm")
    @PostMapping(value = "pagePersistentFormByPersistentId")
    public ResultVO pagePersistentFormByPersistentId(@RequestBody @Validated PersistentForm po,
                                               @RequestParam("pageNumber") Integer pageNumber,
                                               @RequestParam("pageSize") Integer pageSize,
                                               @RequestParam("persistentId") String persistentId) {
        return ResultVO.success(service.pagePersistentFormByPersistentId(po, pageNumber, pageSize, persistentId));
    }

}
