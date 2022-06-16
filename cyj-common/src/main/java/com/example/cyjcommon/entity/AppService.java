package com.example.cyjcommon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name = AppService.T_APP_SERVICE)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class AppService implements Serializable {

    static final String T_APP_SERVICE = "t_app_service";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @NotNull(message = "服务接口不能为空")
    @Column(name = "app_service_api")
    private String appServiceApi;

    @NotNull(message = "服务端口不能为空")
    @Column(name = "app_service_port")
    private String appServicePort;

    @NotNull(message = "服务路径不能为空")
    @Column(name = "app_service_path")
    private String appServicePath;

    @NotNull(message = "服务名称不能为空")
    @Column(name = "app_service_name")
    private String appServiceName;

    @JsonIgnore
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "appService")
    @BatchSize(size = 20)
    private Set<Authority> authority = new HashSet<>();

    @JsonIgnore
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "appService")
    @BatchSize(size = 20)
    private Set<Persistent> persistent = new HashSet<>();

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}