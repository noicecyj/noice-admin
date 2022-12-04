package com.example.cyjcommon.mapper.bean;

import com.alibaba.fastjson2.JSONArray;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cyjcommon.entity.bean.Sql;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Noice
 */
@Mapper
public interface SqlMapper extends BaseMapper<Sql> {

    @Select("${sqlStr}")
    JSONArray queryBySql(@Param(value = "sqlStr") String sql);

}
