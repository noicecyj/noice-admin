package com.example.cyjcommon.entity.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_persistent")
public class Persistent extends Model<Persistent> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "persistent_name")
    private String persistentName;

    @TableField(value = "persistent_code")
    private String persistentCode;

    @TableField(value = "app_service_id")
    private String appServiceId;

    @TableField(value = "status")
    private int status;

    @TableField(value = "sort_code")
    private int sortCode;

}