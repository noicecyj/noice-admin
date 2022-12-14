package com.example.cyjcommon.entity.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_sql")
public class Sql extends Model<Sql> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @TableField("status")
    private int status;

    @TableField("sort_code")
    private int sortCode;

    @TableField("created_date")
    private LocalDateTime createdDate;

    @TableField("created_by")
    private String createdBy;

    @TableField("updated_date")
    private LocalDateTime updated_date;

    @TableField("updated_by")
    private String updatedBy;

}