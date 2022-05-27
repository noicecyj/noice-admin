package com.example.cyjcommon.entity.po;

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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

/**
 * @author Noice
 */
@Entity
@Table(name = AuthorityPO.T_AUTHORITY)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class AuthorityPO implements Serializable {

    static final String T_AUTHORITY = "t_authority";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @NotNull(message = "请求模式不能为空")
    @Column(name = "authority_method")
    private String authorityMethod;

    @NotNull(message = "名称不能为空")
    @Column(name = "authority_name")
    private String authorityName;

    @NotNull(message = "权限路径不能为空")
    @Column(name = "authority_path")
    private String authorityPath;

    @Column(name = "authority_description")
    private String authorityDescription;

    @Column(name = "authority_type")
    private String authorityType;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.REMOVE})
    @JoinColumn(name = "app_service_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private AppServicePO appService;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.REMOVE})
    @JoinColumn(name = "entity_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private EntityPO entity;

    @JsonIgnore
    @ManyToMany(targetEntity = UserPO.class, fetch = FetchType.EAGER)
    @BatchSize(size = 20)
    private Set<UserPO> user;

    @JsonIgnore
    @ManyToMany(targetEntity = RolePO.class, fetch = FetchType.EAGER)
    @BatchSize(size = 20)
    private Set<RolePO> role;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}