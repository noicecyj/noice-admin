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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private String persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyNull() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNull(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private String persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyNull() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNull(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-14 21:12:46 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private String persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyNull() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNull(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private String persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyNull() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNull(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private String persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull(String value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyNull() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyNull(String value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNull(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private String persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull(String value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyNull() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyNull(String value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyNull()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull, getPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNull(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNullDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-29 23:02:25 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-10 15:35:02 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<noice.entity.po.bean.PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRelationPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRelationPersistentId()), noice.entity.po.bean.PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getId);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.PersistentPropertyPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-18 16:37:32 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo baseQueryWrapper() {
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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyCode, valueList);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyName, valueList);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyType, valueList);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-19 09:39:30 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyCode, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyName, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyType, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo inRelationPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getRelationPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-22 22:00:58 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyCode, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyName, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyType, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo inRelationPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getRelationPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getId, valueList);
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-23 09:38:15 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyCode, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyName, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyType, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo inRelationPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getRelationPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getId, valueList);
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public PersistentPropertyPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isStatus, isStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
## 2024-10-11 18:47:45 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_default_value")
    private String persistentPropertyDefaultValue;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyCode, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyDefaultValue, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyName, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyType, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo inRelationPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getRelationPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getId, valueList);
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:50 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_default_value")
    private String persistentPropertyDefaultValue;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyCode, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyDefaultValue, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyName, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyType, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo inRelationPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getRelationPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getId, valueList);
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:01:17 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_default_value")
    private String persistentPropertyDefaultValue;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyCode, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyDefaultValue, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyName, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyType, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo inRelationPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getRelationPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getId, valueList);
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:43 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_default_value")
    private String persistentPropertyDefaultValue;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyCode, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyDefaultValue, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyName, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyType, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo inRelationPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getRelationPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getId, valueList);
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo baseQueryWrapper() {
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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_default_value")
    private String persistentPropertyDefaultValue;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyCode, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyDefaultValue, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyName, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyType, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo inRelationPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getRelationPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getId, valueList);
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-12-22 22:04:53 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_default_value")
    private String persistentPropertyDefaultValue;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyCode, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyDefaultValue, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyName, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyType, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo inRelationPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getRelationPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getId, valueList);
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo eqAuto() {
        return this.eqPersistentId().eqPersistentPropertyCode().eqPersistentPropertyDefaultValue().eqPersistentPropertyLength().eqPersistentPropertyName().eqPersistentPropertyNull().eqPersistentPropertyType().eqRelationPersistentId();
    }

    public PersistentPropertyPo likeAuto() {
        return this.eqPersistentId().likePersistentPropertyCode().likePersistentPropertyDefaultValue().likePersistentPropertyName().likePersistentPropertyType().eqRelationPersistentId();
    }

    public PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-12-23 00:33:10 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_property")
@SuppressWarnings("unused")
public class PersistentPropertyPo extends BasePoBean<PersistentPropertyPo> {

    public static final String PO = "PersistentProperty";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_property_code")
    private String persistentPropertyCode;

    @TableField("persistent_property_default_value")
    private String persistentPropertyDefaultValue;

    @TableField("persistent_property_length")
    private int persistentPropertyLength;

    @TableField("persistent_property_name")
    private String persistentPropertyName;

    @TableField("persistent_property_null")
    private boolean persistentPropertyNull;

    @TableField("persistent_property_type")
    private String persistentPropertyType;

    @TableField("relation_persistent_id")
    private String relationPersistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPropertyPo> queryWrapper = new QueryWrapper<>();

    public PersistentPropertyPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPropertyPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPropertyPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPropertyPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPropertyPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo orderByPersistentId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentId);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyCode, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyCode(String value) {
        this.setPersistentPropertyCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyCode()), PersistentPropertyPo::getPersistentPropertyCode, getPersistentPropertyCode());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyCode);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyDefaultValue, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyDefaultValue(String value) {
        this.setPersistentPropertyDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyDefaultValue()), PersistentPropertyPo::getPersistentPropertyDefaultValue, getPersistentPropertyDefaultValue());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyDefaultValue);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyLength() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyLength);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyLength(int value) {
        this.setPersistentPropertyLength(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::getPersistentPropertyLength, getPersistentPropertyLength());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyName() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyName, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyName(String value) {
        this.setPersistentPropertyName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyName()), PersistentPropertyPo::getPersistentPropertyName, getPersistentPropertyName());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyName);
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyNull() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::isPersistentPropertyNull);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull() {
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyNull(boolean value) {
        this.setPersistentPropertyNull(value);
        this.queryWrapper.lambda().eq(PersistentPropertyPo::isPersistentPropertyNull, isPersistentPropertyNull());
        return this;
    }

    public PersistentPropertyPo selectPersistentPropertyType() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo eqPersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo inPersistentPropertyType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getPersistentPropertyType, valueList);
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo likePersistentPropertyType(String value) {
        this.setPersistentPropertyType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentPropertyType()), PersistentPropertyPo::getPersistentPropertyType, getPersistentPropertyType());
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo orderByPersistentPropertyTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPropertyPo::getPersistentPropertyType);
        return this;
    }

    public PersistentPropertyPo selectRelationPersistentId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo eqRelationPersistentId(String value) {
        this.setRelationPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRelationPersistentId()), PersistentPropertyPo::getRelationPersistentId, getRelationPersistentId());
        return this;
    }

    public PersistentPropertyPo inRelationPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getRelationPersistentId, valueList);
        return this;
    }

    public PersistentPropertyPo orderByRelationPersistentId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getRelationPersistentId);
        return this;
    }

    public PersistentPropertyPo selectId() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getId);
        return this;
    }

    public PersistentPropertyPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPropertyPo::getId, getId());
        return this;
    }

    public PersistentPropertyPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPropertyPo::getId, valueList);
        return this;
    }

    public PersistentPropertyPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedBy);
        return this;
    }

    public PersistentPropertyPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPropertyPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPropertyPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedBy);
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPropertyPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPropertyPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getStatus);
        return this;
    }

    public PersistentPropertyPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPropertyPo::getStatus, getStatus());
        return this;
    }

    public PersistentPropertyPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getSortCode);
        return this;
    }

    public PersistentPropertyPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentPropertyPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPropertyPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getCreatedDate);
        return this;
    }

    public PersistentPropertyPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPropertyPo::getUpdatedDate);
        return this;
    }

    public PersistentPropertyPo eqAuto() {
        return this.eqPersistentId().eqPersistentPropertyCode().eqPersistentPropertyDefaultValue().eqPersistentPropertyLength().eqPersistentPropertyName().eqPersistentPropertyNull().eqPersistentPropertyType().eqRelationPersistentId();
    }

    public PersistentPropertyPo likeAuto() {
        return this.eqPersistentId().likePersistentPropertyCode().likePersistentPropertyDefaultValue().likePersistentPropertyName().likePersistentPropertyType().eqRelationPersistentId();
    }

    public PersistentPropertyPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

