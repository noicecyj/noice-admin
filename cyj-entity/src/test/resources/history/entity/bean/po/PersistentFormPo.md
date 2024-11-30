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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo selectPersistentFormCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo selectPersistentFormName() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo selectPersistentFormRow() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormRow);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo selectPersistentFormType() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentId);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getId);
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedBy);
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedBy);
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormPo::isStatus);
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo selectPersistentFormCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo selectPersistentFormName() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo selectPersistentFormRow() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormRow);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo selectPersistentFormType() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentId);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getId);
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedBy);
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedBy);
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormPo::isStatus);
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo selectPersistentFormCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo selectPersistentFormName() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo selectPersistentFormRow() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormRow);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo selectPersistentFormType() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentId);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getId);
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedBy);
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedBy);
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormPo::isStatus);
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo selectPersistentFormCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo selectPersistentFormName() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo selectPersistentFormRow() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormRow);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo selectPersistentFormType() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentId);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getId);
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedBy);
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedBy);
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormPo::isStatus);
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo selectPersistentFormCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo selectPersistentFormName() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo selectPersistentFormRow() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormRow);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo selectPersistentFormType() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentId);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getId);
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedBy);
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedBy);
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormPo::isStatus);
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo selectPersistentFormCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo selectPersistentFormName() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo selectPersistentFormRow() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormRow);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo selectPersistentFormType() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentId);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getId);
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedBy);
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedBy);
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormPo::isStatus);
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::isStatus, isStatus());
        return this;
    }

    public PersistentFormPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-24 00:35:17 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-10-11 18:47:43 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormPo selectPersistentFormCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo inPersistentFormCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormCode, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo selectPersistentFormName() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo inPersistentFormName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormName, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo selectPersistentFormRow() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormRow);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo selectPersistentFormType() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo inPersistentFormType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormType, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentId);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentId, valueList);
        return this;
    }

    public PersistentFormPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getId);
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getId, valueList);
        return this;
    }

    public PersistentFormPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedBy);
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedBy);
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormPo::getStatus);
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:48 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormPo selectPersistentFormCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo inPersistentFormCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormCode, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo selectPersistentFormName() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo inPersistentFormName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormName, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo selectPersistentFormRow() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormRow);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo selectPersistentFormType() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo inPersistentFormType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormType, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentId);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentId, valueList);
        return this;
    }

    public PersistentFormPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getId);
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getId, valueList);
        return this;
    }

    public PersistentFormPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedBy);
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedBy);
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormPo::getStatus);
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), PersistentFormPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), PersistentFormPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), PersistentFormPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:01:15 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormPo selectPersistentFormCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo inPersistentFormCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormCode, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo selectPersistentFormName() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo inPersistentFormName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormName, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo selectPersistentFormRow() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormRow);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo selectPersistentFormType() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo inPersistentFormType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormType, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentId);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentId, valueList);
        return this;
    }

    public PersistentFormPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getId);
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getId, valueList);
        return this;
    }

    public PersistentFormPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedBy);
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedBy);
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormPo::getStatus);
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:41 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormPo selectPersistentFormCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo inPersistentFormCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormCode, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo selectPersistentFormName() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo inPersistentFormName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormName, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo selectPersistentFormRow() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormRow);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo selectPersistentFormType() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo inPersistentFormType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormType, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentId);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentId, valueList);
        return this;
    }

    public PersistentFormPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getId);
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getId, valueList);
        return this;
    }

    public PersistentFormPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedBy);
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedBy);
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormPo::getStatus);
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
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
@TableName("t_persistent_form")
@SuppressWarnings("unused")
public class PersistentFormPo extends BasePoBean<PersistentFormPo> {

    public static final String PO = "PersistentForm";

    @TableField("persistent_form_code")
    private String persistentFormCode;

    @TableField("persistent_form_name")
    private String persistentFormName;

    @TableField("persistent_form_row")
    private int persistentFormRow;

    @TableField("persistent_form_type")
    private String persistentFormType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentFormPo> queryWrapper = new QueryWrapper<>();

    public PersistentFormPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentFormPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentFormPo selectPersistentFormCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo eqPersistentFormCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo eqPersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo inPersistentFormCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormCode, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo likePersistentFormCode(String value) {
        this.setPersistentFormCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormCode()), PersistentFormPo::getPersistentFormCode, getPersistentFormCode());
        return this;
    }

    public PersistentFormPo orderByPersistentFormCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo orderByPersistentFormCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormCode);
        return this;
    }

    public PersistentFormPo selectPersistentFormName() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo eqPersistentFormName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo eqPersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo inPersistentFormName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormName, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo likePersistentFormName(String value) {
        this.setPersistentFormName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormName()), PersistentFormPo::getPersistentFormName, getPersistentFormName());
        return this;
    }

    public PersistentFormPo orderByPersistentFormName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo orderByPersistentFormNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormName);
        return this;
    }

    public PersistentFormPo selectPersistentFormRow() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormRow);
        return this;
    }

    public PersistentFormPo eqPersistentFormRow() {
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo eqPersistentFormRow(int value) {
        this.setPersistentFormRow(value);
        this.queryWrapper.lambda().eq(PersistentFormPo::getPersistentFormRow, getPersistentFormRow());
        return this;
    }

    public PersistentFormPo selectPersistentFormType() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo eqPersistentFormType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo eqPersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo inPersistentFormType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentFormType, valueList);
        return this;
    }

    public PersistentFormPo likePersistentFormType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo likePersistentFormType(String value) {
        this.setPersistentFormType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentFormType()), PersistentFormPo::getPersistentFormType, getPersistentFormType());
        return this;
    }

    public PersistentFormPo orderByPersistentFormType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo orderByPersistentFormTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentFormPo::getPersistentFormType);
        return this;
    }

    public PersistentFormPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getPersistentId);
        return this;
    }

    public PersistentFormPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentFormPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentFormPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getPersistentId, valueList);
        return this;
    }

    public PersistentFormPo selectId() {
        this.queryWrapper.lambda().select(PersistentFormPo::getId);
        return this;
    }

    public PersistentFormPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentFormPo::getId, getId());
        return this;
    }

    public PersistentFormPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentFormPo::getId, valueList);
        return this;
    }

    public PersistentFormPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedBy);
        return this;
    }

    public PersistentFormPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentFormPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentFormPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedBy);
        return this;
    }

    public PersistentFormPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentFormPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentFormPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentFormPo::getStatus);
        return this;
    }

    public PersistentFormPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentFormPo::getStatus, getStatus());
        return this;
    }

    public PersistentFormPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getSortCode);
        return this;
    }

    public PersistentFormPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentFormPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentFormPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getCreatedDate);
        return this;
    }

    public PersistentFormPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentFormPo::getUpdatedDate);
        return this;
    }

    public PersistentFormPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

