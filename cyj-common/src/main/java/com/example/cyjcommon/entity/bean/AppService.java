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
@TableName(AppService.APP_SERVICE)
public class AppService extends Model<AppService> {

    static final String APP_SERVICE = "app_service";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "服务名称不能为空")
    @TableField(value = "app_service_name")
    private String appServiceName;

    @NotNull(message = "服务路径不能为空")
    @TableField(value = "app_service_path")
    private String appServicePath;

    @NotNull(message = "服务接口不能为空")
    @TableField(value = "app_service_api")
    private String appServiceApi;

    @NotNull(message = "服务端口不能为空")
    @TableField(value = "app_service_port")
    private String appServicePort;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}