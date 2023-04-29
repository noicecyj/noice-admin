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
public class PersistentBean extends Model<PersistentBean> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField("persistent_name")
    private String persistentName;

    @TableField("persistent_code")
    private String persistentCode;

    @TableField("persistent_relation")
    private int persistentRelation;

    @TableField("persistent_multiple_relation")
    private int persistentMultipleRelation;

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
    private LocalDateTime updatedDate;

    @TableField("updated_by")
    private String updatedBy;

}