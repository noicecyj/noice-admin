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
@TableName("t_persistent_table_search_config")
public class PersistentTableSearchConfigBean extends Model<PersistentTableSearchConfigBean> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField("persistent_table_search_config_name")
    private String persistentTableSearchConfigName;

    @TableField("persistent_table_search_config_code")
    private String persistentTableSearchConfigCode;

    @TableField("persistent_table_search_config_display")
    private int persistentTableSearchConfigDisplay;

    @TableField("persistent_table_search_config_mode")
    private String persistentTableSearchConfigMode;

    @TableField("persistent_table_search_config_data_source")
    private String persistentTableSearchConfigDataSource;

    @TableField("persistent_table_id")
    private String persistentTableId;

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