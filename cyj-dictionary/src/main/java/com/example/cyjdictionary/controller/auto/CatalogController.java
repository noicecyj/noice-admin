package com.example.cyjdictionary.controller.auto;

import com.example.cyjdictionary.service.auto.CatalogService;
import com.example.cyjcommon.controller.autoController;
import com.example.cyjcommon.entity.Catalog;
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
@RequestMapping(value = "dictionaryApi")
@Tag(name = "Catalog")
public class CatalogController implements autoController<Catalog> {

    private CatalogService service;

    @Autowired
    public void setService(CatalogService service) {
        this.service = service;
    }

    @Override
    @Operation(summary = "分页查询所有Catalog")
    @PostMapping(value = "pageCatalog")
    public ResultVO page(@RequestParam("pageNumber") Integer pageNumber) {
        return ResultVO.success(service.findAll(pageNumber));
    }

    @Override
    @Operation(summary = "保存Catalog")
    @PostMapping(value = "saveCatalog")
    public ResultVO save(@RequestBody @Validated Catalog po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Override
    @Operation(summary = "删除Catalog")
    @PostMapping(value = "deleteCatalog")
    public ResultVO delete(@RequestBody Catalog po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据Catalog查询所有Dictionary")
    @PostMapping(value = "pageDictionaryByCatalog")
    public ResultVO pageDictionaryByCatalog(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("id") String id) {
        return ResultVO.success(service.pageDictionaryByCatalog(pageNumber, id));
    }

}
