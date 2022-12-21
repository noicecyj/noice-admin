package com.example.cyjdictionary.controller.bean.auto;

import com.example.cyjcommon.entity.bean.CatalogBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.service.bean.auto.CatalogServiceImpl;
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
@RequestMapping("dictionaryApi")
@Tag(name = "CatalogBean")
public class CatalogController {

    private CatalogServiceImpl service;

    @Autowired
    public void setService(CatalogServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有Catalog")
    @PostMapping(value = "pageCatalog")
    public ResultVO page(@RequestBody @Validated CatalogBean po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存Catalog")
    @PostMapping(value = "saveCatalog")
    public ResultVO save(@RequestBody @Validated CatalogBean po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除Catalog")
    @PostMapping(value = "deleteCatalog")
    public ResultVO delete(@RequestBody CatalogBean po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
