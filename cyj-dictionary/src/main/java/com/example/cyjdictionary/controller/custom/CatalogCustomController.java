package com.example.cyjdictionary.controller.custom;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-12-26
 */
@Tag(name = "Catalog")
public interface CatalogCustomController {

        @Operation(summary = "根据目录名称或者值模糊查询")
        @InterFaceMapping(api = "dictionaryApi")
        @PostMapping(value = "findAllByCatalogNameContainsOrCatalogValueContains")
        ResultVO findAllByCatalogNameContainsOrCatalogValueContains(@RequestParam("catalogName") String catalogName,
                                                                    @RequestParam("catalogValue") String catalogValue,
                                                                    @RequestParam("pageNumber") Integer pageNumber,
                                                                    @RequestParam("pageSize") Integer pageSize,
                                                                    @RequestParam("sortCode") String sortCode);

}
