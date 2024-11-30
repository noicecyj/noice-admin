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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-09 10:56:13 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-18 16:47:30 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityMethod() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityPath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityMethod() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityPath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityMethod() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityPath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityMethod() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityPath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityMethod() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityPath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityMethod() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityPath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-10 15:35:01 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<noice.entity.po.bean.AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), noice.entity.po.bean.AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityMethod() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), noice.entity.po.bean.AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityMethod);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), noice.entity.po.bean.AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityName);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityPath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), noice.entity.po.bean.AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityPath);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), noice.entity.po.bean.AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AuthorityPo::getAuthorityType);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectPersistentId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getPersistentId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getPersistentId()), noice.entity.po.bean.AuthorityPo::getPersistentId, getPersistentId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getId);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AuthorityPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AuthorityPo> queryWrapper = new QueryWrapper<>();

    public AuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo selectAuthorityMethod() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo selectAuthorityPath() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo selectId() {
        this.queryWrapper.lambda().select(AuthorityPo::getId);
        return this;
    }

    public AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedBy);
        return this;
    }

    public AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedBy);
        return this;
    }

    public AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(AuthorityPo::isStatus);
        return this;
    }

    public AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(AuthorityPo::isStatus, isStatus());
        return this;
    }

    public AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AuthorityPo> queryWrapper = new QueryWrapper<>();

    public AuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo inAuthorityCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityCode, valueList);
        return this;
    }

    public AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo selectAuthorityMethod() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo inAuthorityMethod(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityMethod, valueList);
        return this;
    }

    public AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo inAuthorityName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityName, valueList);
        return this;
    }

    public AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo selectAuthorityPath() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo inAuthorityPath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityPath, valueList);
        return this;
    }

    public AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo inAuthorityType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityType, valueList);
        return this;
    }

    public AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo selectId() {
        this.queryWrapper.lambda().select(AuthorityPo::getId);
        return this;
    }

    public AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedBy);
        return this;
    }

    public AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedBy);
        return this;
    }

    public AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(AuthorityPo::isStatus);
        return this;
    }

    public AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(AuthorityPo::isStatus, isStatus());
        return this;
    }

    public AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AuthorityPo> queryWrapper = new QueryWrapper<>();

    public AuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo inAuthorityCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityCode, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo selectAuthorityMethod() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo inAuthorityMethod(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityMethod, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo inAuthorityName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityName, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo selectAuthorityPath() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo inAuthorityPath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityPath, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo inAuthorityType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityType, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo selectId() {
        this.queryWrapper.lambda().select(AuthorityPo::getId);
        return this;
    }

    public AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedBy);
        return this;
    }

    public AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedBy);
        return this;
    }

    public AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(AuthorityPo::isStatus);
        return this;
    }

    public AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(AuthorityPo::isStatus, isStatus());
        return this;
    }

    public AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-21 10:02:48 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_method")
    private String authorityMethod;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_path")
    private String authorityPath;

    @TableField("authority_type")
    private String authorityType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AuthorityPo> queryWrapper = new QueryWrapper<>();

    public AuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo inAuthorityCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityCode, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo selectAuthorityMethod() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo eqAuthorityMethod() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo eqAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo inAuthorityMethod(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityMethod, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityMethod() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo likeAuthorityMethod(String value) {
        this.setAuthorityMethod(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityMethod()), AuthorityPo::getAuthorityMethod, getAuthorityMethod());
        return this;
    }

    public AuthorityPo orderByAuthorityMethod(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo orderByAuthorityMethodAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo orderByAuthorityMethodDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityMethod);
        return this;
    }

    public AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo inAuthorityName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityName, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo selectAuthorityPath() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo eqAuthorityPath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo eqAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo inAuthorityPath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityPath, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityPath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo likeAuthorityPath(String value) {
        this.setAuthorityPath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityPath()), AuthorityPo::getAuthorityPath, getAuthorityPath());
        return this;
    }

    public AuthorityPo orderByAuthorityPath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo orderByAuthorityPathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo orderByAuthorityPathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityPath);
        return this;
    }

    public AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo inAuthorityType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityType, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo selectId() {
        this.queryWrapper.lambda().select(AuthorityPo::getId);
        return this;
    }

    public AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getId, valueList);
        return this;
    }

    public AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedBy);
        return this;
    }

    public AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedBy);
        return this;
    }

    public AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(AuthorityPo::isStatus);
        return this;
    }

    public AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(AuthorityPo::isStatus, isStatus());
        return this;
    }

    public AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-22 22:00:49 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_type")
    private String authorityType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AuthorityPo> queryWrapper = new QueryWrapper<>();

    public AuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo inAuthorityCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityCode, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo inAuthorityName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityName, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo inAuthorityType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityType, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo selectId() {
        this.queryWrapper.lambda().select(AuthorityPo::getId);
        return this;
    }

    public AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getId, valueList);
        return this;
    }

    public AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedBy);
        return this;
    }

    public AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedBy);
        return this;
    }

    public AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(AuthorityPo::isStatus);
        return this;
    }

    public AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(AuthorityPo::isStatus, isStatus());
        return this;
    }

    public AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_type")
    private String authorityType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AuthorityPo> queryWrapper = new QueryWrapper<>();

    public AuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo inAuthorityCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityCode, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo inAuthorityName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityName, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo inAuthorityType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityType, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo selectId() {
        this.queryWrapper.lambda().select(AuthorityPo::getId);
        return this;
    }

    public AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getId, valueList);
        return this;
    }

    public AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedBy);
        return this;
    }

    public AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedBy);
        return this;
    }

    public AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(AuthorityPo::getStatus);
        return this;
    }

    public AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(AuthorityPo::getSortCode, getSortCode());
        return this;
    }

    public AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_type")
    private String authorityType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AuthorityPo> queryWrapper = new QueryWrapper<>();

    public AuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo inAuthorityCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityCode, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo inAuthorityName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityName, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo inAuthorityType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityType, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo selectId() {
        this.queryWrapper.lambda().select(AuthorityPo::getId);
        return this;
    }

    public AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getId, valueList);
        return this;
    }

    public AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedBy);
        return this;
    }

    public AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedBy);
        return this;
    }

    public AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(AuthorityPo::getStatus);
        return this;
    }

    public AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), AuthorityPo::getSortCode, getSortCode());
        return this;
    }

    public AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_type")
    private String authorityType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AuthorityPo> queryWrapper = new QueryWrapper<>();

    public AuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo inAuthorityCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityCode, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo inAuthorityName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityName, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo inAuthorityType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityType, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo selectId() {
        this.queryWrapper.lambda().select(AuthorityPo::getId);
        return this;
    }

    public AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getId, valueList);
        return this;
    }

    public AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedBy);
        return this;
    }

    public AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedBy);
        return this;
    }

    public AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(AuthorityPo::getStatus);
        return this;
    }

    public AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AuthorityPo::getSortCode, getSortCode());
        return this;
    }

    public AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_type")
    private String authorityType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AuthorityPo> queryWrapper = new QueryWrapper<>();

    public AuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo inAuthorityCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityCode, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo inAuthorityName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityName, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo inAuthorityType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityType, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo selectId() {
        this.queryWrapper.lambda().select(AuthorityPo::getId);
        return this;
    }

    public AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getId, valueList);
        return this;
    }

    public AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedBy);
        return this;
    }

    public AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedBy);
        return this;
    }

    public AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(AuthorityPo::getStatus);
        return this;
    }

    public AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AuthorityPo::getSortCode, getSortCode());
        return this;
    }

    public AuthorityPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AuthorityPo::getSortCode, getSortCode());
        return this;
    }

    public AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo baseQueryWrapper() {
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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_type")
    private String authorityType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AuthorityPo> queryWrapper = new QueryWrapper<>();

    public AuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo inAuthorityCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityCode, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo inAuthorityName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityName, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo inAuthorityType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityType, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo selectId() {
        this.queryWrapper.lambda().select(AuthorityPo::getId);
        return this;
    }

    public AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getId, valueList);
        return this;
    }

    public AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedBy);
        return this;
    }

    public AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedBy);
        return this;
    }

    public AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(AuthorityPo::getStatus);
        return this;
    }

    public AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AuthorityPo::getSortCode, getSortCode());
        return this;
    }

    public AuthorityPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AuthorityPo::getSortCode, getSortCode());
        return this;
    }

    public AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

