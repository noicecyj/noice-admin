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
@TableName(FlowUser.T_FLOW_USER)
public class FlowUser extends Model<FlowUser> {

    static final String T_FLOW_USER = "t_flow_user";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "姓不能为空")
    @TableField(value = "first_name")
    private String firstName;

    @NotNull(message = "名不能为空")
    @TableField(value = "second_name")
    private String secondName;

    @NotNull(message = "邮件不能为空")
    @TableField(value = "email")
    private String email;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}