package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.AppServicePO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Tag(name = "AppService")
public interface AppServiceController {

    @Operation(summary = "查询所有AppService")
    @PostMapping(value = "appServicePage")
    ResultVO appServicePage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存AppService")
    @PostMapping(value = "appServiceSave")
    ResultVO appServiceSave(@RequestBody AppServicePO po);

    @Operation(summary = "删除AppService")
    @PostMapping(value = "appServiceDelete")
    void appServiceDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询AppService")
    @PostMapping(value = "findAppServiceById")
    ResultVO findAppServiceById(@RequestParam("id") String id);

}
