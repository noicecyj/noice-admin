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
@TableName(Authority.T_AUTHORITY)
public class Authority extends Model<Authority> {

    static final String T_AUTHORITY = "t_authority";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "服务名称不能为空")
    @TableField(value = "authority_method")
    private String authorityMethod;

    @NotNull(message = "名称不能为空")
    @TableField(value = "authority_name")
    private String authorityName;

    @NotNull(message = "权限路径不能为空")
    @TableField(value = "authority_path")
    private String authorityPath;

    @TableField(value = "authority_description")
    private String authorityDescription;

    @TableField(value = "authority_type")
    private String authorityType;

    @TableField(value = "persistent_id")
    private String persistentId;

    @TableField(value = "app_service_id")
    private String appServiceId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}