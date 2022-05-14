package com.example.cyjquery.controller.auto;

import com.example.cyjcommon.entity.po.SqlPO;
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
@Tag(name = "Sql")
public interface SqlController {

    @Operation(summary = "查询所有Sql")
    @PostMapping(value = "sqlPage")
    ResultVO sqlPage(@RequestParam("pageNumber") Integer pageNumber);

    @Operation(summary = "保存Sql")
    @PostMapping(value = "sqlSave")
    ResultVO sqlSave(@RequestBody SqlPO po);

    @Operation(summary = "删除Sql")
    @PostMapping(value = "sqlDelete")
    void sqlDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Sql")
    @PostMapping(value = "findSqlById")
    ResultVO findSqlById(@RequestParam("id") String id);

}
