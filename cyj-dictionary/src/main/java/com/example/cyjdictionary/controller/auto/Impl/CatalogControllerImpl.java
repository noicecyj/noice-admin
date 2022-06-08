package com.example.cyjdictionary.controller.auto.Impl;

import com.example.cyjcommon.entity.Catalog;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.controller.auto.CatalogController;
import com.example.cyjdictionary.service.auto.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "dictionaryApi")
public class CatalogControllerImpl implements CatalogController {

    private CatalogService catalogService;

    @Autowired
    public void setCatalogService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @Override
    public ResultVO catalogPage(Integer pageNumber) {
        return ResultVO.success(catalogService.findAll(pageNumber));
    }

    @Override
    public ResultVO catalogSave(Catalog po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(catalogService.addOne(po));
        }
        return ResultVO.success(catalogService.updateOne(po));
    }

    @Override
    public ResultVO catalogDelete(Catalog po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        catalogService.deleteOne(po);
        return ResultVO.success();
    }

}
