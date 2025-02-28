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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-02-09 10:56:15 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getEnterpriseId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getEnterpriseId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getEnterpriseId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getEnterpriseId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getEnterpriseId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getEnterpriseId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<noice.entity.po.bean.UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.UserPo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getEnterpriseId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), noice.entity.po.bean.UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), noice.entity.po.bean.UserPo::getUserCode, getUserCode());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), noice.entity.po.bean.UserPo::getUserName, getUserName());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserName);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), noice.entity.po.bean.UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.UserPo::getUserPassword);
        return this;
    }

    public noice.entity.po.bean.UserPo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getId);
        return this;
    }

    public noice.entity.po.bean.UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.UserPo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.UserPo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::isStatus);
        return this;
    }

    public noice.entity.po.bean.UserPo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.UserPo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.UserPo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.UserPo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserPo> queryWrapper = new QueryWrapper<>();

    public UserPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(UserPo::getEnterpriseId);
        return this;
    }

    public UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo selectUserCode() {
        this.queryWrapper.lambda().select(UserPo::getUserCode);
        return this;
    }

    public UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserCode);
        return this;
    }

    public UserPo selectUserName() {
        this.queryWrapper.lambda().select(UserPo::getUserName);
        return this;
    }

    public UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserName);
        return this;
    }

    public UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(UserPo::getUserPassword);
        return this;
    }

    public UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserPassword);
        return this;
    }

    public UserPo selectId() {
        this.queryWrapper.lambda().select(UserPo::getId);
        return this;
    }

    public UserPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserPo::getCreatedBy);
        return this;
    }

    public UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedBy);
        return this;
    }

    public UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo selectStatus() {
        this.queryWrapper.lambda().select(UserPo::isStatus);
        return this;
    }

    public UserPo eqStatus() {
        this.queryWrapper.lambda().eq(UserPo::isStatus, isStatus());
        return this;
    }

    public UserPo selectSortCode() {
        this.queryWrapper.lambda().select(UserPo::getSortCode);
        return this;
    }

    public UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getSortCode);
        return this;
    }

    public UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserPo::getCreatedDate);
        return this;
    }

    public UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getCreatedDate);
        return this;
    }

    public UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedDate);
        return this;
    }

    public UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUpdatedDate);
        return this;
    }

    public UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserPo> queryWrapper = new QueryWrapper<>();

    public UserPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(UserPo::getEnterpriseId);
        return this;
    }

    public UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo selectUserCode() {
        this.queryWrapper.lambda().select(UserPo::getUserCode);
        return this;
    }

    public UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo inUserCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserCode, valueList);
        return this;
    }

    public UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserCode);
        return this;
    }

    public UserPo selectUserName() {
        this.queryWrapper.lambda().select(UserPo::getUserName);
        return this;
    }

    public UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo inUserName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserName, valueList);
        return this;
    }

    public UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserName);
        return this;
    }

    public UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(UserPo::getUserPassword);
        return this;
    }

    public UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo inUserPassword(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserPassword, valueList);
        return this;
    }

    public UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserPassword);
        return this;
    }

    public UserPo selectId() {
        this.queryWrapper.lambda().select(UserPo::getId);
        return this;
    }

    public UserPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserPo::getCreatedBy);
        return this;
    }

    public UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedBy);
        return this;
    }

    public UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo selectStatus() {
        this.queryWrapper.lambda().select(UserPo::isStatus);
        return this;
    }

    public UserPo eqStatus() {
        this.queryWrapper.lambda().eq(UserPo::isStatus, isStatus());
        return this;
    }

    public UserPo selectSortCode() {
        this.queryWrapper.lambda().select(UserPo::getSortCode);
        return this;
    }

    public UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getSortCode);
        return this;
    }

    public UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserPo::getCreatedDate);
        return this;
    }

    public UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getCreatedDate);
        return this;
    }

    public UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedDate);
        return this;
    }

    public UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUpdatedDate);
        return this;
    }

    public UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserPo> queryWrapper = new QueryWrapper<>();

    public UserPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(UserPo::getEnterpriseId);
        return this;
    }

    public UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo inEnterpriseId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getEnterpriseId, valueList);
        return this;
    }

    public UserPo selectUserCode() {
        this.queryWrapper.lambda().select(UserPo::getUserCode);
        return this;
    }

    public UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo inUserCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserCode, valueList);
        return this;
    }

    public UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserCode);
        return this;
    }

    public UserPo selectUserName() {
        this.queryWrapper.lambda().select(UserPo::getUserName);
        return this;
    }

    public UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo inUserName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserName, valueList);
        return this;
    }

    public UserPo likeUserName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserName);
        return this;
    }

    public UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(UserPo::getUserPassword);
        return this;
    }

    public UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo inUserPassword(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserPassword, valueList);
        return this;
    }

    public UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserPassword);
        return this;
    }

    public UserPo selectId() {
        this.queryWrapper.lambda().select(UserPo::getId);
        return this;
    }

    public UserPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserPo::getCreatedBy);
        return this;
    }

    public UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedBy);
        return this;
    }

    public UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo selectStatus() {
        this.queryWrapper.lambda().select(UserPo::isStatus);
        return this;
    }

    public UserPo eqStatus() {
        this.queryWrapper.lambda().eq(UserPo::isStatus, isStatus());
        return this;
    }

    public UserPo selectSortCode() {
        this.queryWrapper.lambda().select(UserPo::getSortCode);
        return this;
    }

    public UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getSortCode);
        return this;
    }

    public UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserPo::getCreatedDate);
        return this;
    }

    public UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getCreatedDate);
        return this;
    }

    public UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedDate);
        return this;
    }

    public UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUpdatedDate);
        return this;
    }

    public UserPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-22 22:01:00 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserPo> queryWrapper = new QueryWrapper<>();

    public UserPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(UserPo::getEnterpriseId);
        return this;
    }

    public UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo inEnterpriseId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getEnterpriseId, valueList);
        return this;
    }

    public UserPo selectUserCode() {
        this.queryWrapper.lambda().select(UserPo::getUserCode);
        return this;
    }

    public UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo inUserCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserCode, valueList);
        return this;
    }

    public UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserCode);
        return this;
    }

    public UserPo selectUserName() {
        this.queryWrapper.lambda().select(UserPo::getUserName);
        return this;
    }

    public UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo inUserName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserName, valueList);
        return this;
    }

    public UserPo likeUserName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserName);
        return this;
    }

    public UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(UserPo::getUserPassword);
        return this;
    }

    public UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo inUserPassword(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserPassword, valueList);
        return this;
    }

    public UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserPassword);
        return this;
    }

    public UserPo selectId() {
        this.queryWrapper.lambda().select(UserPo::getId);
        return this;
    }

    public UserPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getId, valueList);
        return this;
    }

    public UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserPo::getCreatedBy);
        return this;
    }

    public UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedBy);
        return this;
    }

    public UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo selectStatus() {
        this.queryWrapper.lambda().select(UserPo::isStatus);
        return this;
    }

    public UserPo eqStatus() {
        this.queryWrapper.lambda().eq(UserPo::isStatus, isStatus());
        return this;
    }

    public UserPo selectSortCode() {
        this.queryWrapper.lambda().select(UserPo::getSortCode);
        return this;
    }

    public UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getSortCode);
        return this;
    }

    public UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserPo::getCreatedDate);
        return this;
    }

    public UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getCreatedDate);
        return this;
    }

    public UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedDate);
        return this;
    }

    public UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUpdatedDate);
        return this;
    }

    public UserPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
## 2024-10-11 18:47:49 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserPo> queryWrapper = new QueryWrapper<>();

    public UserPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(UserPo::getEnterpriseId);
        return this;
    }

    public UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo inEnterpriseId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getEnterpriseId, valueList);
        return this;
    }

    public UserPo selectUserCode() {
        this.queryWrapper.lambda().select(UserPo::getUserCode);
        return this;
    }

    public UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo inUserCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserCode, valueList);
        return this;
    }

    public UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserCode);
        return this;
    }

    public UserPo selectUserName() {
        this.queryWrapper.lambda().select(UserPo::getUserName);
        return this;
    }

    public UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo inUserName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserName, valueList);
        return this;
    }

    public UserPo likeUserName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserName);
        return this;
    }

    public UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(UserPo::getUserPassword);
        return this;
    }

    public UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo inUserPassword(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserPassword, valueList);
        return this;
    }

    public UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserPassword);
        return this;
    }

    public UserPo selectId() {
        this.queryWrapper.lambda().select(UserPo::getId);
        return this;
    }

    public UserPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getId, valueList);
        return this;
    }

    public UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserPo::getCreatedBy);
        return this;
    }

    public UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedBy);
        return this;
    }

    public UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo selectStatus() {
        this.queryWrapper.lambda().select(UserPo::getStatus);
        return this;
    }

    public UserPo eqStatus() {
        this.queryWrapper.lambda().eq(UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo selectSortCode() {
        this.queryWrapper.lambda().select(UserPo::getSortCode);
        return this;
    }

    public UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getSortCode);
        return this;
    }

    public UserPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(UserPo::getSortCode, getSortCode());
        return this;
    }

    public UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserPo::getCreatedDate);
        return this;
    }

    public UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getCreatedDate);
        return this;
    }

    public UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedDate);
        return this;
    }

    public UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUpdatedDate);
        return this;
    }

    public UserPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:54 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserPo> queryWrapper = new QueryWrapper<>();

    public UserPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(UserPo::getEnterpriseId);
        return this;
    }

    public UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo inEnterpriseId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getEnterpriseId, valueList);
        return this;
    }

    public UserPo selectUserCode() {
        this.queryWrapper.lambda().select(UserPo::getUserCode);
        return this;
    }

    public UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo inUserCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserCode, valueList);
        return this;
    }

    public UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserCode);
        return this;
    }

    public UserPo selectUserName() {
        this.queryWrapper.lambda().select(UserPo::getUserName);
        return this;
    }

    public UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo inUserName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserName, valueList);
        return this;
    }

    public UserPo likeUserName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserName);
        return this;
    }

    public UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(UserPo::getUserPassword);
        return this;
    }

    public UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo inUserPassword(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserPassword, valueList);
        return this;
    }

    public UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserPassword);
        return this;
    }

    public UserPo selectId() {
        this.queryWrapper.lambda().select(UserPo::getId);
        return this;
    }

    public UserPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getId, valueList);
        return this;
    }

    public UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserPo::getCreatedBy);
        return this;
    }

    public UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedBy);
        return this;
    }

    public UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo selectStatus() {
        this.queryWrapper.lambda().select(UserPo::getStatus);
        return this;
    }

    public UserPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo selectSortCode() {
        this.queryWrapper.lambda().select(UserPo::getSortCode);
        return this;
    }

    public UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getSortCode);
        return this;
    }

    public UserPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), UserPo::getSortCode, getSortCode());
        return this;
    }

    public UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserPo::getCreatedDate);
        return this;
    }

    public UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getCreatedDate);
        return this;
    }

    public UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedDate);
        return this;
    }

    public UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUpdatedDate);
        return this;
    }

    public UserPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:01:21 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserPo> queryWrapper = new QueryWrapper<>();

    public UserPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(UserPo::getEnterpriseId);
        return this;
    }

    public UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo inEnterpriseId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getEnterpriseId, valueList);
        return this;
    }

    public UserPo selectUserCode() {
        this.queryWrapper.lambda().select(UserPo::getUserCode);
        return this;
    }

    public UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo inUserCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserCode, valueList);
        return this;
    }

    public UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserCode);
        return this;
    }

    public UserPo selectUserName() {
        this.queryWrapper.lambda().select(UserPo::getUserName);
        return this;
    }

    public UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo inUserName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserName, valueList);
        return this;
    }

    public UserPo likeUserName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserName);
        return this;
    }

    public UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(UserPo::getUserPassword);
        return this;
    }

    public UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo inUserPassword(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserPassword, valueList);
        return this;
    }

    public UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserPassword);
        return this;
    }

    public UserPo selectId() {
        this.queryWrapper.lambda().select(UserPo::getId);
        return this;
    }

    public UserPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getId, valueList);
        return this;
    }

    public UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserPo::getCreatedBy);
        return this;
    }

    public UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedBy);
        return this;
    }

    public UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo selectStatus() {
        this.queryWrapper.lambda().select(UserPo::getStatus);
        return this;
    }

    public UserPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo selectSortCode() {
        this.queryWrapper.lambda().select(UserPo::getSortCode);
        return this;
    }

    public UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getSortCode);
        return this;
    }

    public UserPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), UserPo::getSortCode, getSortCode());
        return this;
    }

    public UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserPo::getCreatedDate);
        return this;
    }

    public UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getCreatedDate);
        return this;
    }

    public UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedDate);
        return this;
    }

    public UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUpdatedDate);
        return this;
    }

    public UserPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:47 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserPo> queryWrapper = new QueryWrapper<>();

    public UserPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(UserPo::getEnterpriseId);
        return this;
    }

    public UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo inEnterpriseId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getEnterpriseId, valueList);
        return this;
    }

    public UserPo selectUserCode() {
        this.queryWrapper.lambda().select(UserPo::getUserCode);
        return this;
    }

    public UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo inUserCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserCode, valueList);
        return this;
    }

    public UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserCode);
        return this;
    }

    public UserPo selectUserName() {
        this.queryWrapper.lambda().select(UserPo::getUserName);
        return this;
    }

    public UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo inUserName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserName, valueList);
        return this;
    }

    public UserPo likeUserName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserName);
        return this;
    }

    public UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(UserPo::getUserPassword);
        return this;
    }

    public UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo inUserPassword(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserPassword, valueList);
        return this;
    }

    public UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserPassword);
        return this;
    }

    public UserPo selectId() {
        this.queryWrapper.lambda().select(UserPo::getId);
        return this;
    }

    public UserPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getId, valueList);
        return this;
    }

    public UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserPo::getCreatedBy);
        return this;
    }

    public UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedBy);
        return this;
    }

    public UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo selectStatus() {
        this.queryWrapper.lambda().select(UserPo::getStatus);
        return this;
    }

    public UserPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo selectSortCode() {
        this.queryWrapper.lambda().select(UserPo::getSortCode);
        return this;
    }

    public UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getSortCode);
        return this;
    }

    public UserPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), UserPo::getSortCode, getSortCode());
        return this;
    }

    public UserPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), UserPo::getSortCode, getSortCode());
        return this;
    }

    public UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserPo::getCreatedDate);
        return this;
    }

    public UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getCreatedDate);
        return this;
    }

    public UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedDate);
        return this;
    }

    public UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUpdatedDate);
        return this;
    }

    public UserPo baseQueryWrapper() {
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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserPo> queryWrapper = new QueryWrapper<>();

    public UserPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(UserPo::getEnterpriseId);
        return this;
    }

    public UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo inEnterpriseId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getEnterpriseId, valueList);
        return this;
    }

    public UserPo selectUserCode() {
        this.queryWrapper.lambda().select(UserPo::getUserCode);
        return this;
    }

    public UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo inUserCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserCode, valueList);
        return this;
    }

    public UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserCode);
        return this;
    }

    public UserPo selectUserName() {
        this.queryWrapper.lambda().select(UserPo::getUserName);
        return this;
    }

    public UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo inUserName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserName, valueList);
        return this;
    }

    public UserPo likeUserName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserName);
        return this;
    }

    public UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(UserPo::getUserPassword);
        return this;
    }

    public UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo inUserPassword(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserPassword, valueList);
        return this;
    }

    public UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserPassword);
        return this;
    }

    public UserPo selectId() {
        this.queryWrapper.lambda().select(UserPo::getId);
        return this;
    }

    public UserPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getId, valueList);
        return this;
    }

    public UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserPo::getCreatedBy);
        return this;
    }

    public UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedBy);
        return this;
    }

    public UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo selectStatus() {
        this.queryWrapper.lambda().select(UserPo::getStatus);
        return this;
    }

    public UserPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo selectSortCode() {
        this.queryWrapper.lambda().select(UserPo::getSortCode);
        return this;
    }

    public UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getSortCode);
        return this;
    }

    public UserPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), UserPo::getSortCode, getSortCode());
        return this;
    }

    public UserPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), UserPo::getSortCode, getSortCode());
        return this;
    }

    public UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserPo::getCreatedDate);
        return this;
    }

    public UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getCreatedDate);
        return this;
    }

    public UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedDate);
        return this;
    }

    public UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUpdatedDate);
        return this;
    }

    public UserPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-12-22 22:04:55 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserPo> queryWrapper = new QueryWrapper<>();

    public UserPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(UserPo::getEnterpriseId);
        return this;
    }

    public UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo inEnterpriseId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getEnterpriseId, valueList);
        return this;
    }

    public UserPo selectUserCode() {
        this.queryWrapper.lambda().select(UserPo::getUserCode);
        return this;
    }

    public UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo inUserCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserCode, valueList);
        return this;
    }

    public UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserCode);
        return this;
    }

    public UserPo selectUserName() {
        this.queryWrapper.lambda().select(UserPo::getUserName);
        return this;
    }

    public UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo inUserName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserName, valueList);
        return this;
    }

    public UserPo likeUserName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserName);
        return this;
    }

    public UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(UserPo::getUserPassword);
        return this;
    }

    public UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo inUserPassword(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserPassword, valueList);
        return this;
    }

    public UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserPassword);
        return this;
    }

    public UserPo selectId() {
        this.queryWrapper.lambda().select(UserPo::getId);
        return this;
    }

    public UserPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getId, valueList);
        return this;
    }

    public UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserPo::getCreatedBy);
        return this;
    }

    public UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedBy);
        return this;
    }

    public UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo selectStatus() {
        this.queryWrapper.lambda().select(UserPo::getStatus);
        return this;
    }

    public UserPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo selectSortCode() {
        this.queryWrapper.lambda().select(UserPo::getSortCode);
        return this;
    }

    public UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getSortCode);
        return this;
    }

    public UserPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), UserPo::getSortCode, getSortCode());
        return this;
    }

    public UserPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), UserPo::getSortCode, getSortCode());
        return this;
    }

    public UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserPo::getCreatedDate);
        return this;
    }

    public UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getCreatedDate);
        return this;
    }

    public UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedDate);
        return this;
    }

    public UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUpdatedDate);
        return this;
    }

    public UserPo eqAuto() {
        return this.eqEnterpriseId().eqUserCode().eqUserName().eqUserPassword();
    }

    public UserPo likeAuto() {
        return this.eqEnterpriseId().likeUserCode().likeUserName().likeUserPassword();
    }

    public UserPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-12-23 00:33:12 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_user")
@SuppressWarnings("unused")
public class UserPo extends BasePoBean<UserPo> {

    public static final String PO = "User";

    @TableField("enterprise_id")
    private String enterpriseId;

    @TableField("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("user_password")
    private String userPassword;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserPo> queryWrapper = new QueryWrapper<>();

    public UserPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserPo selectEnterpriseId() {
        this.queryWrapper.lambda().select(UserPo::getEnterpriseId);
        return this;
    }

    public UserPo eqEnterpriseId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo eqEnterpriseId(String value) {
        this.setEnterpriseId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseId()), UserPo::getEnterpriseId, getEnterpriseId());
        return this;
    }

    public UserPo inEnterpriseId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getEnterpriseId, valueList);
        return this;
    }

    public UserPo orderByEnterpriseId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getEnterpriseId);
        return this;
    }

    public UserPo selectUserCode() {
        this.queryWrapper.lambda().select(UserPo::getUserCode);
        return this;
    }

    public UserPo eqUserCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo eqUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo inUserCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserCode, valueList);
        return this;
    }

    public UserPo likeUserCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo likeUserCode(String value) {
        this.setUserCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserCode()), UserPo::getUserCode, getUserCode());
        return this;
    }

    public UserPo orderByUserCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserCode);
        return this;
    }

    public UserPo orderByUserCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserCode);
        return this;
    }

    public UserPo selectUserName() {
        this.queryWrapper.lambda().select(UserPo::getUserName);
        return this;
    }

    public UserPo eqUserName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo eqUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo inUserName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserName, valueList);
        return this;
    }

    public UserPo likeUserName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo likeUserName(String value) {
        this.setUserName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserName()), UserPo::getUserName, getUserName());
        return this;
    }

    public UserPo orderByUserName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserName);
        return this;
    }

    public UserPo orderByUserNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserName);
        return this;
    }

    public UserPo selectUserPassword() {
        this.queryWrapper.lambda().select(UserPo::getUserPassword);
        return this;
    }

    public UserPo eqUserPassword() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo eqUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo inUserPassword(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getUserPassword, valueList);
        return this;
    }

    public UserPo likeUserPassword() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo likeUserPassword(String value) {
        this.setUserPassword(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getUserPassword()), UserPo::getUserPassword, getUserPassword());
        return this;
    }

    public UserPo orderByUserPassword(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordAsc() {
        this.queryWrapper.lambda().orderBy(true, true, UserPo::getUserPassword);
        return this;
    }

    public UserPo orderByUserPasswordDesc() {
        this.queryWrapper.lambda().orderBy(true, false, UserPo::getUserPassword);
        return this;
    }

    public UserPo selectId() {
        this.queryWrapper.lambda().select(UserPo::getId);
        return this;
    }

    public UserPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserPo::getId, getId());
        return this;
    }

    public UserPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserPo::getId, valueList);
        return this;
    }

    public UserPo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserPo::getCreatedBy);
        return this;
    }

    public UserPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedBy);
        return this;
    }

    public UserPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserPo selectStatus() {
        this.queryWrapper.lambda().select(UserPo::getStatus);
        return this;
    }

    public UserPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), UserPo::getStatus, getStatus());
        return this;
    }

    public UserPo selectSortCode() {
        this.queryWrapper.lambda().select(UserPo::getSortCode);
        return this;
    }

    public UserPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getSortCode);
        return this;
    }

    public UserPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), UserPo::getSortCode, getSortCode());
        return this;
    }

    public UserPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), UserPo::getSortCode, getSortCode());
        return this;
    }

    public UserPo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserPo::getCreatedDate);
        return this;
    }

    public UserPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getCreatedDate);
        return this;
    }

    public UserPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserPo::getUpdatedDate);
        return this;
    }

    public UserPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserPo::getUpdatedDate);
        return this;
    }

    public UserPo eqAuto() {
        return this.eqEnterpriseId().eqUserCode().eqUserName().eqUserPassword();
    }

    public UserPo likeAuto() {
        return this.eqEnterpriseId().likeUserCode().likeUserName().likeUserPassword();
    }

    public UserPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

