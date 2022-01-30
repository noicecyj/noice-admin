package com.example.cyjquery.controller;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjquery.entity.po.SqlPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020-09-13
 */
@Tag(name = "sql相关接口")
public interface SqlController {

    @Operation(summary = "查询所有Entity")
    @InterFaceMapping(api = "sqlApi")
    @PostMapping(value = "sqlPage")
    ResultVO sqlFindAll(@RequestParam("pageNumber") Integer pageNumber,
                        @RequestParam("pageSize") Integer pageSize,
                        @RequestParam("sortCode") String sortCode);

    @Operation(summary = "保存Sql")
    @InterFaceMapping(api = "sqlApi")
    @PostMapping(value = "sqlSave")
    ResultVO sqlSave(@RequestBody SqlPO po);

    @Operation(summary = "删除Sql")
    @InterFaceMapping(api = "sqlApi")
    @PostMapping(value = "sqlDelete")
    void sqlDelete(@RequestParam("id") String id);

    @Operation(summary = "根据ID查询Sql")
    @InterFaceMapping(api = "sqlApi")
    @PostMapping(value = "findSqlById")
    ResultVO findSqlById(@RequestParam("id") String id);

}
