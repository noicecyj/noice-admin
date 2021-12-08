package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.entity.auto.dto.AppServiceDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
@Tag(name = "AppService")
public interface AppServiceController {

        @Operation(summary = "查询所有AppService")
        @InterFaceMapping(api = "entityCreateApi")
        @PostMapping(value = "appServicePage")
        ResultVO appServicePage(@RequestParam("pageNumber") Integer pageNumber);

        @Operation(summary = "保存AppService")
        @InterFaceMapping(api = "entityCreateApi")
        @PostMapping(value = "appServiceSave")
        ResultVO appServiceSave(@RequestBody AppServiceDTO dto);

        @Operation(summary = "删除AppService")
        @InterFaceMapping(api = "entityCreateApi")
        @PostMapping(value = "appServiceDelete")
        void appServiceDelete(@RequestParam("id") String id);

        @Operation(summary = "根据ID查询AppService")
        @InterFaceMapping(api = "entityCreateApi")
        @PostMapping(value = "findAppServiceById")
        ResultVO findAppServiceById(@RequestParam("id") String id);

}
