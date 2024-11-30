## 2024-02-08 11:20:55 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-29 23:35:19 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-29 23:36:35 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-29 23:42:50 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-10 15:38:28 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<noice.entity.po.bean.CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), noice.entity.po.bean.CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), noice.entity.po.bean.CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogPo::getCatalogName);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogPo> queryWrapper = new QueryWrapper<>();

    public CatalogPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo selectId() {
        this.queryWrapper.lambda().select(CatalogPo::getId);
        return this;
    }

    public CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedBy);
        return this;
    }

    public CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedBy);
        return this;
    }

    public CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogPo::isStatus);
        return this;
    }

    public CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(CatalogPo::isStatus, isStatus());
        return this;
    }

    public CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-19 09:32:05 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogPo> queryWrapper = new QueryWrapper<>();

    public CatalogPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo inCatalogCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogCode, valueList);
        return this;
    }

    public CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo inCatalogName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogName, valueList);
        return this;
    }

    public CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo selectId() {
        this.queryWrapper.lambda().select(CatalogPo::getId);
        return this;
    }

    public CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedBy);
        return this;
    }

    public CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedBy);
        return this;
    }

    public CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogPo::isStatus);
        return this;
    }

    public CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(CatalogPo::isStatus, isStatus());
        return this;
    }

    public CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo baseQueryWrapper() {
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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogPo> queryWrapper = new QueryWrapper<>();

    public CatalogPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo inCatalogCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogCode, valueList);
        return this;
    }

    public CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo inCatalogName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogName, valueList);
        return this;
    }

    public CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo selectId() {
        this.queryWrapper.lambda().select(CatalogPo::getId);
        return this;
    }

    public CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedBy);
        return this;
    }

    public CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedBy);
        return this;
    }

    public CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogPo::isStatus);
        return this;
    }

    public CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(CatalogPo::isStatus, isStatus());
        return this;
    }

    public CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-22 22:00:50 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogPo> queryWrapper = new QueryWrapper<>();

    public CatalogPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo inCatalogCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogCode, valueList);
        return this;
    }

    public CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo inCatalogName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogName, valueList);
        return this;
    }

    public CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo selectId() {
        this.queryWrapper.lambda().select(CatalogPo::getId);
        return this;
    }

    public CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getId, valueList);
        return this;
    }

    public CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedBy);
        return this;
    }

    public CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedBy);
        return this;
    }

    public CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogPo::isStatus);
        return this;
    }

    public CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(CatalogPo::isStatus, isStatus());
        return this;
    }

    public CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
## 2024-10-11 18:47:39 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogPo> queryWrapper = new QueryWrapper<>();

    public CatalogPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo inCatalogCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogCode, valueList);
        return this;
    }

    public CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo inCatalogName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogName, valueList);
        return this;
    }

    public CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo selectId() {
        this.queryWrapper.lambda().select(CatalogPo::getId);
        return this;
    }

    public CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getId, valueList);
        return this;
    }

    public CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedBy);
        return this;
    }

    public CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedBy);
        return this;
    }

    public CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogPo::getStatus);
        return this;
    }

    public CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(CatalogPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:43 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogPo> queryWrapper = new QueryWrapper<>();

    public CatalogPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo inCatalogCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogCode, valueList);
        return this;
    }

    public CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo inCatalogName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogName, valueList);
        return this;
    }

    public CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo selectId() {
        this.queryWrapper.lambda().select(CatalogPo::getId);
        return this;
    }

    public CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getId, valueList);
        return this;
    }

    public CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedBy);
        return this;
    }

    public CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedBy);
        return this;
    }

    public CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogPo::getStatus);
        return this;
    }

    public CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), CatalogPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:01:11 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogPo> queryWrapper = new QueryWrapper<>();

    public CatalogPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo inCatalogCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogCode, valueList);
        return this;
    }

    public CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo inCatalogName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogName, valueList);
        return this;
    }

    public CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo selectId() {
        this.queryWrapper.lambda().select(CatalogPo::getId);
        return this;
    }

    public CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getId, valueList);
        return this;
    }

    public CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedBy);
        return this;
    }

    public CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedBy);
        return this;
    }

    public CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogPo::getStatus);
        return this;
    }

    public CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:37 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogPo> queryWrapper = new QueryWrapper<>();

    public CatalogPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo inCatalogCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogCode, valueList);
        return this;
    }

    public CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo inCatalogName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogName, valueList);
        return this;
    }

    public CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo selectId() {
        this.queryWrapper.lambda().select(CatalogPo::getId);
        return this;
    }

    public CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getId, valueList);
        return this;
    }

    public CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedBy);
        return this;
    }

    public CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedBy);
        return this;
    }

    public CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogPo::getStatus);
        return this;
    }

    public CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo baseQueryWrapper() {
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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogPo> queryWrapper = new QueryWrapper<>();

    public CatalogPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo inCatalogCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogCode, valueList);
        return this;
    }

    public CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo inCatalogName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogName, valueList);
        return this;
    }

    public CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo selectId() {
        this.queryWrapper.lambda().select(CatalogPo::getId);
        return this;
    }

    public CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getId, valueList);
        return this;
    }

    public CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedBy);
        return this;
    }

    public CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedBy);
        return this;
    }

    public CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogPo::getStatus);
        return this;
    }

    public CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

