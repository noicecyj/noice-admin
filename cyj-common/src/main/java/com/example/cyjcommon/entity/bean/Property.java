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
@TableName("t_property")
public class Property extends Model<Property> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "property_code")
    private String propertyCode;

    @TableField(value = "property_name")
    private String propertyName;

    @TableField(value = "property_length")
    private int propertyLength;

    @TableField(value = "property_type")
    private String propertyType;

    @TableField(value = "property_null")
    private int propertyNull;

    @TableField(value = "persistent_id")
    private String persistentId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private int status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private int sortCode;

}