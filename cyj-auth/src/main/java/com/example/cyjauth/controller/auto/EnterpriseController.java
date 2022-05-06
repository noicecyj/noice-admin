package com.example.cyjauth.controller.auto;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjauth.entity.auto.po.EnterprisePO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Tag(name = "Enterprise")
public interface EnterpriseController {

    @Operation(summary = "查询所有Enterprise")
    @PostMapping(value = "enterprisePage")
    ResultVO enterprisePage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存Enterprise")
    @PostMapping(value = "enterpriseSave")
    ResultVO enterpriseSave(@RequestBody EnterprisePO po);

    @Operation(summary = "删除Enterprise")
    @PostMapping(value = "enterpriseDelete")
    void enterpriseDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Enterprise")
    @PostMapping(value = "findEnterpriseById")
    ResultVO findEnterpriseById(@RequestParam("id") String id);

}