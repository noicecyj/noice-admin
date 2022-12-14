package com.example.cyjdictionary.controller.bean.auto;

import com.example.cyjcommon.entity.bean.Dictionary;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl;
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
@Tag(name = "Dictionary")
public class DictionaryController {

    private DictionaryServiceImpl service;

    @Autowired
    public void setService(DictionaryServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有Dictionary")
    @PostMapping(value = "pageDictionary")
    public ResultVO page(@RequestBody @Validated Dictionary po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存Dictionary")
    @PostMapping(value = "saveDictionary")
    public ResultVO save(@RequestBody @Validated Dictionary po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除Dictionary")
    @PostMapping(value = "deleteDictionary")
    public ResultVO delete(@RequestBody Dictionary po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

    @Operation(summary = "根据CatalogId查询所有Dictionary")
    @PostMapping(value = "pageDictionaryByCatalogId")
    public ResultVO pageDictionaryByAppService(@RequestBody @Validated Dictionary po,
                                               @RequestParam("pageNumber") Integer pageNumber,
                                               @RequestParam("pageSize") Integer pageSize,
                                               @RequestParam("catalogId") String catalogId) {
        return ResultVO.success(service.pageDictionaryByCatalogId(po, pageNumber, pageSize, catalogId));
    }

}
