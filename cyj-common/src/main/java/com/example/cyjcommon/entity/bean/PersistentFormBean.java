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
@TableName("t_persistent_form")
public class PersistentFormBean extends Model<PersistentFormBean> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_form_row")
    private int persistentFormRow;

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