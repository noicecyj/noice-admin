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
@Table(name = Sql.T_SQL)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Sql implements Serializable {

    static final String T_SQL = "t_sql";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @NotNull(message = "查询类型不能为空")
    @Column(name = "sql_type")
    private String sqlType;

    @NotNull(message = "查询语句不能为空")
    @Column(name = "sql_str")
    private String sqlStr;

    @Column(name = "sql_description")
    private String sqlDescription;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}