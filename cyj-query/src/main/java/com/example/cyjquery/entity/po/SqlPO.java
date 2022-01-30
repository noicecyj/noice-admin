package com.example.cyjquery.entity.po;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020-09-13
 */
@Entity
@Table(name = SqlPO.T_SQL)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
public class SqlPO implements Serializable {

    static final String T_SQL = "t_sql";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;
    @Column(name = "sql_str")
    private String sqlStr;
    @Column(name = "sql_description")
    private String sqlDescription;
    @Column(name = "sql_type")
    private String sqlType;
    @Column(name = "sort_code")
    private String sortCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SqlPO sqlPO = (SqlPO) o;
        return Objects.equals(id, sqlPO.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}