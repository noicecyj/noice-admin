package com.example.cyjcommon.entity.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @author Noice
 */
@Getter
@Setter
@TableName(Sql.T_SQL)
public class Sql extends Model<Sql> {

    static final String T_SQL = "t_sql";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "查询类型不能为空")
    @TableField(value = "sql_type")
    private String sqlType;

    @NotNull(message = "查询语句不能为空")
    @TableField(value = "sql_str")
    private String sqlStr;

    @TableField(value = "sql_description")
    private String sqlDescription;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}