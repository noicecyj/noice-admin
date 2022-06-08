package com.example.cyjquery.controller.auto.Impl;

import com.example.cyjcommon.entity.Sql;
import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjquery.controller.auto.SqlController;
import com.example.cyjquery.service.auto.SqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noice
 */
@CrossOrigin
@RestController
@RequestMapping(value = "sqlApi")
public class SqlControllerImpl implements SqlController {

    private SqlService sqlService;

    @Autowired
    public void setSqlService(SqlService sqlService) {
        this.sqlService = sqlService;
    }

    @Override
    public ResultVO sqlPage(Integer pageNumber) {
        return ResultVO.success(sqlService.findAll(pageNumber));
    }

    @Override
    public ResultVO sqlSave(Sql po, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVO.failure(bindingResult.getAllErrors().get(0));
        }
        if (po.getId() == null) {
            return ResultVO.success(sqlService.addOne(po));
        }
        return ResultVO.success(sqlService.updateOne(po));
    }

    @Override
    public ResultVO sqlDelete(Sql po) {
        if (po.getId() == null) {
            return ResultVO.failure();
        }
        sqlService.deleteOne(po);
        return ResultVO.success();
    }

}
