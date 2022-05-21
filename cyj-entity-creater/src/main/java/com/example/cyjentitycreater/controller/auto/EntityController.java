package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.EntityPO;
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
 * @version 1.0
 */
@Tag(name = "Entity")
public interface EntityController {

    @Operation(summary = "查询所有Entity")
    @PostMapping(value = "entityPage")
    ResultVO entityPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "根据Entity查询所有Entity")
    @PostMapping(value = "entityPageByEntity")
    ResultVO entityPage(@RequestParam("pageNumber") Integer pageNumber, @RequestBody EntityPO entity);

    @Operation(summary = "根据AppService查询所有Entity")
    @PostMapping(value = "entityPageByAppService")
    ResultVO entityPage(@RequestParam("pageNumber") Integer pageNumber, @RequestBody AppServicePO appServicePO);

    @Operation(summary = "保存Entity")
    @PostMapping(value = "entitySave")
    ResultVO entitySave(@RequestBody @Validated EntityPO po, BindingResult bindingResult);

    @Operation(summary = "删除Entity")
    @PostMapping(value = "entityDelete")
    ResultVO entityDelete(@RequestBody EntityPO po);

}
