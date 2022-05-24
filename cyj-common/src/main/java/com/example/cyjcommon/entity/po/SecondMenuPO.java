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
 */
@Entity
@Table(name = SecondMenuPO.T_SECOND_MENU)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class SecondMenuPO implements Serializable {

    static final String T_SECOND_MENU = "t_second_menu";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @NotNull(message = "菜单编码不能为空")
    @Column(name = "second_menu_code")
    private String secondMenuCode;

    @NotNull(message = "组件不能为空")
    @Column(name = "second_menu_component")
    private String secondMenuComponent;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "first_menu_id")
    private FirstMenuPO firstMenu;

    @NotNull(message = "路径不能为空")
    @Column(name = "second_menu_path")
    private String secondMenuPath;

    @NotNull(message = "菜单名称不能为空")
    @Column(name = "second_menu_name")
    private String secondMenuName;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}