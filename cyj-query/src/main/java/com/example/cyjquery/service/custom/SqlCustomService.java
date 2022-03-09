package com.example.cyjquery.service.custom;

import java.util.HashMap;
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
     * 使用sql查询
     *
     * @param sql sql语句
     * @param str str
     * @return 查询结果
     */
    List<Map<String, Object>> queryBySql(String sql, HashMap<String, String> str);

    /**
     * 使用sql查询一条
     *
     * @param sql sql语句
     * @param str str
     * @return 查询结果
     */
    Map<String, Object> queryByOne(String sql, HashMap<String, String> str);

    /**
     * 使用value查询
     *
     * @param value value
     * @return 查询结果
     */
    List<Map<String, Object>> queryBySqlValue(String value);

    /**
     * 使用value查询,带参数
     *
     * @param value value
     * @param str   str
     * @return 查询结果
     */
    List<Map<String, Object>> queryBySqlValue(String value, HashMap<String, String> str);

    /**
     * 使用value查询,带参数
     *
     * @param value value
     * @param str   str
     * @return 查询结果
     */
    Map<String, Object> queryBySqlOne(String value, HashMap<String, String> str);


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
