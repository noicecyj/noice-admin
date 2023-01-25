package com.example.cyjquery.controller.bean.auto;

import com.example.cyjcommon.entity.vo.PageBeanVo;
import com.example.cyjcommon.entity.bean.SqlBean;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjquery.service.bean.auto.SqlServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping("sqlApi")
@Tag(name = "SqlBean")
public class SqlController {

    private SqlServiceImpl service;

    @Autowired
    public void setService(SqlServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "分页查询所有Sql")
    @PostMapping(value = "pageSql")
    public ResultVO page(@RequestBody PageBeanVo<SqlBean> vo) {
        return ResultVO.success(service.findAll(vo.po, vo.pageNumber, vo.pageSize));
    }

    @Operation(summary = "保存Sql")
    @PostMapping(value = "saveSql")
    public ResultVO save(@RequestBody PageBeanVo<SqlBean> vo) {
        vo.po.setUpdatedBy(vo.user);
        if (vo.po.getId() == null) {
            vo.po.setCreatedBy(vo.user);
            return ResultVO.success(service.addOne(vo.po));
        }
        return ResultVO.success(service.updateOne(vo.po));
    }

    @Operation(summary = "删除Sql")
    @PostMapping(value = "deleteSql")
    public ResultVO delete(@RequestBody PageBeanVo<SqlBean> vo) {
        if (vo.po.getId() == null) {
            return ResultVO.failure();
        }
        service.deleteOne(vo.po);
        return ResultVO.success();
    }

}
