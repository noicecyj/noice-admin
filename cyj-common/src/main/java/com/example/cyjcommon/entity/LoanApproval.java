package com.example.cyjcommon.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Noice
 */
@Entity
@Table(name = LoanApproval.T_LOAN_APPROVAL)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class LoanApproval implements Serializable {

    static final String T_LOAN_APPROVAL = "t_loan_approval";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @NotNull(message = "申请贷款名称不能为空")
    @Column(name = "loan_approval_name")
    private String loanApprovalName;

    @NotNull(message = "申请人不能为空")
    @Column(name = "loan_approval_user")
    private String loanApprovalUser;

    @NotNull(message = "贷款数量不能为空")
    @Column(name = "loan_approval_num")
    private String loanApprovalNum;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}