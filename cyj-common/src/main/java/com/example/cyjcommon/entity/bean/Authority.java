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
@TableName("t_authority")
public class Authority extends Model<Authority> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("app_service_id")
    private String appServiceId;

    @TableField("persistent_id")
    private String persistentId;

    @TableField("status")
    private int status;

    @TableField("sort_code")
    private long sortCode;

    @TableField("created_date")
    private LocalDateTime createdDate;

    @TableField("created_by")
    private String createdBy;

    @TableField("updated_date")
    private LocalDateTime updated_date;

    @TableField("updated_by")
    private String updatedBy;

}