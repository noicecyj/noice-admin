package com.example.cyjquery.service.custom;

import java.util.List;
import java.util.Map;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2022-02-07
 */
public interface SqlCustomService {

    /**
     * 使用sql查询
     *
     * @param sql sql语句
     * @return 查询结果
     */
    List<Map<String, Object>> queryBySql(String sql);

    /**
     * 使用value查询
     *
     * @param value value
     * @return 查询结果
     */
    List<Map<String, Object>> queryBySqlValue(String value);

    /**
     * 执行sql
     *
     * @param sql sql语句
     */
    void excuteSql(String sql);

    /**
     * 使用sql查询全部
     *
     * @param tableName 表名
     * @return 查询结果
     */
    List<Map<String, Object>> findAllSql(String tableName);

    /**
     * 使用主键sql查询
     *
     * @param tableName 表名
     * @param id        主键
     * @return 查询结果
     */
    Object findSqlById(String tableName, String id);

}
