package com.example.cyjcommon.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.ConstraintMode;
import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Noice
 */
@javax.persistence.Entity
@Table(name = Property.T_PROPERTY)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Property implements Serializable {

    static final String T_PROPERTY = "t_property";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @NotNull(message = "属性编码不能为空")
    @Column(name = "property_code")
    private String propertyCode;

    @NotNull(message = "属性类型不能为空")
    @Column(name = "property_type")
    private String propertyType;

    @NotNull(message = "属性名称不能为空")
    @Column(name = "property_label")
    private String propertyLabel;

    @NotNull(message = "属性是否必填不能为空")
    @Column(name = "property_required")
    private String propertyRequired;

    @NotNull(message = "属性是否展示不能为空")
    @Column(name = "property_display")
    private String propertyDisplay;

    @Column(name = "property_out")
    private String propertyOut;

    @Column(name = "property_out_type")
    private String propertyOutType;

    @Column(name = "property_width")
    private String propertyWidth;

    @Column(name = "property_mode")
    private String propertyMode;

    @Column(name = "property_direction")
    private String propertyDirection;

    @Column(name = "property_edit_enable")
    private String propertyEditEnable;

    @Column(name = "property_length")
    private String propertyLength;

    @Column(name = "property_data_source_type")
    private String propertyDataSourceType;

    @Column(name = "property_default_value")
    private String propertyDefaultValue;

    @Column(name = "persistent_id", insertable = false, updatable = false)
    private String persistentId;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REMOVE})
    @JoinColumn(name = "persistent_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private Persistent persistent;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}