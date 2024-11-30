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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::isStatus, isStatus());
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::isStatus, isStatus());
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::isStatus, isStatus());
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::isStatus, isStatus());
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::isStatus, isStatus());
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo selectWorkFlowCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo selectWorkFlowName() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo selectId() {
        this.queryWrapper.lambda().select(WorkFlowPo::getId);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo selectCreatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedBy);
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedBy);
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo selectStatus() {
        this.queryWrapper.lambda().select(WorkFlowPo::isStatus);
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::isStatus, isStatus());
        return this;
    }

    public WorkFlowPo selectSortCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo selectCreatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo selectWorkFlowCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo selectWorkFlowName() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo selectId() {
        this.queryWrapper.lambda().select(WorkFlowPo::getId);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo selectCreatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedBy);
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedBy);
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo selectStatus() {
        this.queryWrapper.lambda().select(WorkFlowPo::isStatus);
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::isStatus, isStatus());
        return this;
    }

    public WorkFlowPo selectSortCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo selectCreatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo selectWorkFlowCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo selectWorkFlowName() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo selectId() {
        this.queryWrapper.lambda().select(WorkFlowPo::getId);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo selectCreatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedBy);
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedBy);
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo selectStatus() {
        this.queryWrapper.lambda().select(WorkFlowPo::isStatus);
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::isStatus, isStatus());
        return this;
    }

    public WorkFlowPo selectSortCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo selectCreatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo selectWorkFlowCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo selectWorkFlowName() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo selectId() {
        this.queryWrapper.lambda().select(WorkFlowPo::getId);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo selectCreatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedBy);
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedBy);
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo selectStatus() {
        this.queryWrapper.lambda().select(WorkFlowPo::isStatus);
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::isStatus, isStatus());
        return this;
    }

    public WorkFlowPo selectSortCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo selectCreatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo selectWorkFlowCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo selectWorkFlowName() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo selectId() {
        this.queryWrapper.lambda().select(WorkFlowPo::getId);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo selectCreatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedBy);
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedBy);
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo selectStatus() {
        this.queryWrapper.lambda().select(WorkFlowPo::isStatus);
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::isStatus, isStatus());
        return this;
    }

    public WorkFlowPo selectSortCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo selectCreatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo selectWorkFlowCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo selectWorkFlowName() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo selectId() {
        this.queryWrapper.lambda().select(WorkFlowPo::getId);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo selectCreatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedBy);
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedBy);
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo selectStatus() {
        this.queryWrapper.lambda().select(WorkFlowPo::isStatus);
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::isStatus, isStatus());
        return this;
    }

    public WorkFlowPo selectSortCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo selectCreatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-24 00:35:19 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-10-11 18:47:50 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public WorkFlowPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public WorkFlowPo selectWorkFlowCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo inWorkFlowCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getWorkFlowCode, valueList);
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo selectWorkFlowName() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo inWorkFlowName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getWorkFlowName, valueList);
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo selectId() {
        this.queryWrapper.lambda().select(WorkFlowPo::getId);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getId, valueList);
        return this;
    }

    public WorkFlowPo selectCreatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedBy);
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedBy);
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo selectStatus() {
        this.queryWrapper.lambda().select(WorkFlowPo::getStatus);
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(WorkFlowPo::getStatus, getStatus());
        return this;
    }

    public WorkFlowPo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(WorkFlowPo::getStatus, getStatus());
        return this;
    }

    public WorkFlowPo selectSortCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(WorkFlowPo::getSortCode, getSortCode());
        return this;
    }

    public WorkFlowPo selectCreatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:55 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public WorkFlowPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public WorkFlowPo selectWorkFlowCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo inWorkFlowCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getWorkFlowCode, valueList);
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo selectWorkFlowName() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo inWorkFlowName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getWorkFlowName, valueList);
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo selectId() {
        this.queryWrapper.lambda().select(WorkFlowPo::getId);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getId, valueList);
        return this;
    }

    public WorkFlowPo selectCreatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedBy);
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedBy);
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo selectStatus() {
        this.queryWrapper.lambda().select(WorkFlowPo::getStatus);
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), WorkFlowPo::getStatus, getStatus());
        return this;
    }

    public WorkFlowPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), WorkFlowPo::getStatus, getStatus());
        return this;
    }

    public WorkFlowPo selectSortCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), WorkFlowPo::getSortCode, getSortCode());
        return this;
    }

    public WorkFlowPo selectCreatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:01:22 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public WorkFlowPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public WorkFlowPo selectWorkFlowCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo inWorkFlowCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getWorkFlowCode, valueList);
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo selectWorkFlowName() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo inWorkFlowName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getWorkFlowName, valueList);
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo selectId() {
        this.queryWrapper.lambda().select(WorkFlowPo::getId);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getId, valueList);
        return this;
    }

    public WorkFlowPo selectCreatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedBy);
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedBy);
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo selectStatus() {
        this.queryWrapper.lambda().select(WorkFlowPo::getStatus);
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), WorkFlowPo::getStatus, getStatus());
        return this;
    }

    public WorkFlowPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), WorkFlowPo::getStatus, getStatus());
        return this;
    }

    public WorkFlowPo selectSortCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), WorkFlowPo::getSortCode, getSortCode());
        return this;
    }

    public WorkFlowPo selectCreatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:48 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public WorkFlowPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public WorkFlowPo selectWorkFlowCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo inWorkFlowCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getWorkFlowCode, valueList);
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo selectWorkFlowName() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo inWorkFlowName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getWorkFlowName, valueList);
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo selectId() {
        this.queryWrapper.lambda().select(WorkFlowPo::getId);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getId, valueList);
        return this;
    }

    public WorkFlowPo selectCreatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedBy);
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedBy);
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo selectStatus() {
        this.queryWrapper.lambda().select(WorkFlowPo::getStatus);
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), WorkFlowPo::getStatus, getStatus());
        return this;
    }

    public WorkFlowPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), WorkFlowPo::getStatus, getStatus());
        return this;
    }

    public WorkFlowPo selectSortCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), WorkFlowPo::getSortCode, getSortCode());
        return this;
    }

    public WorkFlowPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), WorkFlowPo::getSortCode, getSortCode());
        return this;
    }

    public WorkFlowPo selectCreatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
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
@TableName("t_work_flow")
@SuppressWarnings("unused")
public class WorkFlowPo extends BasePoBean<WorkFlowPo> {

    public static final String PO = "WorkFlow";

    @TableField("work_flow_code")
    private String workFlowCode;

    @TableField("work_flow_name")
    private String workFlowName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<WorkFlowPo> queryWrapper = new QueryWrapper<>();

    public WorkFlowPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public WorkFlowPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public WorkFlowPo selectWorkFlowCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo eqWorkFlowCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo eqWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo inWorkFlowCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getWorkFlowCode, valueList);
        return this;
    }

    public WorkFlowPo likeWorkFlowCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo likeWorkFlowCode(String value) {
        this.setWorkFlowCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowCode()), WorkFlowPo::getWorkFlowCode, getWorkFlowCode());
        return this;
    }

    public WorkFlowPo orderByWorkFlowCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo orderByWorkFlowCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowCode);
        return this;
    }

    public WorkFlowPo selectWorkFlowName() {
        this.queryWrapper.lambda().select(WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo eqWorkFlowName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo eqWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo inWorkFlowName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getWorkFlowName, valueList);
        return this;
    }

    public WorkFlowPo likeWorkFlowName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo likeWorkFlowName(String value) {
        this.setWorkFlowName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getWorkFlowName()), WorkFlowPo::getWorkFlowName, getWorkFlowName());
        return this;
    }

    public WorkFlowPo orderByWorkFlowName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo orderByWorkFlowNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, WorkFlowPo::getWorkFlowName);
        return this;
    }

    public WorkFlowPo selectId() {
        this.queryWrapper.lambda().select(WorkFlowPo::getId);
        return this;
    }

    public WorkFlowPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), WorkFlowPo::getId, getId());
        return this;
    }

    public WorkFlowPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), WorkFlowPo::getId, valueList);
        return this;
    }

    public WorkFlowPo selectCreatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedBy);
        return this;
    }

    public WorkFlowPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), WorkFlowPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public WorkFlowPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedBy);
        return this;
    }

    public WorkFlowPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), WorkFlowPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public WorkFlowPo selectStatus() {
        this.queryWrapper.lambda().select(WorkFlowPo::getStatus);
        return this;
    }

    public WorkFlowPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), WorkFlowPo::getStatus, getStatus());
        return this;
    }

    public WorkFlowPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), WorkFlowPo::getStatus, getStatus());
        return this;
    }

    public WorkFlowPo selectSortCode() {
        this.queryWrapper.lambda().select(WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getSortCode);
        return this;
    }

    public WorkFlowPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), WorkFlowPo::getSortCode, getSortCode());
        return this;
    }

    public WorkFlowPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), WorkFlowPo::getSortCode, getSortCode());
        return this;
    }

    public WorkFlowPo selectCreatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getCreatedDate);
        return this;
    }

    public WorkFlowPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, WorkFlowPo::getUpdatedDate);
        return this;
    }

    public WorkFlowPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

