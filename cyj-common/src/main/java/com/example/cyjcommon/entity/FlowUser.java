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
@Table(name = FlowUser.T_FLOW_USER)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class FlowUser implements Serializable {

    static final String T_FLOW_USER = "t_flow_user";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @NotNull(message = "姓不能为空")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "名不能为空")
    @Column(name = "second_name")
    private String secondName;

    @NotNull(message = "邮件不能为空")
    @Column(name = "email")
    private String email;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}