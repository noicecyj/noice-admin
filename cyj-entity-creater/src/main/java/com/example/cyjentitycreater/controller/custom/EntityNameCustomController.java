package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.entity.vo.CreateVO;
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
@Tag(name = "EntityName")
public interface EntityNameCustomController {

    @Operation(summary = "生成实体类文件")
    @PostMapping(value = "createEntity")
    ResultVO createEntity(@RequestBody CreateVO createVO);

    @Operation(summary = "创建表格与表单")
    @PostMapping(value = "findDataTableAndFormByName")
    ResultVO findDataTableAndFormByName(@RequestParam("entityCode") String entityCode);

}
