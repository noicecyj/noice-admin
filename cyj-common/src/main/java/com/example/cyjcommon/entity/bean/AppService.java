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
@TableName("t_app_service")
public class AppService extends Model<AppService> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_code")
    private String appServiceCode;

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