package com.example.cyjquery.controller.auto;

import com.example.cyjcommon.entity.Sql;
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
@Tag(name = "Sql")
public interface SqlController {

    @Operation(summary = "查询所有Sql")
    @PostMapping(value = "sqlPage")
    ResultVO sqlPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存Sql")
    @PostMapping(value = "sqlSave")
    ResultVO sqlSave(@RequestBody @Validated Sql po, BindingResult bindingResult);

    @Operation(summary = "删除Sql")
    @PostMapping(value = "sqlDelete")
    ResultVO sqlDelete(@RequestBody Sql po);

}
