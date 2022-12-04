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
@TableName(Property.T_PROPERTY)
public class Property extends Model<Property> {

    static final String T_PROPERTY = "t_property";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "属性编码不能为空")
    @TableField(value = "property_code")
    private String propertyCode;

    @NotNull(message = "属性类型不能为空")
    @TableField(value = "property_type")
    private String propertyType;

    @NotNull(message = "属性名称不能为空")
    @TableField(value = "property_label")
    private String propertyLabel;

    @NotNull(message = "属性是否必填不能为空")
    @TableField(value = "property_required")
    private String propertyRequired;

    @NotNull(message = "属性是否展示不能为空")
    @TableField(value = "property_display")
    private String propertyDisplay;

    @TableField(value = "property_out")
    private String propertyOut;

    @TableField(value = "property_out_type")
    private String propertyOutType;

    @TableField(value = "property_width")
    private String propertyWidth;

    @TableField(value = "property_mode")
    private String propertyMode;

    @TableField(value = "property_direction")
    private String propertyDirection;

    @TableField(value = "property_edit_enable")
    private String propertyEditEnable;

    @TableField(value = "property_length")
    private String propertyLength;

    @TableField(value = "property_data_source_type")
    private String propertyDataSourceType;

    @TableField(value = "property_default_value")
    private String propertyDefaultValue;

    @TableField(value = "persistent_id")
    private String persistentId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}