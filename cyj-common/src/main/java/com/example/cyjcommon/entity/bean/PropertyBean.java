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
@TableName("t_property")
public class PropertyBean extends Model<PropertyBean> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField("property_code")
    private String propertyCode;

    @TableField("property_name")
    private String propertyName;

    @TableField("property_length")
    private int propertyLength;

    @TableField("property_type")
    private String propertyType;

    @TableField("property_null")
    private int propertyNull;

    @TableField("property_relation")
    private int propertyRelation;

    @TableField("property_multiple_relation")
    private int propertyMultipleRelation;

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