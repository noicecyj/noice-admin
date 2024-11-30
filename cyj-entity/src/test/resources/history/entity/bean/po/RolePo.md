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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-14 21:12:47 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectRoleName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getId);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectRoleName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getId);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectRoleName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getId);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectRoleName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getId);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectRoleName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getId);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-05 15:55:35 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectRoleName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getId);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<noice.entity.po.bean.RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.RolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), noice.entity.po.bean.RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectRoleName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), noice.entity.po.bean.RolePo::getRoleName, getRoleName());
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.RolePo::getRoleName);
        return this;
    }

    public noice.entity.po.bean.RolePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getId);
        return this;
    }

    public noice.entity.po.bean.RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.RolePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.RolePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.RolePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.RolePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.RolePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.RolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RolePo> queryWrapper = new QueryWrapper<>();

    public RolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(RolePo::getRoleCode);
        return this;
    }

    public RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleCode);
        return this;
    }

    public RolePo selectRoleName() {
        this.queryWrapper.lambda().select(RolePo::getRoleName);
        return this;
    }

    public RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleName);
        return this;
    }

    public RolePo selectId() {
        this.queryWrapper.lambda().select(RolePo::getId);
        return this;
    }

    public RolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(RolePo::getCreatedBy);
        return this;
    }

    public RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedBy);
        return this;
    }

    public RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo selectStatus() {
        this.queryWrapper.lambda().select(RolePo::isStatus);
        return this;
    }

    public RolePo eqStatus() {
        this.queryWrapper.lambda().eq(RolePo::isStatus, isStatus());
        return this;
    }

    public RolePo selectSortCode() {
        this.queryWrapper.lambda().select(RolePo::getSortCode);
        return this;
    }

    public RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getSortCode);
        return this;
    }

    public RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(RolePo::getCreatedDate);
        return this;
    }

    public RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getCreatedDate);
        return this;
    }

    public RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedDate);
        return this;
    }

    public RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getUpdatedDate);
        return this;
    }

    public RolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-19 09:32:07 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RolePo> queryWrapper = new QueryWrapper<>();

    public RolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(RolePo::getRoleCode);
        return this;
    }

    public RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo inRoleCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleCode, valueList);
        return this;
    }

    public RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleCode);
        return this;
    }

    public RolePo selectRoleName() {
        this.queryWrapper.lambda().select(RolePo::getRoleName);
        return this;
    }

    public RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo inRoleName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleName, valueList);
        return this;
    }

    public RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleName);
        return this;
    }

    public RolePo selectId() {
        this.queryWrapper.lambda().select(RolePo::getId);
        return this;
    }

    public RolePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(RolePo::getCreatedBy);
        return this;
    }

    public RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedBy);
        return this;
    }

    public RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo selectStatus() {
        this.queryWrapper.lambda().select(RolePo::isStatus);
        return this;
    }

    public RolePo eqStatus() {
        this.queryWrapper.lambda().eq(RolePo::isStatus, isStatus());
        return this;
    }

    public RolePo selectSortCode() {
        this.queryWrapper.lambda().select(RolePo::getSortCode);
        return this;
    }

    public RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getSortCode);
        return this;
    }

    public RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(RolePo::getCreatedDate);
        return this;
    }

    public RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getCreatedDate);
        return this;
    }

    public RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedDate);
        return this;
    }

    public RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getUpdatedDate);
        return this;
    }

    public RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RolePo> queryWrapper = new QueryWrapper<>();

    public RolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(RolePo::getRoleCode);
        return this;
    }

    public RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo inRoleCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleCode, valueList);
        return this;
    }

    public RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleCode);
        return this;
    }

    public RolePo selectRoleName() {
        this.queryWrapper.lambda().select(RolePo::getRoleName);
        return this;
    }

    public RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo inRoleName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleName, valueList);
        return this;
    }

    public RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleName);
        return this;
    }

    public RolePo selectId() {
        this.queryWrapper.lambda().select(RolePo::getId);
        return this;
    }

    public RolePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(RolePo::getCreatedBy);
        return this;
    }

    public RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedBy);
        return this;
    }

    public RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo selectStatus() {
        this.queryWrapper.lambda().select(RolePo::isStatus);
        return this;
    }

    public RolePo eqStatus() {
        this.queryWrapper.lambda().eq(RolePo::isStatus, isStatus());
        return this;
    }

    public RolePo selectSortCode() {
        this.queryWrapper.lambda().select(RolePo::getSortCode);
        return this;
    }

    public RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getSortCode);
        return this;
    }

    public RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(RolePo::getCreatedDate);
        return this;
    }

    public RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getCreatedDate);
        return this;
    }

    public RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedDate);
        return this;
    }

    public RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getUpdatedDate);
        return this;
    }

    public RolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-22 22:00:59 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RolePo> queryWrapper = new QueryWrapper<>();

    public RolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(RolePo::getRoleCode);
        return this;
    }

    public RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo inRoleCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleCode, valueList);
        return this;
    }

    public RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleCode);
        return this;
    }

    public RolePo selectRoleName() {
        this.queryWrapper.lambda().select(RolePo::getRoleName);
        return this;
    }

    public RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo inRoleName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleName, valueList);
        return this;
    }

    public RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleName);
        return this;
    }

    public RolePo selectId() {
        this.queryWrapper.lambda().select(RolePo::getId);
        return this;
    }

    public RolePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getId, valueList);
        return this;
    }

    public RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(RolePo::getCreatedBy);
        return this;
    }

    public RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedBy);
        return this;
    }

    public RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo selectStatus() {
        this.queryWrapper.lambda().select(RolePo::isStatus);
        return this;
    }

    public RolePo eqStatus() {
        this.queryWrapper.lambda().eq(RolePo::isStatus, isStatus());
        return this;
    }

    public RolePo selectSortCode() {
        this.queryWrapper.lambda().select(RolePo::getSortCode);
        return this;
    }

    public RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getSortCode);
        return this;
    }

    public RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(RolePo::getCreatedDate);
        return this;
    }

    public RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getCreatedDate);
        return this;
    }

    public RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedDate);
        return this;
    }

    public RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getUpdatedDate);
        return this;
    }

    public RolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
## 2024-10-11 18:47:48 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RolePo> queryWrapper = new QueryWrapper<>();

    public RolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(RolePo::getRoleCode);
        return this;
    }

    public RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo inRoleCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleCode, valueList);
        return this;
    }

    public RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleCode);
        return this;
    }

    public RolePo selectRoleName() {
        this.queryWrapper.lambda().select(RolePo::getRoleName);
        return this;
    }

    public RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo inRoleName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleName, valueList);
        return this;
    }

    public RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleName);
        return this;
    }

    public RolePo selectId() {
        this.queryWrapper.lambda().select(RolePo::getId);
        return this;
    }

    public RolePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getId, valueList);
        return this;
    }

    public RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(RolePo::getCreatedBy);
        return this;
    }

    public RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedBy);
        return this;
    }

    public RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo selectStatus() {
        this.queryWrapper.lambda().select(RolePo::getStatus);
        return this;
    }

    public RolePo eqStatus() {
        this.queryWrapper.lambda().eq(RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo selectSortCode() {
        this.queryWrapper.lambda().select(RolePo::getSortCode);
        return this;
    }

    public RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getSortCode);
        return this;
    }

    public RolePo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(RolePo::getSortCode, getSortCode());
        return this;
    }

    public RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(RolePo::getCreatedDate);
        return this;
    }

    public RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getCreatedDate);
        return this;
    }

    public RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedDate);
        return this;
    }

    public RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getUpdatedDate);
        return this;
    }

    public RolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:53 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RolePo> queryWrapper = new QueryWrapper<>();

    public RolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(RolePo::getRoleCode);
        return this;
    }

    public RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo inRoleCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleCode, valueList);
        return this;
    }

    public RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleCode);
        return this;
    }

    public RolePo selectRoleName() {
        this.queryWrapper.lambda().select(RolePo::getRoleName);
        return this;
    }

    public RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo inRoleName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleName, valueList);
        return this;
    }

    public RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleName);
        return this;
    }

    public RolePo selectId() {
        this.queryWrapper.lambda().select(RolePo::getId);
        return this;
    }

    public RolePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getId, valueList);
        return this;
    }

    public RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(RolePo::getCreatedBy);
        return this;
    }

    public RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedBy);
        return this;
    }

    public RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo selectStatus() {
        this.queryWrapper.lambda().select(RolePo::getStatus);
        return this;
    }

    public RolePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo selectSortCode() {
        this.queryWrapper.lambda().select(RolePo::getSortCode);
        return this;
    }

    public RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getSortCode);
        return this;
    }

    public RolePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), RolePo::getSortCode, getSortCode());
        return this;
    }

    public RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(RolePo::getCreatedDate);
        return this;
    }

    public RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getCreatedDate);
        return this;
    }

    public RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedDate);
        return this;
    }

    public RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getUpdatedDate);
        return this;
    }

    public RolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:01:20 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RolePo> queryWrapper = new QueryWrapper<>();

    public RolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(RolePo::getRoleCode);
        return this;
    }

    public RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo inRoleCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleCode, valueList);
        return this;
    }

    public RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleCode);
        return this;
    }

    public RolePo selectRoleName() {
        this.queryWrapper.lambda().select(RolePo::getRoleName);
        return this;
    }

    public RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo inRoleName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleName, valueList);
        return this;
    }

    public RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleName);
        return this;
    }

    public RolePo selectId() {
        this.queryWrapper.lambda().select(RolePo::getId);
        return this;
    }

    public RolePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getId, valueList);
        return this;
    }

    public RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(RolePo::getCreatedBy);
        return this;
    }

    public RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedBy);
        return this;
    }

    public RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo selectStatus() {
        this.queryWrapper.lambda().select(RolePo::getStatus);
        return this;
    }

    public RolePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo selectSortCode() {
        this.queryWrapper.lambda().select(RolePo::getSortCode);
        return this;
    }

    public RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getSortCode);
        return this;
    }

    public RolePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), RolePo::getSortCode, getSortCode());
        return this;
    }

    public RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(RolePo::getCreatedDate);
        return this;
    }

    public RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getCreatedDate);
        return this;
    }

    public RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedDate);
        return this;
    }

    public RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getUpdatedDate);
        return this;
    }

    public RolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:46 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RolePo> queryWrapper = new QueryWrapper<>();

    public RolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(RolePo::getRoleCode);
        return this;
    }

    public RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo inRoleCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleCode, valueList);
        return this;
    }

    public RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleCode);
        return this;
    }

    public RolePo selectRoleName() {
        this.queryWrapper.lambda().select(RolePo::getRoleName);
        return this;
    }

    public RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo inRoleName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleName, valueList);
        return this;
    }

    public RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleName);
        return this;
    }

    public RolePo selectId() {
        this.queryWrapper.lambda().select(RolePo::getId);
        return this;
    }

    public RolePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getId, valueList);
        return this;
    }

    public RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(RolePo::getCreatedBy);
        return this;
    }

    public RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedBy);
        return this;
    }

    public RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo selectStatus() {
        this.queryWrapper.lambda().select(RolePo::getStatus);
        return this;
    }

    public RolePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo selectSortCode() {
        this.queryWrapper.lambda().select(RolePo::getSortCode);
        return this;
    }

    public RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getSortCode);
        return this;
    }

    public RolePo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), RolePo::getSortCode, getSortCode());
        return this;
    }

    public RolePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), RolePo::getSortCode, getSortCode());
        return this;
    }

    public RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(RolePo::getCreatedDate);
        return this;
    }

    public RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getCreatedDate);
        return this;
    }

    public RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedDate);
        return this;
    }

    public RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getUpdatedDate);
        return this;
    }

    public RolePo baseQueryWrapper() {
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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RolePo> queryWrapper = new QueryWrapper<>();

    public RolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(RolePo::getRoleCode);
        return this;
    }

    public RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo inRoleCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleCode, valueList);
        return this;
    }

    public RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleCode);
        return this;
    }

    public RolePo selectRoleName() {
        this.queryWrapper.lambda().select(RolePo::getRoleName);
        return this;
    }

    public RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo inRoleName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleName, valueList);
        return this;
    }

    public RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleName);
        return this;
    }

    public RolePo selectId() {
        this.queryWrapper.lambda().select(RolePo::getId);
        return this;
    }

    public RolePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getId, valueList);
        return this;
    }

    public RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(RolePo::getCreatedBy);
        return this;
    }

    public RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedBy);
        return this;
    }

    public RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo selectStatus() {
        this.queryWrapper.lambda().select(RolePo::getStatus);
        return this;
    }

    public RolePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo selectSortCode() {
        this.queryWrapper.lambda().select(RolePo::getSortCode);
        return this;
    }

    public RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getSortCode);
        return this;
    }

    public RolePo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), RolePo::getSortCode, getSortCode());
        return this;
    }

    public RolePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), RolePo::getSortCode, getSortCode());
        return this;
    }

    public RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(RolePo::getCreatedDate);
        return this;
    }

    public RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getCreatedDate);
        return this;
    }

    public RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedDate);
        return this;
    }

    public RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getUpdatedDate);
        return this;
    }

    public RolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

