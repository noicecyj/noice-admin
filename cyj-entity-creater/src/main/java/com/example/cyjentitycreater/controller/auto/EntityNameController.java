package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjentitycreater.entity.auto.po.EntityNamePO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Tag(name = "EntityName")
public interface EntityNameController {

    @Operation(summary = "查询所有EntityName")
    @PostMapping(value = "entityNamePage")
    ResultVO entityNamePage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存EntityName")
    @PostMapping(value = "entityNameSave")
    ResultVO entityNameSave(@RequestBody EntityNamePO po);

    @Operation(summary = "删除EntityName")
    @PostMapping(value = "entityNameDelete")
    void entityNameDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询EntityName")
    @PostMapping(value = "findEntityNameById")
    ResultVO findEntityNameById(@RequestParam("id") String id);

}
