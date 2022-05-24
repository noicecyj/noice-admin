package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.po.AppServicePO;
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
@Tag(name = "AppService")
public interface AppServiceController {

    @Operation(summary = "查询所有AppService")
    @PostMapping(value = "appServicePage")
    ResultVO appServicePage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存AppService")
    @PostMapping(value = "appServiceSave")
    ResultVO appServiceSave(@RequestBody @Validated AppServicePO po, BindingResult bindingResult);

    @Operation(summary = "删除AppService")
    @PostMapping(value = "appServiceDelete")
    ResultVO appServiceDelete(@RequestBody AppServicePO po);

}
