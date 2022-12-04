package com.example.cyjcommon.entity.relation;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Noice
 */
@Getter
@Setter
@TableName(UserRole.T_USER_ROLE)
public class UserRole extends Model<UserRole> {

    static final String T_USER_ROLE = "t_user_role";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "user_id")
    private String userId;

    @TableField(value = "role_id")
    private String roleId;

}