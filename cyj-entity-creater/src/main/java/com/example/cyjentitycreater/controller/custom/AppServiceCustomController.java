package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.entity.custom.vo.CreateVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
@Tag(name = "AppService")
public interface AppServiceCustomController {

    @Operation(summary = "生成服务文件")
    @InterFaceMapping(api = "entityCreateApi")
    @PostMapping(value = "createAppFile")
    ResultVO createAppFile(@RequestBody CreateVO createVO);

}
