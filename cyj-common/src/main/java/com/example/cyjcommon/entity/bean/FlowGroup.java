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
@TableName(FlowGroup.T_FLOW_GROUP)
public class FlowGroup extends Model<FlowGroup> {

    static final String T_FLOW_GROUP = "t_flow_group";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "分组名称不能为空")
    @TableField(value = "group_name")
    private String groupName;

    @NotNull(message = "分组类型不能为空")
    @TableField(value = "group_type")
    private String groupType;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}