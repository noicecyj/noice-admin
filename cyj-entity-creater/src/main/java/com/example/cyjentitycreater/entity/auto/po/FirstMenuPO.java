package com.example.cyjentitycreater.entity.auto.po;

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
@Table(name = FirstMenuPO.T_FIRST_MENU)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
public class FirstMenuPO implements Serializable {

    static final String T_FIRST_MENU = "t_first_menu";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;
    @Column(name = "path")
    private String path;
    @Column(name = "menu_code")
    private String menuCode;
    @Column(name = "menu_name")
    private String menuName;
    @Column(name = "layout")
    private String layout;
    @Column(name = "icon")
    private String icon;
    @Column(name = "status")
    private String status;
    @Column(name = "sort_code")
    private String sortCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FirstMenuPO that = (FirstMenuPO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }

}