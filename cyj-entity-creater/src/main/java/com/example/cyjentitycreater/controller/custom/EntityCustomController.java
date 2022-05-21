package com.example.cyjentitycreater.controller.custom;

import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Noice
 * @version 1.0
 * @date 2021-10-16
 */
@Tag(name = "Entity")
public interface EntityCustomController {

    @Operation(summary = "生成实体类文件")
    @PostMapping(value = "createEntity")
    ResultVO createEntity(@RequestBody EntityPO po);

    @Operation(summary = "创建表格与表单")
    @PostMapping(value = "findDataTableAndFormByName")
    ResultVO findDataTableAndFormByName(@RequestParam("entityCode") String entityCode);

}
