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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-28 16:18:06 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-24 00:55:50 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentTableConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigCode, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigMethod(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigMethod, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigName, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigType, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
## 2024-10-11 18:47:46 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentTableConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentTableConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getAuthorityId);
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigCode, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigMethod(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigMethod, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigName, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigType, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:51 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentTableConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentTableConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getAuthorityId);
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigCode, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigMethod(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigMethod, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigName, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigType, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:01:19 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentTableConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentTableConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getAuthorityId);
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigCode, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigMethod(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigMethod, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigName, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigType, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:45 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentTableConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentTableConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getAuthorityId);
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigCode, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigMethod(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigMethod, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigName, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigType, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-11-10 12:55:28 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentTableConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentTableConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getAuthorityId);
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigCode, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigMethod(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigMethod, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigName, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigType, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentTableConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentTableConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getAuthorityId);
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigCode, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigMethod(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigMethod, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigName, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigType, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo eqAuto() {
        return this.eqAuthorityId().eqPersistentTableConfigCode().eqPersistentTableConfigDisplay().eqPersistentTableConfigMethod().eqPersistentTableConfigName().eqPersistentTableConfigType().eqPersistentTableId();
    }

    public PersistentTableConfigPo likeAuto() {
        return this.eqAuthorityId().likePersistentTableConfigCode().likePersistentTableConfigMethod().likePersistentTableConfigName().likePersistentTableConfigType().eqPersistentTableId();
    }

    public PersistentTableConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-12-23 00:33:11 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_table_config")
@SuppressWarnings("unused")
public class PersistentTableConfigPo extends BasePoBean<PersistentTableConfigPo> {

    public static final String PO = "PersistentTableConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_table_config_code")
    private String persistentTableConfigCode;

    @TableField("persistent_table_config_display")
    private boolean persistentTableConfigDisplay;

    @TableField("persistent_table_config_method")
    private String persistentTableConfigMethod;

    @TableField("persistent_table_config_name")
    private String persistentTableConfigName;

    @TableField("persistent_table_config_type")
    private String persistentTableConfigType;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentTableConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentTableConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getAuthorityId);
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentTableConfigPo orderByAuthorityId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getAuthorityId);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigCode, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigCode(String value) {
        this.setPersistentTableConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigCode()), PersistentTableConfigPo::getPersistentTableConfigCode, getPersistentTableConfigCode());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigCode);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::isPersistentTableConfigDisplay);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigDisplay(boolean value) {
        this.setPersistentTableConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableConfigPo::isPersistentTableConfigDisplay, isPersistentTableConfigDisplay());
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigMethod() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigMethod(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigMethod, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigMethod(String value) {
        this.setPersistentTableConfigMethod(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigMethod()), PersistentTableConfigPo::getPersistentTableConfigMethod, getPersistentTableConfigMethod());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigMethod);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigName() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigName, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigName(String value) {
        this.setPersistentTableConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigName()), PersistentTableConfigPo::getPersistentTableConfigName, getPersistentTableConfigName());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigName);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableConfigType() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableConfigType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableConfigType, valueList);
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo likePersistentTableConfigType(String value) {
        this.setPersistentTableConfigType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableConfigType()), PersistentTableConfigPo::getPersistentTableConfigType, getPersistentTableConfigType());
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableConfigTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableConfigPo::getPersistentTableConfigType);
        return this;
    }

    public PersistentTableConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableConfigPo inPersistentTableId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getPersistentTableId, valueList);
        return this;
    }

    public PersistentTableConfigPo orderByPersistentTableId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getId);
        return this;
    }

    public PersistentTableConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableConfigPo::getId, getId());
        return this;
    }

    public PersistentTableConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableConfigPo::getId, valueList);
        return this;
    }

    public PersistentTableConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getStatus);
        return this;
    }

    public PersistentTableConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getSortCode);
        return this;
    }

    public PersistentTableConfigPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTableConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableConfigPo eqAuto() {
        return this.eqAuthorityId().eqPersistentTableConfigCode().eqPersistentTableConfigDisplay().eqPersistentTableConfigMethod().eqPersistentTableConfigName().eqPersistentTableConfigType().eqPersistentTableId();
    }

    public PersistentTableConfigPo likeAuto() {
        return this.eqAuthorityId().likePersistentTableConfigCode().likePersistentTableConfigMethod().likePersistentTableConfigName().likePersistentTableConfigType().eqPersistentTableId();
    }

    public PersistentTableConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

