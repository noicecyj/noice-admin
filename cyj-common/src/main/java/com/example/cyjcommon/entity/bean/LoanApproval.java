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
@TableName(LoanApproval.T_LOAN_APPROVAL)
public class LoanApproval extends Model<LoanApproval> {

    static final String T_LOAN_APPROVAL = "t_loan_approval";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "申请贷款名称不能为空")
    @TableField(value = "loan_approval_name")
    private String loanApprovalName;

    @NotNull(message = "申请人不能为空")
    @TableField(value = "loan_approval_user")
    private String loanApprovalUser;

    @NotNull(message = "贷款数量不能为空")
    @TableField(value = "loan_approval_num")
    private String loanApprovalNum;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}