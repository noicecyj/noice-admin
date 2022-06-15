package com.example.cyjentitycreater.controller.auto;

import com.example.cyjentitycreater.service.auto.PersistentService;
import com.example.cyjcommon.controller.autoController;
import com.example.cyjcommon.entity.Persistent;
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
@Tag(name = "Persistent")
public class PersistentController implements autoController<Persistent> {

    private PersistentService service;

    @Autowired
    public void setService(PersistentService service) {
        this.service = service;
    }

    @Override
    @Operation(summary = "分页查询所有Persistent")
    @PostMapping(value = "pagePersistent")
    public ResultVO page(@RequestParam("pageNumber") Integer pageNumber) {
        return ResultVO.success(service.findAll(pageNumber));
    }

    @Override
    @Operation(summary = "保存Persistent")
    @PostMapping(value = "savePersistent")
    public ResultVO save(@RequestBody @Validated Persistent po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Override
    @Operation(summary = "删除Persistent")
    @PostMapping(value = "deletePersistent")
    public ResultVO delete(@RequestBody Persistent po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据Persistent查询所有Authority")
    @PostMapping(value = "pageAuthorityByPersistent")
    public ResultVO pageAuthorityByPersistent(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("id") String id) {
        return ResultVO.success(service.pageAuthorityByPersistent(pageNumber, id));
    }

    @Operation(summary = "根据Persistent查询所有Property")
    @PostMapping(value = "pagePropertyByPersistent")
    public ResultVO pagePropertyByPersistent(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("id") String id) {
        return ResultVO.success(service.pagePropertyByPersistent(pageNumber, id));
    }

}
