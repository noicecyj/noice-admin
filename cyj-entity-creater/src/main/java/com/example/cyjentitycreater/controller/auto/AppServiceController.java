package com.example.cyjentitycreater.controller.auto;

import com.example.cyjentitycreater.service.auto.AppServiceService;
import com.example.cyjcommon.controller.autoController;
import com.example.cyjcommon.entity.AppService;
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
@Tag(name = "AppService")
public class AppServiceController implements autoController<AppService> {

    private AppServiceService service;

    @Autowired
    public void setService(AppServiceService service) {
        this.service = service;
    }

    @Override
    @Operation(summary = "分页查询所有AppService")
    @PostMapping(value = "pageAppService")
    public ResultVO page(@RequestParam("pageNumber") Integer pageNumber) {
        return ResultVO.success(service.findAll(pageNumber));
    }

    @Override
    @Operation(summary = "保存AppService")
    @PostMapping(value = "saveAppService")
    public ResultVO save(@RequestBody @Validated AppService po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Override
    @Operation(summary = "删除AppService")
    @PostMapping(value = "deleteAppService")
    public ResultVO delete(@RequestBody AppService po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据AppService查询所有Authority")
    @PostMapping(value = "pageAuthorityByAppService")
    public ResultVO pageAuthorityByAppService(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("id") String id) {
        return ResultVO.success(service.pageAuthorityByAppService(pageNumber, id));
    }

    @Operation(summary = "根据AppService查询所有Persistent")
    @PostMapping(value = "pagePersistentByAppService")
    public ResultVO pagePersistentByAppService(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("id") String id) {
        return ResultVO.success(service.pagePersistentByAppService(pageNumber, id));
    }

}
