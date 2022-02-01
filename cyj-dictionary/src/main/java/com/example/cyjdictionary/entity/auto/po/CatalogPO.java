package com.example.cyjdictionary.entity.auto.po;

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
 * @date 2022-02-01
 */
@Entity
@Table(name = CatalogPO.T_CATALOG)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
public class CatalogPO implements Serializable {

    static final String T_CATALOG = "t_catalog";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;
    @Column(name = "catalog_name")
    private String catalogName;
    @Column(name = "description")
    private String description;
    @Column(name = "catalog_value")
    private String catalogValue;
    @Column(name = "status")
    private String status;
    @Column(name = "sort_code")
    private String sortCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CatalogPO that = (CatalogPO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }

}