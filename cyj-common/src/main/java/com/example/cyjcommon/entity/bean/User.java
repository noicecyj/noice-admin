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
@TableName(User.T_USER)
public class User extends Model<User> {

    static final String T_USER = "t_user";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "用户名不能为空")
    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "name")
    private String name;

    @NotNull(message = "姓不能为空")
    @TableField(value = "first_name")
    private String firstName;

    @NotNull(message = "名不能为空")
    @TableField(value = "second_name")
    private String secondName;

    @TableField(value = "phone")
    private String phone;

    @TableField(value = "password")
    private String password;

    @TableField(value = "enterprise_id")
    private String enterpriseId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}