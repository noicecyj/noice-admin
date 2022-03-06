package com.example.cyjdictionary.controller.auto.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.controller.auto.CatalogController;
import com.example.cyjdictionary.entity.auto.po.CatalogPO;
import com.example.cyjdictionary.service.auto.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
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
    public ResultVO catalogSave(CatalogPO po) {
        if (po.getId() == null) {
            return ResultVO.success(catalogService.addOne(po));
        }
        return ResultVO.success(catalogService.updateOne(po));
    }

    @Override
    public void catalogDelete(String id) {
        catalogService.deleteOne(id);
    }

    @Override
    public ResultVO findCatalogById(String id) {
        return ResultVO.success(catalogService.findOneById(id));
    }

}
