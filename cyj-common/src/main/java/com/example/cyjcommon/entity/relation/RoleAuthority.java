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
@TableName(RoleAuthority.T_ROLE_AUTHORITY)
public class RoleAuthority extends Model<RoleAuthority> {

    static final String T_ROLE_AUTHORITY = "t_role_authority";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "role_id")
    private String roleId;

    @TableField(value = "authority_id")
    private String authorityId;

}