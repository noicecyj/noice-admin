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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<noice.entity.po.bean.CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), noice.entity.po.bean.CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getId);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.CatalogDictionaryPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public CatalogDictionaryPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogDictionaryPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getId);
        return this;
    }

    public CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::isStatus);
        return this;
    }

    public CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public CatalogDictionaryPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogDictionaryPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryCode, valueList);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryName, valueList);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getId);
        return this;
    }

    public CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::isStatus);
        return this;
    }

    public CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public CatalogDictionaryPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogDictionaryPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryCode, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryName, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo inCatalogId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getId);
        return this;
    }

    public CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::isStatus);
        return this;
    }

    public CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-22 22:00:52 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public CatalogDictionaryPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogDictionaryPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryCode, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryName, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo inCatalogId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getId);
        return this;
    }

    public CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::isStatus);
        return this;
    }

    public CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(CatalogDictionaryPo::isStatus, isStatus());
        return this;
    }

    public CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
## 2024-10-11 18:47:40 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public CatalogDictionaryPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogDictionaryPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryCode, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryName, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo inCatalogId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getId);
        return this;
    }

    public CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getStatus);
        return this;
    }

    public CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(CatalogDictionaryPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:44 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public CatalogDictionaryPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogDictionaryPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryCode, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryName, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo inCatalogId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getId);
        return this;
    }

    public CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getStatus);
        return this;
    }

    public CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), CatalogDictionaryPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public CatalogDictionaryPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogDictionaryPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryCode, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryName, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo inCatalogId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getId);
        return this;
    }

    public CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getStatus);
        return this;
    }

    public CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogDictionaryPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:38 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public CatalogDictionaryPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogDictionaryPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryCode, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryName, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo inCatalogId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getId);
        return this;
    }

    public CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getStatus);
        return this;
    }

    public CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogDictionaryPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogDictionaryPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogDictionaryPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo baseQueryWrapper() {
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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public CatalogDictionaryPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogDictionaryPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryCode, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryName, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo inCatalogId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getId);
        return this;
    }

    public CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getStatus);
        return this;
    }

    public CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogDictionaryPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogDictionaryPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogDictionaryPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-12-22 22:04:50 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public CatalogDictionaryPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogDictionaryPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryCode, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryName, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo inCatalogId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getId);
        return this;
    }

    public CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getStatus);
        return this;
    }

    public CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogDictionaryPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogDictionaryPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogDictionaryPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo eqAuto() {
        return this.eqCatalogDictionaryCode().eqCatalogDictionaryName().eqCatalogId();
    }

    public CatalogDictionaryPo likeAuto() {
        return this.likeCatalogDictionaryCode().likeCatalogDictionaryName().eqCatalogId();
    }

    public CatalogDictionaryPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-12-23 00:33:08 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_catalog_dictionary")
@SuppressWarnings("unused")
public class CatalogDictionaryPo extends BasePoBean<CatalogDictionaryPo> {

    public static final String PO = "CatalogDictionary";

    @TableField("catalog_dictionary_code")
    private String catalogDictionaryCode;

    @TableField("catalog_dictionary_name")
    private String catalogDictionaryName;

    @TableField("catalog_id")
    private String catalogId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogDictionaryPo> queryWrapper = new QueryWrapper<>();

    public CatalogDictionaryPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogDictionaryPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryCode, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryCode(String value) {
        this.setCatalogDictionaryCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryCode()), CatalogDictionaryPo::getCatalogDictionaryCode, getCatalogDictionaryCode());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryCode);
        return this;
    }

    public CatalogDictionaryPo selectCatalogDictionaryName() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo eqCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo inCatalogDictionaryName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogDictionaryName, valueList);
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo likeCatalogDictionaryName(String value) {
        this.setCatalogDictionaryName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogDictionaryName()), CatalogDictionaryPo::getCatalogDictionaryName, getCatalogDictionaryName());
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogDictionaryNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogDictionaryPo::getCatalogDictionaryName);
        return this;
    }

    public CatalogDictionaryPo selectCatalogId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo eqCatalogId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo eqCatalogId(String value) {
        this.setCatalogId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogId()), CatalogDictionaryPo::getCatalogId, getCatalogId());
        return this;
    }

    public CatalogDictionaryPo inCatalogId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getCatalogId, valueList);
        return this;
    }

    public CatalogDictionaryPo orderByCatalogId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCatalogId);
        return this;
    }

    public CatalogDictionaryPo selectId() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getId);
        return this;
    }

    public CatalogDictionaryPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogDictionaryPo::getId, getId());
        return this;
    }

    public CatalogDictionaryPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogDictionaryPo::getId, valueList);
        return this;
    }

    public CatalogDictionaryPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedBy);
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogDictionaryPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogDictionaryPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedBy);
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogDictionaryPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogDictionaryPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getStatus);
        return this;
    }

    public CatalogDictionaryPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogDictionaryPo::getStatus, getStatus());
        return this;
    }

    public CatalogDictionaryPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getSortCode);
        return this;
    }

    public CatalogDictionaryPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogDictionaryPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogDictionaryPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogDictionaryPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogDictionaryPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getCreatedDate);
        return this;
    }

    public CatalogDictionaryPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogDictionaryPo::getUpdatedDate);
        return this;
    }

    public CatalogDictionaryPo eqAuto() {
        return this.eqCatalogDictionaryCode().eqCatalogDictionaryName().eqCatalogId();
    }

    public CatalogDictionaryPo likeAuto() {
        return this.likeCatalogDictionaryCode().likeCatalogDictionaryName().eqCatalogId();
    }

    public CatalogDictionaryPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

