package com.example.cyjcommon.mapper.bean;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cyjcommon.entity.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Noice
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}