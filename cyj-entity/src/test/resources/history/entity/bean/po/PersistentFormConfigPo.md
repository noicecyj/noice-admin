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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-24 00:35:17 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigCode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDataSource(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDataSource, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDirection(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDirection, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigMode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigMode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigName, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
## 2024-10-11 18:47:44 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getAuthorityId);
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigCode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDataSource(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDataSource, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDirection(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDirection, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigMode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigMode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigName, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:49 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getAuthorityId);
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigCode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDataSource(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDataSource, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDirection(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDirection, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigMode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigMode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigName, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:01:16 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getAuthorityId);
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigCode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDataSource(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDataSource, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDirection(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDirection, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigMode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigMode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigName, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:42 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getAuthorityId);
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigCode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDataSource(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDataSource, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDirection(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDirection, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigMode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigMode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigName, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getAuthorityId);
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigCode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDataSource(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDataSource, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDirection(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDirection, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigMode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigMode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigName, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-12-22 22:04:52 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getAuthorityId);
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigCode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDataSource(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDataSource, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDirection(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDirection, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigMode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigMode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigName, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo eqAuto() {
        return this.eqAuthorityId().eqPersistentFormConfigCode().eqPersistentFormConfigColSpan().eqPersistentFormConfigDataSource().eqPersistentFormConfigDefaultValue().eqPersistentFormConfigDirection().eqPersistentFormConfigEdit().eqPersistentFormConfigMode().eqPersistentFormConfigName().eqPersistentFormConfigRequired().eqPersistentFormId();
    }

    public PersistentFormConfigPo likeAuto() {
        return this.eqAuthorityId().likePersistentFormConfigCode().likePersistentFormConfigDataSource().likePersistentFormConfigDefaultValue().likePersistentFormConfigDirection().likePersistentFormConfigMode().likePersistentFormConfigName().eqPersistentFormId();
    }

    public PersistentFormConfigPo baseQueryWrapper() {
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
@TableName("t_persistent_form_config")
@SuppressWarnings("unused")
public class PersistentFormConfigPo extends BasePoBean<PersistentFormConfigPo> {

    public static final String PO = "PersistentFormConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_form_config_code")
    private String persistentFormConfigCode;

    @TableField("persistent_form_config_col_span")
    private int persistentFormConfigColSpan;

    @TableField("persistent_form_config_data_source")
    private String persistentFormConfigDataSource;

    @TableField("persistent_form_config_default_value")
    private String persistentFormConfigDefaultValue;

    @TableField("persistent_form_config_direction")
    private String persistentFormConfigDirection;

    @TableField("persistent_form_config_edit")
    private boolean persistentFormConfigEdit;

    @TableField("persistent_form_config_mode")
    private String persistentFormConfigMode;

    @TableField("persistent_form_config_name")
    private String persistentFormConfigName;

    @TableField("persistent_form_config_required")
    private boolean persistentFormConfigRequired;

    @TableField("persistent_form_id")
    private String persistentFormId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getAuthorityId);
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentFormConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentFormConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentFormConfigPo orderByAuthorityId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getAuthorityId);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigCode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigCode(String value) {
        this.setPersistentFormConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigCode()), PersistentFormConfigPo::getPersistentFormConfigCode, getPersistentFormConfigCode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigCode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigColSpan);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigColSpan(int value) {
        this.setPersistentFormConfigColSpan(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::getPersistentFormConfigColSpan, getPersistentFormConfigColSpan());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDataSource(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDataSource, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDataSource(String value) {
        this.setPersistentFormConfigDataSource(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDataSource()), PersistentFormConfigPo::getPersistentFormConfigDataSource, getPersistentFormConfigDataSource());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDataSource);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDefaultValue(String value) {
        this.setPersistentFormConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDefaultValue()), PersistentFormConfigPo::getPersistentFormConfigDefaultValue, getPersistentFormConfigDefaultValue());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDefaultValue);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigDirection() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigDirection(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigDirection, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigDirection(String value) {
        this.setPersistentFormConfigDirection(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigDirection()), PersistentFormConfigPo::getPersistentFormConfigDirection, getPersistentFormConfigDirection());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirection(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigDirectionDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigDirection);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigEdit() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigEdit);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigEdit(boolean value) {
        this.setPersistentFormConfigEdit(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigEdit, isPersistentFormConfigEdit());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigMode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigMode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigMode, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigMode(String value) {
        this.setPersistentFormConfigMode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigMode()), PersistentFormConfigPo::getPersistentFormConfigMode, getPersistentFormConfigMode());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigMode);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigName() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormConfigName, valueList);
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo likePersistentFormConfigName(String value) {
        this.setPersistentFormConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormConfigName()), PersistentFormConfigPo::getPersistentFormConfigName, getPersistentFormConfigName());
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormConfigPo::getPersistentFormConfigName);
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormConfigRequired() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::isPersistentFormConfigRequired);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired() {
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormConfigRequired(boolean value) {
        this.setPersistentFormConfigRequired(value);
        this.queryWrapper.lambda().eq(PersistentFormConfigPo::isPersistentFormConfigRequired, isPersistentFormConfigRequired());
        return this;
    }

    public PersistentFormConfigPo selectPersistentFormId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo eqPersistentFormId(String value) {
        this.setPersistentFormId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormId()), PersistentFormConfigPo::getPersistentFormId, getPersistentFormId());
        return this;
    }

    public PersistentFormConfigPo inPersistentFormId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getPersistentFormId, valueList);
        return this;
    }

    public PersistentFormConfigPo orderByPersistentFormId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getPersistentFormId);
        return this;
    }

    public PersistentFormConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getId);
        return this;
    }

    public PersistentFormConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormConfigPo::getId, getId());
        return this;
    }

    public PersistentFormConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormConfigPo::getId, valueList);
        return this;
    }

    public PersistentFormConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedBy);
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getStatus);
        return this;
    }

    public PersistentFormConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getSortCode);
        return this;
    }

    public PersistentFormConfigPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getCreatedDate);
        return this;
    }

    public PersistentFormConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentFormConfigPo eqAuto() {
        return this.eqAuthorityId().eqPersistentFormConfigCode().eqPersistentFormConfigColSpan().eqPersistentFormConfigDataSource().eqPersistentFormConfigDefaultValue().eqPersistentFormConfigDirection().eqPersistentFormConfigEdit().eqPersistentFormConfigMode().eqPersistentFormConfigName().eqPersistentFormConfigRequired().eqPersistentFormId();
    }

    public PersistentFormConfigPo likeAuto() {
        return this.eqAuthorityId().likePersistentFormConfigCode().likePersistentFormConfigDataSource().likePersistentFormConfigDefaultValue().likePersistentFormConfigDirection().likePersistentFormConfigMode().likePersistentFormConfigName().eqPersistentFormId();
    }

    public PersistentFormConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

