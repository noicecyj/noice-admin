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
@TableName(Role.T_ROLE)
public class Role extends Model<Role> {

    static final String T_ROLE = "t_role";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "角色名称不能为空")
    @TableField(value = "role_name")
    private String roleName;

    @NotNull(message = "角色值不能为空")
    @TableField(value = "role_value")
    private String roleValue;

    @NotNull(message = "角色描述不能为空")
    @TableField(value = "role_description")
    private String roleDescription;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}