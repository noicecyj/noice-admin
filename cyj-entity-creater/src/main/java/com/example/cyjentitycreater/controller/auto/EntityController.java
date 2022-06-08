package com.example.cyjentitycreater.controller.auto;

import com.example.cyjcommon.entity.AppService;
import com.example.cyjcommon.entity.Entity;
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
@Tag(name = "Entity")
public interface EntityController {

    @Operation(summary = "查询所有Entity")
    @PostMapping(value = "entityPage")
    ResultVO entityPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "根据Entity查询所有Entity")
    @PostMapping(value = "entityPageByEntity")
    ResultVO entityPage(@RequestParam("pageNumber") Integer pageNumber, @RequestBody Entity entity);

    @Operation(summary = "根据AppService查询所有Entity")
    @PostMapping(value = "entityPageByAppService")
    ResultVO entityPage(@RequestParam("pageNumber") Integer pageNumber, @RequestBody AppService appService);

    @Operation(summary = "保存Entity")
    @PostMapping(value = "entitySave")
    ResultVO entitySave(@RequestBody @Validated Entity po, BindingResult bindingResult);

    @Operation(summary = "删除Entity")
    @PostMapping(value = "entityDelete")
    ResultVO entityDelete(@RequestBody Entity po);

}
