package com.example.cyjquery.controller.bean.auto;

import com.example.cyjcommon.entity.bean.Sql;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjquery.service.bean.auto.SqlServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("sqlApi")
@Tag(name = "Sql")
public class SqlController {

    private SqlServiceImpl service;

    @Autowired
    public void setService(SqlServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有Sql")
    @PostMapping(value = "pageSql")
    public ResultVO page(@RequestBody @Validated Sql po,
                         @RequestParam("pageNumber") Integer pageNumber,
                         @RequestParam("pageSize") Integer pageSize) {
        return ResultVO.success(service.findAll(po, pageNumber, pageSize));
    }

    @Operation(summary = "保存Sql")
    @PostMapping(value = "saveSql")
    public ResultVO save(@RequestBody @Validated Sql po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(service.addOne(po));
        }
        return ResultVO.success(service.updateOne(po));
    }

    @Operation(summary = "删除Sql")
    @PostMapping(value = "deleteSql")
    public ResultVO delete(@RequestBody Sql po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(po);
        return ResultVO.success();
    }

}
