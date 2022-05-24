package com.example.cyjauth.controller.auto;

import com.example.cyjcommon.entity.po.EnterprisePO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Noice
 */
@Tag(name = "Enterprise")
public interface EnterpriseController {

    @Operation(summary = "查询所有Enterprise")
    @PostMapping(value = "enterprisePage")
    ResultVO enterprisePage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存Enterprise")
    @PostMapping(value = "enterpriseSave")
    ResultVO enterpriseSave(@RequestBody @Validated EnterprisePO po, BindingResult bindingResult);

    @Operation(summary = "删除Enterprise")
    @PostMapping(value = "enterpriseDelete")
    ResultVO enterpriseDelete(@RequestBody EnterprisePO po);

}
