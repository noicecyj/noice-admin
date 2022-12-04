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
@TableName(Persistent.T_PERSISTENT)
public class Persistent extends Model<Persistent> {

    static final String T_PERSISTENT = "t_persistent";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "实体名称不能为空")
    @TableField(value = "persistent_name")
    private String persistentName;

    @NotNull(message = "实体编码不能为空")
    @TableField(value = "persistent_code")
    private String persistentCode;

    @NotNull(message = "表单类型不能为空")
    @TableField(value = "persistent_form_type")
    private String persistentFormType;

    @TableField(value = "persistent_custom_table")
    private String persistentCustomTable;

    @TableField(value = "persistent_edit_enable")
    private String persistentEditEnable;

    @TableField(value = "persistent_custom_form")
    private String persistentCustomForm;

    @TableField(value = "persistent_form_row")
    private Integer persistentFormRow;

    @TableField(value = "app_service_id")
    private String appServiceId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}