package com.example.cyjquery.controller.auto.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjquery.controller.auto.SqlController;
import com.example.cyjquery.entity.auto.po.SqlPO;
import com.example.cyjquery.service.auto.SqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
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
    public ResultVO sqlSave(SqlPO po) {
        if (po.getId() == null) {
            return ResultVO.success(sqlService.addOne(po));
        }
        return ResultVO.success(sqlService.updateOne(po));
    }

    @Override
    public void sqlDelete(String id) {
        sqlService.deleteOne(id);
    }

    @Override
    public ResultVO findSqlById(String id) {
        return ResultVO.success(sqlService.findOneById(id));
    }

}
