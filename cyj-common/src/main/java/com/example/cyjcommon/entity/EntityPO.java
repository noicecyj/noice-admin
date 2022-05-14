package com.example.cyjcommon.entity;

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
 */
@Entity
@Table(name = EntityPO.T_ENTITY)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
public class EntityPO implements Serializable {

    static final String T_ENTITY = "t_entity";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;
    @Column(name = "property_edit_enable")
    private String propertyEditEnable;
    @Column(name = "property_length")
    private String propertyLength;
    @Column(name = "pid")
    private String pid;
    @Column(name = "property_code")
    private String propertyCode;
    @Column(name = "property_type")
    private String propertyType;
    @Column(name = "property_label")
    private String propertyLabel;
    @Column(name = "property_width")
    private String propertyWidth;
    @Column(name = "property_mode")
    private String propertyMode;
    @Column(name = "property_direction")
    private String propertyDirection;
    @Column(name = "property_required")
    private String propertyRequired;
    @Column(name = "property_data_source_type")
    private String propertyDataSourceType;
    @Column(name = "property_default_value")
    private String propertyDefaultValue;
    @Column(name = "property_display")
    private String propertyDisplay;
    @Column(name = "property_name")
    private String propertyName;
    @Column(name = "status")
    private String status;
    @Column(name = "sort_code")
    private String sortCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EntityPO that = (EntityPO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }

}