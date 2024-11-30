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
@TableName("t_user_role")
public class UserRolePo extends BasePoRelation<noice.entity.po.relation.UserRolePo> {

    public static final String PO = "UserRole";

    @TableField("role_id")
    private String roleId;

    @TableField("user_id")
    private String userId;

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
@TableName("t_user_role")
@SuppressWarnings("unused")
public class UserRolePo extends BasePoRelation<noice.entity.po.relation.UserRolePo> {

    public static final String PO = "UserRole";

    @TableField("role_id")
    private String roleId;

    @TableField("user_id")
    private String userId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.relation.UserRolePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.relation.UserRolePo selectRoleId() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.UserRolePo::getRoleId);
        return this;
    }

    public noice.entity.po.relation.UserRolePo eqRoleId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleId()), noice.entity.po.relation.UserRolePo::getRoleId, getRoleId());
        return this;
    }

    public noice.entity.po.relation.UserRolePo eqRoleId(String value) {
        this.setRoleId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleId()), noice.entity.po.relation.UserRolePo::getRoleId, getRoleId());
        return this;
    }

    public noice.entity.po.relation.UserRolePo selectUserId() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.UserRolePo::getUserId);
        return this;
    }

    public noice.entity.po.relation.UserRolePo eqUserId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserId()), noice.entity.po.relation.UserRolePo::getUserId, getUserId());
        return this;
    }

    public noice.entity.po.relation.UserRolePo eqUserId(String value) {
        this.setUserId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserId()), noice.entity.po.relation.UserRolePo::getUserId, getUserId());
        return this;
    }

    public noice.entity.po.relation.UserRolePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.UserRolePo::getId);
        return this;
    }

    public noice.entity.po.relation.UserRolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.relation.UserRolePo::getId, getId());
        return this;
    }

    public noice.entity.po.relation.UserRolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.UserRolePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.relation.UserRolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.relation.UserRolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.relation.UserRolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.UserRolePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.relation.UserRolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.relation.UserRolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.relation.UserRolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.UserRolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.relation.UserRolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.relation.UserRolePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.relation.UserRolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.relation.UserRolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.relation.UserRolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.relation.UserRolePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.relation.UserRolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-19 15:25:08 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_user_role")
@SuppressWarnings("unused")
public class UserRolePo extends BasePoRelation<UserRolePo> {

    public static final String PO = "UserRole";

    @TableField("role_id")
    private String roleId;

    @TableField("user_id")
    private String userId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserRolePo> queryWrapper = new QueryWrapper<>();

    public UserRolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserRolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserRolePo selectRoleId() {
        this.queryWrapper.lambda().select(UserRolePo::getRoleId);
        return this;
    }

    public UserRolePo eqRoleId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleId()), UserRolePo::getRoleId, getRoleId());
        return this;
    }

    public UserRolePo eqRoleId(String value) {
        this.setRoleId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getRoleId()), UserRolePo::getRoleId, getRoleId());
        return this;
    }

    public UserRolePo selectUserId() {
        this.queryWrapper.lambda().select(UserRolePo::getUserId);
        return this;
    }

    public UserRolePo eqUserId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserId()), UserRolePo::getUserId, getUserId());
        return this;
    }

    public UserRolePo eqUserId(String value) {
        this.setUserId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserId()), UserRolePo::getUserId, getUserId());
        return this;
    }

    public UserRolePo selectId() {
        this.queryWrapper.lambda().select(UserRolePo::getId);
        return this;
    }

    public UserRolePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), UserRolePo::getId, getId());
        return this;
    }

    public UserRolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserRolePo::getCreatedBy);
        return this;
    }

    public UserRolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), UserRolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserRolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserRolePo::getUpdatedBy);
        return this;
    }

    public UserRolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), UserRolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserRolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserRolePo::getCreatedDate);
        return this;
    }

    public UserRolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserRolePo::getCreatedDate);
        return this;
    }

    public UserRolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserRolePo::getUpdatedDate);
        return this;
    }

    public UserRolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserRolePo::getUpdatedDate);
        return this;
    }

    public UserRolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
