package com.example.cyjcommon.entity.relation;

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
@TableName("t_role_authority")
public class RoleAuthority extends Model<RoleAuthority> {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField("role_id")
    private String roleId;

    @TableField("authority_id")
    private String authorityId;

}