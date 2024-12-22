## 2024-02-08 11:20:56 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_parent_url")
    private String menuParentUrl;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuParentUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo orderByMenuParentUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_parent_url")
    private String menuParentUrl;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuParentUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo orderByMenuParentUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-14 21:12:45 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_parent_url")
    private String menuParentUrl;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuParentUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo orderByMenuParentUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-14 21:19:34 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_parent_url")
    private String menuParentUrl;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuParentUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo orderByMenuParentUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-18 16:47:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_parent_url")
    private String menuParentUrl;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo eqMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuParentUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo eqMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo orderByMenuParentUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-28 16:18:05 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_parent_url")
    private String menuParentUrl;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuComponent() {
        this.queryWrapper.lambda().select(MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo eqMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuParentUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo eqMenuParentUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo eqMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo orderByMenuParentUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::isStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-29 23:02:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_parent_url")
    private String menuParentUrl;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuComponent() {
        this.queryWrapper.lambda().select(MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo eqMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuParentUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo eqMenuParentUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo eqMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo orderByMenuParentUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::isStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-29 23:35:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_parent_url")
    private String menuParentUrl;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuComponent() {
        this.queryWrapper.lambda().select(MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo eqMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuParentUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo eqMenuParentUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo eqMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo orderByMenuParentUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::isStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-29 23:36:36 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_parent_url")
    private String menuParentUrl;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuComponent() {
        this.queryWrapper.lambda().select(MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo eqMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuParentUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo eqMenuParentUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo eqMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo orderByMenuParentUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::isStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-29 23:42:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_parent_url")
    private String menuParentUrl;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuComponent() {
        this.queryWrapper.lambda().select(MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo eqMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuParentUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo eqMenuParentUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo eqMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo orderByMenuParentUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::isStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-05 15:55:34 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_parent_url")
    private String menuParentUrl;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuComponent() {
        this.queryWrapper.lambda().select(MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo eqMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuParentUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo eqMenuParentUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo eqMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo likeMenuParentUrl(String value) {
        this.setMenuParentUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuParentUrl()), MenuPo::getMenuParentUrl, getMenuParentUrl());
        return this;
    }

    public MenuPo orderByMenuParentUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo orderByMenuParentUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuParentUrl);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::isStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-17 22:14:58 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-18 16:37:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuComponent() {
        this.queryWrapper.lambda().select(MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo eqMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::isStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-19 09:32:06 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo inMenuCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuCode, valueList);
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuComponent() {
        this.queryWrapper.lambda().select(MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo eqMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo inMenuComponent(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuComponent, valueList);
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo inMenuIcon(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuIcon, valueList);
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo inMenuName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuName, valueList);
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo inMenuUrl(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuUrl, valueList);
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::isStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-19 09:39:29 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getAuthorityId, valueList);
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo inMenuCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuCode, valueList);
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuComponent() {
        this.queryWrapper.lambda().select(MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo eqMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo inMenuComponent(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuComponent, valueList);
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo inMenuIcon(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuIcon, valueList);
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo inMenuId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuId, valueList);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo inMenuName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuName, valueList);
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo inMenuUrl(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuUrl, valueList);
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::isStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-22 11:33:05 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_component")
    private String menuComponent;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getAuthorityId, valueList);
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo inMenuCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuCode, valueList);
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuComponent() {
        this.queryWrapper.lambda().select(MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo eqMenuComponent() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo eqMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo inMenuComponent(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuComponent, valueList);
        return this;
    }

    public MenuPo likeMenuComponent() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo likeMenuComponent(String value) {
        this.setMenuComponent(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuComponent()), MenuPo::getMenuComponent, getMenuComponent());
        return this;
    }

    public MenuPo orderByMenuComponent(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo orderByMenuComponentDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuComponent);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo inMenuIcon(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuIcon, valueList);
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo inMenuId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuId, valueList);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo inMenuName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuName, valueList);
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo inMenuUrl(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuUrl, valueList);
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getId, valueList);
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::isStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-22 22:00:55 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getAuthorityId, valueList);
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo inMenuCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuCode, valueList);
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo inMenuIcon(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuIcon, valueList);
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo inMenuId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuId, valueList);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo inMenuName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuName, valueList);
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo inMenuUrl(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuUrl, valueList);
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getId, valueList);
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::isStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::isStatus, isStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
## 2024-10-11 18:47:42 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getAuthorityId, valueList);
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo inMenuCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuCode, valueList);
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo inMenuIcon(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuIcon, valueList);
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo inMenuId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuId, valueList);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo inMenuName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuName, valueList);
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo inMenuUrl(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuUrl, valueList);
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getId, valueList);
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::getStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(MenuPo::getSortCode, getSortCode());
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:46 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getAuthorityId, valueList);
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo inMenuCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuCode, valueList);
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo inMenuIcon(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuIcon, valueList);
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo inMenuId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuId, valueList);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo inMenuName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuName, valueList);
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo inMenuUrl(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuUrl, valueList);
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getId, valueList);
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::getStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), MenuPo::getSortCode, getSortCode());
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:01:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getAuthorityId, valueList);
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo inMenuCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuCode, valueList);
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo inMenuIcon(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuIcon, valueList);
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo inMenuId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuId, valueList);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo inMenuName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuName, valueList);
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo inMenuUrl(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuUrl, valueList);
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getId, valueList);
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::getStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), MenuPo::getSortCode, getSortCode());
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:40 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getAuthorityId, valueList);
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo inMenuCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuCode, valueList);
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo inMenuIcon(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuIcon, valueList);
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo inMenuId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuId, valueList);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo inMenuName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuName, valueList);
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo inMenuUrl(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuUrl, valueList);
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getId, valueList);
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::getStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), MenuPo::getSortCode, getSortCode());
        return this;
    }

    public MenuPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), MenuPo::getSortCode, getSortCode());
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-11-10 12:55:27 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getAuthorityId, valueList);
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo inMenuCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuCode, valueList);
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo inMenuIcon(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuIcon, valueList);
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo inMenuId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuId, valueList);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo inMenuName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuName, valueList);
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo inMenuUrl(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuUrl, valueList);
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getId, valueList);
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::getStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), MenuPo::getSortCode, getSortCode());
        return this;
    }

    public MenuPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), MenuPo::getSortCode, getSortCode());
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-12-22 22:04:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getAuthorityId, valueList);
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo inMenuCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuCode, valueList);
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo inMenuIcon(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuIcon, valueList);
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo inMenuId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuId, valueList);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo inMenuName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuName, valueList);
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo inMenuUrl(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuUrl, valueList);
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getId, valueList);
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::getStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), MenuPo::getSortCode, getSortCode());
        return this;
    }

    public MenuPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), MenuPo::getSortCode, getSortCode());
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo eqAuto() {
        return this.eqAuthorityId().eqMenuCode().eqMenuIcon().eqMenuId().eqMenuName().eqMenuUrl();
    }

    public MenuPo likeAuto() {
        return this.eqAuthorityId().likeMenuCode().likeMenuIcon().eqMenuId().likeMenuName().likeMenuUrl();
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

