package com.example.cyjquery.controller.auto;

import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjquery.entity.auto.po.SqlPO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-20
 */
@Tag(name = "Sql")
public interface SqlController {

    @Operation(summary = "查询所有Sql")
    @InterFaceMapping(api = "sqlApi")
    @PostMapping(value = "sqlPage")
    ResultVO sqlPage(@RequestParam("pageNumber") Integer pageNumber);

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
