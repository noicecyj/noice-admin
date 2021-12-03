package com.example.cyjquery.controller;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
@Tag(name = "自定义相关接口")
public interface IndexController {

        @Operation(summary = "通过sql查询")
        @InterFaceMapping(api = "sqlApi")
        @PostMapping(value = "doSql")
        ResultVO doSql(@RequestParam("sqlStr") String sqlStr,
                       @RequestParam("sqlType") String sqlType);

        @Operation(summary = "根据表查询所有")
        @InterFaceMapping(api = "sqlApi")
        @PostMapping(value = "doFindAllSql")
        ResultVO doFindAllSql(@RequestParam("tableName") String tableName);

        @Operation(summary = "根据表查询ID")
        @InterFaceMapping(api = "sqlApi")
        @PostMapping(value = "doFindSqlById")
        ResultVO doFindSqlById(@RequestParam("tableName") String tableName, @RequestParam("id") String id);

}