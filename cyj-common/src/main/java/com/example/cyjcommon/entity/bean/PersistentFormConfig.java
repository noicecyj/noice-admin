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
@TableName("t_persistent_form_config")
public class PersistentFormConfig extends Model<PersistentFormConfig> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_required")
    private int persistentFormConfigRequired;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private int persistentFormConfigEdit;

    @TableField("persistent_form_id")
    private String persistentFormId;

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