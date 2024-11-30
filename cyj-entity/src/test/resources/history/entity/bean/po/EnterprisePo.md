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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<noice.entity.po.bean.EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.EnterprisePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.bean.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.bean.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.bean.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.bean.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.EnterprisePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.EnterprisePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<noice.entity.po.bean.EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.EnterprisePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.bean.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.bean.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.bean.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.bean.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.EnterprisePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.EnterprisePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<noice.entity.po.bean.EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.EnterprisePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.bean.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.bean.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.bean.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.bean.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.EnterprisePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.EnterprisePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<noice.entity.po.bean.EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.EnterprisePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.bean.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.bean.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.bean.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.bean.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.EnterprisePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.EnterprisePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<noice.entity.po.EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.EnterprisePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.EnterprisePo::getId, getId());
        return this;
    }

    public noice.entity.po.EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.EnterprisePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<noice.entity.po.EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.EnterprisePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getId);
        return this;
    }

    public noice.entity.po.EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.EnterprisePo::getId, getId());
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::isStatus);
        return this;
    }

    public noice.entity.po.EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.EnterprisePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<noice.entity.po.EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.EnterprisePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getId);
        return this;
    }

    public noice.entity.po.EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.EnterprisePo::getId, getId());
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::isStatus);
        return this;
    }

    public noice.entity.po.EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.EnterprisePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<noice.entity.po.EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.EnterprisePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getId);
        return this;
    }

    public noice.entity.po.EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.EnterprisePo::getId, getId());
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::isStatus);
        return this;
    }

    public noice.entity.po.EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.EnterprisePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<noice.entity.po.EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.EnterprisePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getId);
        return this;
    }

    public noice.entity.po.EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.EnterprisePo::getId, getId());
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::isStatus);
        return this;
    }

    public noice.entity.po.EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.EnterprisePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<noice.entity.po.EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.EnterprisePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getId);
        return this;
    }

    public noice.entity.po.EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.EnterprisePo::getId, getId());
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::isStatus);
        return this;
    }

    public noice.entity.po.EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.EnterprisePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<noice.entity.po.EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.EnterprisePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), noice.entity.po.EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), noice.entity.po.EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.EnterprisePo::getEnterpriseName);
        return this;
    }

    public noice.entity.po.EnterprisePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getId);
        return this;
    }

    public noice.entity.po.EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.EnterprisePo::getId, getId());
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::isStatus);
        return this;
    }

    public noice.entity.po.EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.EnterprisePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getSortCode);
        return this;
    }

    public noice.entity.po.EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.EnterprisePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.EnterprisePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-12 10:57:44 noice 作者大大 曹元杰 天才 笔记本

```java
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<EnterprisePo> queryWrapper = new QueryWrapper<>();

    public EnterprisePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public EnterprisePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo selectId() {
        this.queryWrapper.lambda().select(EnterprisePo::getId);
        return this;
    }

    public EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedBy);
        return this;
    }

    public EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedBy);
        return this;
    }

    public EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(EnterprisePo::isStatus);
        return this;
    }

    public EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(EnterprisePo::isStatus, isStatus());
        return this;
    }

    public EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<EnterprisePo> queryWrapper = new QueryWrapper<>();

    public EnterprisePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public EnterprisePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo inEnterpriseCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseCode, valueList);
        return this;
    }

    public EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo inEnterpriseName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseName, valueList);
        return this;
    }

    public EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo selectId() {
        this.queryWrapper.lambda().select(EnterprisePo::getId);
        return this;
    }

    public EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedBy);
        return this;
    }

    public EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedBy);
        return this;
    }

    public EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(EnterprisePo::isStatus);
        return this;
    }

    public EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(EnterprisePo::isStatus, isStatus());
        return this;
    }

    public EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<EnterprisePo> queryWrapper = new QueryWrapper<>();

    public EnterprisePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public EnterprisePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo inEnterpriseCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseCode, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo inEnterpriseName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseName, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo selectId() {
        this.queryWrapper.lambda().select(EnterprisePo::getId);
        return this;
    }

    public EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedBy);
        return this;
    }

    public EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedBy);
        return this;
    }

    public EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(EnterprisePo::isStatus);
        return this;
    }

    public EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(EnterprisePo::isStatus, isStatus());
        return this;
    }

    public EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-22 22:00:53 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<EnterprisePo> queryWrapper = new QueryWrapper<>();

    public EnterprisePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public EnterprisePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo inEnterpriseCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseCode, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo inEnterpriseName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseName, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo selectId() {
        this.queryWrapper.lambda().select(EnterprisePo::getId);
        return this;
    }

    public EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getId, valueList);
        return this;
    }

    public EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedBy);
        return this;
    }

    public EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedBy);
        return this;
    }

    public EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(EnterprisePo::isStatus);
        return this;
    }

    public EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(EnterprisePo::isStatus, isStatus());
        return this;
    }

    public EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
## 2024-10-11 18:47:40 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<EnterprisePo> queryWrapper = new QueryWrapper<>();

    public EnterprisePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public EnterprisePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo inEnterpriseCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseCode, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo inEnterpriseName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseName, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo selectId() {
        this.queryWrapper.lambda().select(EnterprisePo::getId);
        return this;
    }

    public EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getId, valueList);
        return this;
    }

    public EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedBy);
        return this;
    }

    public EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedBy);
        return this;
    }

    public EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(EnterprisePo::getStatus);
        return this;
    }

    public EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(EnterprisePo::getStatus, getStatus());
        return this;
    }

    public EnterprisePo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(EnterprisePo::getStatus, getStatus());
        return this;
    }

    public EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(EnterprisePo::getSortCode, getSortCode());
        return this;
    }

    public EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:45 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<EnterprisePo> queryWrapper = new QueryWrapper<>();

    public EnterprisePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public EnterprisePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo inEnterpriseCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseCode, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo inEnterpriseName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseName, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo selectId() {
        this.queryWrapper.lambda().select(EnterprisePo::getId);
        return this;
    }

    public EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getId, valueList);
        return this;
    }

    public EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedBy);
        return this;
    }

    public EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedBy);
        return this;
    }

    public EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(EnterprisePo::getStatus);
        return this;
    }

    public EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), EnterprisePo::getStatus, getStatus());
        return this;
    }

    public EnterprisePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), EnterprisePo::getStatus, getStatus());
        return this;
    }

    public EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), EnterprisePo::getSortCode, getSortCode());
        return this;
    }

    public EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:01:12 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<EnterprisePo> queryWrapper = new QueryWrapper<>();

    public EnterprisePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public EnterprisePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo inEnterpriseCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseCode, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo inEnterpriseName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseName, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo selectId() {
        this.queryWrapper.lambda().select(EnterprisePo::getId);
        return this;
    }

    public EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getId, valueList);
        return this;
    }

    public EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedBy);
        return this;
    }

    public EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedBy);
        return this;
    }

    public EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(EnterprisePo::getStatus);
        return this;
    }

    public EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), EnterprisePo::getStatus, getStatus());
        return this;
    }

    public EnterprisePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), EnterprisePo::getStatus, getStatus());
        return this;
    }

    public EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), EnterprisePo::getSortCode, getSortCode());
        return this;
    }

    public EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:38 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<EnterprisePo> queryWrapper = new QueryWrapper<>();

    public EnterprisePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public EnterprisePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo inEnterpriseCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseCode, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo inEnterpriseName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseName, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo selectId() {
        this.queryWrapper.lambda().select(EnterprisePo::getId);
        return this;
    }

    public EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getId, valueList);
        return this;
    }

    public EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedBy);
        return this;
    }

    public EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedBy);
        return this;
    }

    public EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(EnterprisePo::getStatus);
        return this;
    }

    public EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), EnterprisePo::getStatus, getStatus());
        return this;
    }

    public EnterprisePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), EnterprisePo::getStatus, getStatus());
        return this;
    }

    public EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), EnterprisePo::getSortCode, getSortCode());
        return this;
    }

    public EnterprisePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), EnterprisePo::getSortCode, getSortCode());
        return this;
    }

    public EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo baseQueryWrapper() {
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
@TableName("t_enterprise")
@SuppressWarnings("unused")
public class EnterprisePo extends BasePoBean<EnterprisePo> {

    public static final String PO = "Enterprise";

    @TableField("enterprise_code")
    private String enterpriseCode;

    @TableField("enterprise_name")
    private String enterpriseName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<EnterprisePo> queryWrapper = new QueryWrapper<>();

    public EnterprisePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public EnterprisePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public EnterprisePo selectEnterpriseCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo eqEnterpriseCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo eqEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo inEnterpriseCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseCode, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo likeEnterpriseCode(String value) {
        this.setEnterpriseCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseCode()), EnterprisePo::getEnterpriseCode, getEnterpriseCode());
        return this;
    }

    public EnterprisePo orderByEnterpriseCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo orderByEnterpriseCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseCode);
        return this;
    }

    public EnterprisePo selectEnterpriseName() {
        this.queryWrapper.lambda().select(EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo eqEnterpriseName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo eqEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo inEnterpriseName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getEnterpriseName, valueList);
        return this;
    }

    public EnterprisePo likeEnterpriseName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo likeEnterpriseName(String value) {
        this.setEnterpriseName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getEnterpriseName()), EnterprisePo::getEnterpriseName, getEnterpriseName());
        return this;
    }

    public EnterprisePo orderByEnterpriseName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo orderByEnterpriseNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, EnterprisePo::getEnterpriseName);
        return this;
    }

    public EnterprisePo selectId() {
        this.queryWrapper.lambda().select(EnterprisePo::getId);
        return this;
    }

    public EnterprisePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), EnterprisePo::getId, getId());
        return this;
    }

    public EnterprisePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), EnterprisePo::getId, valueList);
        return this;
    }

    public EnterprisePo selectCreatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedBy);
        return this;
    }

    public EnterprisePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), EnterprisePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public EnterprisePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedBy);
        return this;
    }

    public EnterprisePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), EnterprisePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public EnterprisePo selectStatus() {
        this.queryWrapper.lambda().select(EnterprisePo::getStatus);
        return this;
    }

    public EnterprisePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), EnterprisePo::getStatus, getStatus());
        return this;
    }

    public EnterprisePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), EnterprisePo::getStatus, getStatus());
        return this;
    }

    public EnterprisePo selectSortCode() {
        this.queryWrapper.lambda().select(EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getSortCode);
        return this;
    }

    public EnterprisePo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), EnterprisePo::getSortCode, getSortCode());
        return this;
    }

    public EnterprisePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), EnterprisePo::getSortCode, getSortCode());
        return this;
    }

    public EnterprisePo selectCreatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getCreatedDate);
        return this;
    }

    public EnterprisePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, EnterprisePo::getUpdatedDate);
        return this;
    }

    public EnterprisePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

