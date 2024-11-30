## 2024-03-03 14:08:03 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.relation;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoRelation;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_role_authority")
public class RoleAuthorityPo extends BasePoRelation<noice.entity.po.relation.RoleAuthorityPo> {

    public static final String PO = "RoleAuthority";

    @TableField("authority_id")
    private String authorityId;

    @TableField("role_id")
    private String roleId;

}
```

## 2024-03-03 14:11:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.relation;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoRelation;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_role_authority")
@SuppressWarnings("unused")
public class RoleAuthorityPo extends BasePoRelation<noice.entity.po.relation.RoleAuthorityPo> {

    public static final String PO = "RoleAuthority";

    @TableField("authority_id")
    private String authorityId;

    @TableField("role_id")
    private String roleId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.relation.RoleAuthorityPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.relation.RoleAuthorityPo selectAuthorityId() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.RoleAuthorityPo::getAuthorityId);
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityId()), noice.entity.po.relation.RoleAuthorityPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityId()), noice.entity.po.relation.RoleAuthorityPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo selectRoleId() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.RoleAuthorityPo::getRoleId);
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo eqRoleId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleId()), noice.entity.po.relation.RoleAuthorityPo::getRoleId, getRoleId());
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo eqRoleId(String value) {
        this.setRoleId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleId()), noice.entity.po.relation.RoleAuthorityPo::getRoleId, getRoleId());
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.RoleAuthorityPo::getId);
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.relation.RoleAuthorityPo::getId, getId());
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.RoleAuthorityPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.relation.RoleAuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.RoleAuthorityPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.relation.RoleAuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.RoleAuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.relation.RoleAuthorityPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.RoleAuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.relation.RoleAuthorityPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.relation.RoleAuthorityPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-19 15:25:07 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.po.relation;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoRelation;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_role_authority")
@SuppressWarnings("unused")
public class RoleAuthorityPo extends BasePoRelation<RoleAuthorityPo> {

    public static final String PO = "RoleAuthority";

    @TableField("authority_id")
    private String authorityId;

    @TableField("role_id")
    private String roleId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RoleAuthorityPo> queryWrapper = new QueryWrapper<>();

    public RoleAuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RoleAuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RoleAuthorityPo selectAuthorityId() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getAuthorityId);
        return this;
    }

    public RoleAuthorityPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityId()), RoleAuthorityPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public RoleAuthorityPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAuthorityId()), RoleAuthorityPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public RoleAuthorityPo selectRoleId() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getRoleId);
        return this;
    }

    public RoleAuthorityPo eqRoleId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleId()), RoleAuthorityPo::getRoleId, getRoleId());
        return this;
    }

    public RoleAuthorityPo eqRoleId(String value) {
        this.setRoleId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleId()), RoleAuthorityPo::getRoleId, getRoleId());
        return this;
    }

    public RoleAuthorityPo selectId() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getId);
        return this;
    }

    public RoleAuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), RoleAuthorityPo::getId, getId());
        return this;
    }

    public RoleAuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getCreatedBy);
        return this;
    }

    public RoleAuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), RoleAuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RoleAuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getUpdatedBy);
        return this;
    }

    public RoleAuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), RoleAuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RoleAuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getCreatedDate);
        return this;
    }

    public RoleAuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RoleAuthorityPo::getCreatedDate);
        return this;
    }

    public RoleAuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getUpdatedDate);
        return this;
    }

    public RoleAuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RoleAuthorityPo::getUpdatedDate);
        return this;
    }

    public RoleAuthorityPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
