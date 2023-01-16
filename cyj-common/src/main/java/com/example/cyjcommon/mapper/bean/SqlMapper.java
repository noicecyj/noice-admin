package com.example.cyjcommon.mapper.bean;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cyjcommon.entity.bean.SqlBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author Noice
 */
@Mapper
public interface SqlMapper extends BaseMapper<SqlBean> {

    @Select("${sql}")
    List<Map> executeSql(Map map);

}