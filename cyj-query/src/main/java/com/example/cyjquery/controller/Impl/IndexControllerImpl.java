package com.example.cyjquery.controller.Impl;

import com.example.cyjcommon.utils.ResultVO;
import com.example.cyjquery.controller.IndexController;
import com.example.cyjquery.service.Impl.IndexServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020-08-30
 */
@CrossOrigin
@RestController
@RequestMapping(value = "sqlApi")
public class IndexControllerImpl implements IndexController {

    private IndexServiceImpl indexService;

    @Autowired
    public void setIndexService(IndexServiceImpl indexService) {
        this.indexService = indexService;
    }

    @Override
    public ResultVO doSql(@RequestParam("sqlStr") String sqlStr,
                          @RequestParam("sqlType") String sqlType) {
        String query = "查询";
        try {
            if (query.equals(sqlType)) {
                return ResultVO.success(indexService.queryBySql(sqlStr));
            } else {
                indexService.excuteSql(sqlStr);
                return ResultVO.success();
            }
        } catch (Exception e) {
            return ResultVO.failure(e.getCause().getCause());
        }
    }

    @Override
    public ResultVO doFindAllSql(@RequestParam("tableName") String tableName) {
        return ResultVO.success(indexService.findAllSql(tableName));
    }

    @Override
    public ResultVO doFindSqlById(@RequestParam("tableName") String tableName, @RequestParam("id") String id) {
        return ResultVO.success(indexService.findSqlById(tableName, id));
    }

}
