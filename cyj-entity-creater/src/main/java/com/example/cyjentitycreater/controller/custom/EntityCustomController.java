package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.entity.Entity;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Noice
 */
@Tag(name = "Entity")
public interface EntityCustomController {

    @Operation(summary = "生成实体类文件")
    @PostMapping(value = "createEntity")
    ResultVO createEntity(@RequestBody Entity po);

    @Operation(summary = "创建表格与表单")
    @PostMapping(value = "findDataTableAndFormByName")
    ResultVO findDataTableAndFormByName(@RequestParam("entityCode") String entityCode);

}
