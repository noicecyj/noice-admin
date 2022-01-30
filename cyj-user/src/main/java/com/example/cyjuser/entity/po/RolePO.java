package com.example.cyjuser.entity.po;

import com.example.cyjcommon.entity.po.AuthorityPO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
@Entity
@Table(name = RolePO.T_ROLE)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
public class RolePO implements Serializable {

    static final String T_ROLE = "t_role";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private String value;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private Integer status;
    @Column(name = "sort_code")
    private String sortCode;
    @JsonIgnore
    @ManyToMany(targetEntity = AuthorityPO.class, fetch = FetchType.EAGER)
    @BatchSize(size = 20)
    private Set<AuthorityPO> authority = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RolePO rolePO = (RolePO) o;
        return Objects.equals(id, rolePO.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}