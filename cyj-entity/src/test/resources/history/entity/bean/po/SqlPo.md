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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::isStatus, isStatus());
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::isStatus, isStatus());
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::isStatus, isStatus());
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::isStatus, isStatus());
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::isStatus, isStatus());
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo selectSqlCode() {
        this.queryWrapper.lambda().select(SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo selectSqlName() {
        this.queryWrapper.lambda().select(SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo selectSqlStr() {
        this.queryWrapper.lambda().select(SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo selectSqlType() {
        this.queryWrapper.lambda().select(SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo selectId() {
        this.queryWrapper.lambda().select(SqlPo::getId);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo selectCreatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedBy);
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedBy);
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo selectStatus() {
        this.queryWrapper.lambda().select(SqlPo::isStatus);
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::isStatus, isStatus());
        return this;
    }

    public SqlPo selectSortCode() {
        this.queryWrapper.lambda().select(SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo selectCreatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo selectSqlCode() {
        this.queryWrapper.lambda().select(SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo selectSqlName() {
        this.queryWrapper.lambda().select(SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo selectSqlStr() {
        this.queryWrapper.lambda().select(SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo selectSqlType() {
        this.queryWrapper.lambda().select(SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo selectId() {
        this.queryWrapper.lambda().select(SqlPo::getId);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo selectCreatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedBy);
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedBy);
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo selectStatus() {
        this.queryWrapper.lambda().select(SqlPo::isStatus);
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::isStatus, isStatus());
        return this;
    }

    public SqlPo selectSortCode() {
        this.queryWrapper.lambda().select(SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo selectCreatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo selectSqlCode() {
        this.queryWrapper.lambda().select(SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo selectSqlName() {
        this.queryWrapper.lambda().select(SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo selectSqlStr() {
        this.queryWrapper.lambda().select(SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo selectSqlType() {
        this.queryWrapper.lambda().select(SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo selectId() {
        this.queryWrapper.lambda().select(SqlPo::getId);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo selectCreatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedBy);
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedBy);
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo selectStatus() {
        this.queryWrapper.lambda().select(SqlPo::isStatus);
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::isStatus, isStatus());
        return this;
    }

    public SqlPo selectSortCode() {
        this.queryWrapper.lambda().select(SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo selectCreatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo selectSqlCode() {
        this.queryWrapper.lambda().select(SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo selectSqlName() {
        this.queryWrapper.lambda().select(SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo selectSqlStr() {
        this.queryWrapper.lambda().select(SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo selectSqlType() {
        this.queryWrapper.lambda().select(SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo selectId() {
        this.queryWrapper.lambda().select(SqlPo::getId);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo selectCreatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedBy);
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedBy);
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo selectStatus() {
        this.queryWrapper.lambda().select(SqlPo::isStatus);
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::isStatus, isStatus());
        return this;
    }

    public SqlPo selectSortCode() {
        this.queryWrapper.lambda().select(SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo selectCreatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo selectSqlCode() {
        this.queryWrapper.lambda().select(SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo selectSqlName() {
        this.queryWrapper.lambda().select(SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo selectSqlStr() {
        this.queryWrapper.lambda().select(SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo selectSqlType() {
        this.queryWrapper.lambda().select(SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo selectId() {
        this.queryWrapper.lambda().select(SqlPo::getId);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo selectCreatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedBy);
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedBy);
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo selectStatus() {
        this.queryWrapper.lambda().select(SqlPo::isStatus);
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::isStatus, isStatus());
        return this;
    }

    public SqlPo selectSortCode() {
        this.queryWrapper.lambda().select(SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo selectCreatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo selectSqlCode() {
        this.queryWrapper.lambda().select(SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo selectSqlName() {
        this.queryWrapper.lambda().select(SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo selectSqlStr() {
        this.queryWrapper.lambda().select(SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo selectSqlType() {
        this.queryWrapper.lambda().select(SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo selectId() {
        this.queryWrapper.lambda().select(SqlPo::getId);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo selectCreatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedBy);
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedBy);
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo selectStatus() {
        this.queryWrapper.lambda().select(SqlPo::isStatus);
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::isStatus, isStatus());
        return this;
    }

    public SqlPo selectSortCode() {
        this.queryWrapper.lambda().select(SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo selectCreatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-24 00:35:19 noice 作者大大 曹元杰 天才 笔记本

```java
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public SqlPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public SqlPo selectSqlCode() {
        this.queryWrapper.lambda().select(SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo inSqlCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlCode, valueList);
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo selectSqlName() {
        this.queryWrapper.lambda().select(SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo inSqlName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlName, valueList);
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo selectSqlStr() {
        this.queryWrapper.lambda().select(SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo inSqlStr(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlStr, valueList);
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo selectSqlType() {
        this.queryWrapper.lambda().select(SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo inSqlType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlType, valueList);
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo selectId() {
        this.queryWrapper.lambda().select(SqlPo::getId);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getId, valueList);
        return this;
    }

    public SqlPo selectCreatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedBy);
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedBy);
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo selectStatus() {
        this.queryWrapper.lambda().select(SqlPo::getStatus);
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(SqlPo::getStatus, getStatus());
        return this;
    }

    public SqlPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(SqlPo::getStatus, getStatus());
        return this;
    }

    public SqlPo selectSortCode() {
        this.queryWrapper.lambda().select(SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(SqlPo::getSortCode, getSortCode());
        return this;
    }

    public SqlPo selectCreatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public SqlPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public SqlPo selectSqlCode() {
        this.queryWrapper.lambda().select(SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo inSqlCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlCode, valueList);
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo selectSqlName() {
        this.queryWrapper.lambda().select(SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo inSqlName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlName, valueList);
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo selectSqlStr() {
        this.queryWrapper.lambda().select(SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo inSqlStr(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlStr, valueList);
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo selectSqlType() {
        this.queryWrapper.lambda().select(SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo inSqlType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlType, valueList);
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo selectId() {
        this.queryWrapper.lambda().select(SqlPo::getId);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getId, valueList);
        return this;
    }

    public SqlPo selectCreatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedBy);
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedBy);
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo selectStatus() {
        this.queryWrapper.lambda().select(SqlPo::getStatus);
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), SqlPo::getStatus, getStatus());
        return this;
    }

    public SqlPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), SqlPo::getStatus, getStatus());
        return this;
    }

    public SqlPo selectSortCode() {
        this.queryWrapper.lambda().select(SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), SqlPo::getSortCode, getSortCode());
        return this;
    }

    public SqlPo selectCreatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public SqlPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public SqlPo selectSqlCode() {
        this.queryWrapper.lambda().select(SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo inSqlCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlCode, valueList);
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo selectSqlName() {
        this.queryWrapper.lambda().select(SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo inSqlName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlName, valueList);
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo selectSqlStr() {
        this.queryWrapper.lambda().select(SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo inSqlStr(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlStr, valueList);
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo selectSqlType() {
        this.queryWrapper.lambda().select(SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo inSqlType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlType, valueList);
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo selectId() {
        this.queryWrapper.lambda().select(SqlPo::getId);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getId, valueList);
        return this;
    }

    public SqlPo selectCreatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedBy);
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedBy);
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo selectStatus() {
        this.queryWrapper.lambda().select(SqlPo::getStatus);
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), SqlPo::getStatus, getStatus());
        return this;
    }

    public SqlPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), SqlPo::getStatus, getStatus());
        return this;
    }

    public SqlPo selectSortCode() {
        this.queryWrapper.lambda().select(SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), SqlPo::getSortCode, getSortCode());
        return this;
    }

    public SqlPo selectCreatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public SqlPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public SqlPo selectSqlCode() {
        this.queryWrapper.lambda().select(SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo inSqlCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlCode, valueList);
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo selectSqlName() {
        this.queryWrapper.lambda().select(SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo inSqlName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlName, valueList);
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo selectSqlStr() {
        this.queryWrapper.lambda().select(SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo inSqlStr(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlStr, valueList);
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo selectSqlType() {
        this.queryWrapper.lambda().select(SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo inSqlType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlType, valueList);
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo selectId() {
        this.queryWrapper.lambda().select(SqlPo::getId);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getId, valueList);
        return this;
    }

    public SqlPo selectCreatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedBy);
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedBy);
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo selectStatus() {
        this.queryWrapper.lambda().select(SqlPo::getStatus);
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), SqlPo::getStatus, getStatus());
        return this;
    }

    public SqlPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), SqlPo::getStatus, getStatus());
        return this;
    }

    public SqlPo selectSortCode() {
        this.queryWrapper.lambda().select(SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), SqlPo::getSortCode, getSortCode());
        return this;
    }

    public SqlPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), SqlPo::getSortCode, getSortCode());
        return this;
    }

    public SqlPo selectCreatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
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
@TableName("t_sql")
@SuppressWarnings("unused")
public class SqlPo extends BasePoBean<SqlPo> {

    public static final String PO = "Sql";

    @TableField("sql_code")
    private String sqlCode;

    @TableField("sql_name")
    private String sqlName;

    @TableField("sql_str")
    private String sqlStr;

    @TableField("sql_type")
    private String sqlType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<SqlPo> queryWrapper = new QueryWrapper<>();

    public SqlPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public SqlPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public SqlPo selectSqlCode() {
        this.queryWrapper.lambda().select(SqlPo::getSqlCode);
        return this;
    }

    public SqlPo eqSqlCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo eqSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo inSqlCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlCode, valueList);
        return this;
    }

    public SqlPo likeSqlCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo likeSqlCode(String value) {
        this.setSqlCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlCode()), SqlPo::getSqlCode, getSqlCode());
        return this;
    }

    public SqlPo orderBySqlCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo orderBySqlCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlCode);
        return this;
    }

    public SqlPo selectSqlName() {
        this.queryWrapper.lambda().select(SqlPo::getSqlName);
        return this;
    }

    public SqlPo eqSqlName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo eqSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo inSqlName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlName, valueList);
        return this;
    }

    public SqlPo likeSqlName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo likeSqlName(String value) {
        this.setSqlName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlName()), SqlPo::getSqlName, getSqlName());
        return this;
    }

    public SqlPo orderBySqlName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlName);
        return this;
    }

    public SqlPo orderBySqlNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlName);
        return this;
    }

    public SqlPo selectSqlStr() {
        this.queryWrapper.lambda().select(SqlPo::getSqlStr);
        return this;
    }

    public SqlPo eqSqlStr() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo eqSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo inSqlStr(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlStr, valueList);
        return this;
    }

    public SqlPo likeSqlStr() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo likeSqlStr(String value) {
        this.setSqlStr(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlStr()), SqlPo::getSqlStr, getSqlStr());
        return this;
    }

    public SqlPo orderBySqlStr(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo orderBySqlStrDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlStr);
        return this;
    }

    public SqlPo selectSqlType() {
        this.queryWrapper.lambda().select(SqlPo::getSqlType);
        return this;
    }

    public SqlPo eqSqlType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo eqSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo inSqlType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getSqlType, valueList);
        return this;
    }

    public SqlPo likeSqlType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo likeSqlType(String value) {
        this.setSqlType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getSqlType()), SqlPo::getSqlType, getSqlType());
        return this;
    }

    public SqlPo orderBySqlType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, SqlPo::getSqlType);
        return this;
    }

    public SqlPo orderBySqlTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, SqlPo::getSqlType);
        return this;
    }

    public SqlPo selectId() {
        this.queryWrapper.lambda().select(SqlPo::getId);
        return this;
    }

    public SqlPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), SqlPo::getId, getId());
        return this;
    }

    public SqlPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), SqlPo::getId, valueList);
        return this;
    }

    public SqlPo selectCreatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedBy);
        return this;
    }

    public SqlPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), SqlPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public SqlPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedBy);
        return this;
    }

    public SqlPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), SqlPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public SqlPo selectStatus() {
        this.queryWrapper.lambda().select(SqlPo::getStatus);
        return this;
    }

    public SqlPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), SqlPo::getStatus, getStatus());
        return this;
    }

    public SqlPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), SqlPo::getStatus, getStatus());
        return this;
    }

    public SqlPo selectSortCode() {
        this.queryWrapper.lambda().select(SqlPo::getSortCode);
        return this;
    }

    public SqlPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getSortCode);
        return this;
    }

    public SqlPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), SqlPo::getSortCode, getSortCode());
        return this;
    }

    public SqlPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), SqlPo::getSortCode, getSortCode());
        return this;
    }

    public SqlPo selectCreatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getCreatedDate);
        return this;
    }

    public SqlPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, SqlPo::getUpdatedDate);
        return this;
    }

    public SqlPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

