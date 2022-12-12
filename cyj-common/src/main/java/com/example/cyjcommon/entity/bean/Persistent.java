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
@TableName("t_persistent")
public class Persistent extends Model<Persistent> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField("persistent_name")
    private String persistentName;

    @TableField("persistent_code")
    private String persistentCode;

    @TableField("persistent_relation")
    private int persistentRelation;

    @TableField("app_service_id")
    private String appServiceId;

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