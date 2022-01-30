package com.example.cyjdictionary.controller.custom.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjdictionary.controller.custom.CatalogCustomController;
import com.example.cyjdictionary.service.custom.CatalogCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
@CrossOrigin
@RestController
@RequestMapping(value = "dictionaryApi")
public class CatalogCustomControllerImpl implements CatalogCustomController {

    private CatalogCustomService catalogCustomService;

    @Autowired
    public void setCatalogCustomService(CatalogCustomService catalogCustomService) {
        this.catalogCustomService = catalogCustomService;
    }

    @Override
    public ResultVO findAllByCatalogNameContainsOrCatalogValueContains(@RequestParam("catalogName") String catalogName,
                                                                       @RequestParam("catalogValue") String catalogValue,
                                                                       @RequestParam("pageNumber") Integer pageNumber,
                                                                       @RequestParam("pageSize") Integer pageSize,
                                                                       @RequestParam("sortCode") String sortCode) {
        return ResultVO.success(catalogCustomService
                .findAllByCatalogNameContainsOrCatalogValueContains(catalogName, catalogValue, pageNumber - 1, pageSize, sortCode));
    }

}
