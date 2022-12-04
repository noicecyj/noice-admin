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
@TableName(Enterprise.T_ENTERPRISE)
public class Enterprise extends Model<Enterprise> {

    static final String T_ENTERPRISE = "t_enterprise";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "企业名称不能为空")
    @TableField(value = "enterprise_name")
    private String enterpriseName;

    @NotNull(message = "企业负责人不能为空")
    @TableField(value = "enterprise_admin")
    private String enterpriseAdmin;

    @TableField(value = "enterprise_description")
    private String enterpriseDescription;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}