package com.example.cyjcommon.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Noice
 * @version 1.0
 */
@Entity
@Table(name = PropertyPO.T_PROPERTY)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class PropertyPO implements Serializable {

    static final String T_PROPERTY = "t_property";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "property_edit_enable")
    private String propertyEditEnable;

    @Column(name = "property_length")
    private String propertyLength;

    @NotNull(message = "属性编码不能为空")
    @Column(name = "property_code")
    private String propertyCode;

    @NotNull(message = "属性类型不能为空")
    @Column(name = "property_type")
    private String propertyType;

    @NotNull(message = "属性名称不能为空")
    @Column(name = "property_label")
    private String propertyLabel;

    @Column(name = "property_mode")
    private String propertyMode;

    @Column(name = "property_out")
    private String propertyOut;

    @Column(name = "property_width")
    private String propertyWidth;

    @Column(name = "property_direction")
    private String propertyDirection;

    @NotNull(message = "属性是否必填不能为空")
    @Column(name = "property_required")
    private String propertyRequired;

    @Column(name = "property_data_source_type")
    private String propertyDataSourceType;

    @Column(name = "property_default_value")
    private String propertyDefaultValue;

    @NotNull(message = "属性是否展示不能为空")
    @Column(name = "property_display")
    private String propertyDisplay;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "entity_id")
    private EntityPO entity;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}