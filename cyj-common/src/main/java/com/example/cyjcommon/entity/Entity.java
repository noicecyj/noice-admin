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
@Table(name = Entity.T_ENTITY)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Entity implements Serializable {

    static final String T_ENTITY = "t_entity";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @NotNull(message = "实体名称不能为空")
    @Column(name = "entity_name")
    private String entityName;

    @NotNull(message = "实体编码不能为空")
    @Column(name = "entity_code")
    private String entityCode;

    @NotNull(message = "表单类型不能为空")
    @Column(name = "entity_form_type")
    private String entityFormType;

    @Column(name = "entity_custom_table")
    private String entityCustomTable;

    @Column(name = "entity_self")
    private String entitySelf;

    @Column(name = "entity_edit_enable")
    private String entityEditEnable;

    @Column(name = "entity_custom_form")
    private String entityCustomForm;

    @Column(name = "entity_form_row")
    private Integer entityFormRow;

    @Column(name = "app_service_id", insertable = false, updatable = false)
    private String appServiceId;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REMOVE})
    @JoinColumn(name = "app_service_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private AppService appService;

    @Column(name = "entity_id", insertable = false, updatable = false)
    private String entityId;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REMOVE})
    @JoinColumn(name = "entity_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private Entity entityParent;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}