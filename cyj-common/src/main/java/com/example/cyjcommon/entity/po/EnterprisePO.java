package com.example.cyjcommon.entity.po;

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
 * @author Noice
 * @version 1.0
 */
@Entity
@Table(name = EnterprisePO.T_ENTERPRISE)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
public class EnterprisePO implements Serializable {

    static final String T_ENTERPRISE = "t_enterprise";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;
    @Column(name = "enterprise_admin")
    private String enterpriseAdmin;
    @Column(name = "enterprise_name")
    private String enterpriseName;
    @Column(name = "enterprise_description")
    private String enterpriseDescription;
    @Column(name = "status")
    private String status;
    @Column(name = "sort_code")
    private String sortCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EnterprisePO that = (EnterprisePO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }

}