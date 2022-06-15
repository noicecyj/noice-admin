package com.example.cyjcommon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.ConstraintMode;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Noice
 */
@Entity
@Table(name = Persistent.T_PERSISTENT)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Persistent implements Serializable {

    static final String T_PERSISTENT = "t_persistent";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @NotNull(message = "实体名称不能为空")
    @Column(name = "persistent_name")
    private String persistentName;

    @NotNull(message = "实体编码不能为空")
    @Column(name = "persistent_code")
    private String persistentCode;

    @NotNull(message = "表单类型不能为空")
    @Column(name = "persistent_form_type")
    private String persistentFormType;

    @Column(name = "persistent_custom_table")
    private String persistentCustomTable;

    @Column(name = "persistent_edit_enable")
    private String persistentEditEnable;

    @Column(name = "persistent_custom_form")
    private String persistentCustomForm;

    @Column(name = "persistent_form_row")
    private Integer persistentFormRow;

    @JsonIgnore
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "persistent")
    @BatchSize(size = 20)
    private Set<Authority> authority = new HashSet<>();

    @JsonIgnore
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "persistent")
    @BatchSize(size = 20)
    private Set<Property> property = new HashSet<>();

    @Column(name = "app_service_id", insertable = false, updatable = false)
    private String appServiceId;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REMOVE})
    @JoinColumn(name = "app_service_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private AppService appService;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}