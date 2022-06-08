package com.example.cyjcommon.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Noice
 */
@Entity
@Table(name = FirstMenu.T_FIRST_MENU)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class FirstMenu implements Serializable {

    static final String T_FIRST_MENU = "t_first_menu";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @NotNull(message = "路径不能为空")
    @Column(name = "first_menu_path")
    private String firstMenuPath;

    @NotNull(message = "菜单编码不能为空")
    @Column(name = "first_menu_code")
    private String firstMenuCode;

    @NotNull(message = "菜单名称不能为空")
    @Column(name = "first_menu_name")
    private String firstMenuName;

    @NotNull(message = "布局不能为空")
    @Column(name = "first_menu_layout")
    private String firstMenuLayout;

    @NotNull(message = "图标不能为空")
    @Column(name = "first_menu_icon")
    private String firstMenuIcon;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}