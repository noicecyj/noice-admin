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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<noice.entity.po.bean.AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AppServicePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AppServicePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AppServicePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<noice.entity.po.bean.AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AppServicePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AppServicePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AppServicePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<noice.entity.po.bean.AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AppServicePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApiSet(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApiSet(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AppServicePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AppServicePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<noice.entity.po.bean.AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AppServicePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AppServicePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AppServicePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<noice.entity.po.bean.AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AppServicePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AppServicePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AppServicePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<noice.entity.po.bean.AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AppServicePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getId);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AppServicePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AppServicePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<noice.entity.po.bean.AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AppServicePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getId);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AppServicePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AppServicePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<noice.entity.po.bean.AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AppServicePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getId);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AppServicePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AppServicePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<noice.entity.po.bean.AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AppServicePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getId);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AppServicePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AppServicePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<noice.entity.po.bean.AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AppServicePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getId);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AppServicePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AppServicePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<noice.entity.po.bean.AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<noice.entity.po.bean.AppServicePo> queryWrapper = new QueryWrapper<>();

    public noice.entity.po.bean.AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceApi()), noice.entity.po.bean.AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceApi);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceCode()), noice.entity.po.bean.AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceName()), noice.entity.po.bean.AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceName);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePath()), noice.entity.po.bean.AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServicePort()), noice.entity.po.bean.AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServicePort);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StringUtils.isNotEmpty(getAppServiceTruePath()), noice.entity.po.bean.AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, noice.entity.po.bean.AppServicePo::getAppServiceTruePath);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectId() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getId);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getId()), noice.entity.po.bean.AppServicePo::getId, getId());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getCreatedBy()), noice.entity.po.bean.AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedBy);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StringUtils.isNotEmpty(getUpdatedBy()), noice.entity.po.bean.AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::isStatus);
        return this;
    }

    public noice.entity.po.bean.AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(noice.entity.po.bean.AppServicePo::isStatus, isStatus());
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getSortCode);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getCreatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, noice.entity.po.bean.AppServicePo::getUpdatedDate);
        return this;
    }

    public noice.entity.po.bean.AppServicePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-18 16:37:31 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AppServicePo> queryWrapper = new QueryWrapper<>();

    public AppServicePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AppServicePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo inAppServiceApi(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceApi, valueList);
        return this;
    }

    public AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo selectId() {
        this.queryWrapper.lambda().select(AppServicePo::getId);
        return this;
    }

    public AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedBy);
        return this;
    }

    public AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedBy);
        return this;
    }

    public AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(AppServicePo::isStatus);
        return this;
    }

    public AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(AppServicePo::isStatus, isStatus());
        return this;
    }

    public AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AppServicePo> queryWrapper = new QueryWrapper<>();

    public AppServicePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AppServicePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo inAppServiceApi(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceApi, valueList);
        return this;
    }

    public AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo inAppServiceCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceCode, valueList);
        return this;
    }

    public AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo inAppServiceName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceName, valueList);
        return this;
    }

    public AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo inAppServicePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePath, valueList);
        return this;
    }

    public AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo inAppServicePort(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePort, valueList);
        return this;
    }

    public AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo inAppServiceTruePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceTruePath, valueList);
        return this;
    }

    public AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo selectId() {
        this.queryWrapper.lambda().select(AppServicePo::getId);
        return this;
    }

    public AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedBy);
        return this;
    }

    public AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedBy);
        return this;
    }

    public AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(AppServicePo::isStatus);
        return this;
    }

    public AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(AppServicePo::isStatus, isStatus());
        return this;
    }

    public AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-19 09:39:28 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AppServicePo> queryWrapper = new QueryWrapper<>();

    public AppServicePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AppServicePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo inAppServiceApi(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceApi, valueList);
        return this;
    }

    public AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo inAppServiceCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceCode, valueList);
        return this;
    }

    public AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo inAppServiceName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceName, valueList);
        return this;
    }

    public AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo inAppServicePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePath, valueList);
        return this;
    }

    public AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo inAppServicePort(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePort, valueList);
        return this;
    }

    public AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo inAppServiceTruePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceTruePath, valueList);
        return this;
    }

    public AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo selectId() {
        this.queryWrapper.lambda().select(AppServicePo::getId);
        return this;
    }

    public AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedBy);
        return this;
    }

    public AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedBy);
        return this;
    }

    public AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(AppServicePo::isStatus);
        return this;
    }

    public AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(AppServicePo::isStatus, isStatus());
        return this;
    }

    public AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-03-22 22:00:48 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AppServicePo> queryWrapper = new QueryWrapper<>();

    public AppServicePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AppServicePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo inAppServiceApi(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceApi, valueList);
        return this;
    }

    public AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo inAppServiceCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceCode, valueList);
        return this;
    }

    public AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo inAppServiceName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceName, valueList);
        return this;
    }

    public AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo inAppServicePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePath, valueList);
        return this;
    }

    public AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo inAppServicePort(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePort, valueList);
        return this;
    }

    public AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo inAppServiceTruePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceTruePath, valueList);
        return this;
    }

    public AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo selectId() {
        this.queryWrapper.lambda().select(AppServicePo::getId);
        return this;
    }

    public AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getId, valueList);
        return this;
    }

    public AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedBy);
        return this;
    }

    public AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedBy);
        return this;
    }

    public AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(AppServicePo::isStatus);
        return this;
    }

    public AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(AppServicePo::isStatus, isStatus());
        return this;
    }

    public AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```
## 2024-10-11 18:47:38 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AppServicePo> queryWrapper = new QueryWrapper<>();

    public AppServicePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AppServicePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo inAppServiceApi(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceApi, valueList);
        return this;
    }

    public AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo inAppServiceCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceCode, valueList);
        return this;
    }

    public AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo inAppServiceName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceName, valueList);
        return this;
    }

    public AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo inAppServicePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePath, valueList);
        return this;
    }

    public AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo inAppServicePort(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePort, valueList);
        return this;
    }

    public AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo inAppServiceTruePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceTruePath, valueList);
        return this;
    }

    public AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo selectId() {
        this.queryWrapper.lambda().select(AppServicePo::getId);
        return this;
    }

    public AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getId, valueList);
        return this;
    }

    public AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedBy);
        return this;
    }

    public AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedBy);
        return this;
    }

    public AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(AppServicePo::getStatus);
        return this;
    }

    public AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(AppServicePo::getStatus, getStatus());
        return this;
    }

    public AppServicePo eqStatus(boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(AppServicePo::getStatus, getStatus());
        return this;
    }

    public AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo eqSortCode(long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(AppServicePo::getSortCode, getSortCode());
        return this;
    }

    public AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-11 19:35:42 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AppServicePo> queryWrapper = new QueryWrapper<>();

    public AppServicePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AppServicePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo inAppServiceApi(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceApi, valueList);
        return this;
    }

    public AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo inAppServiceCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceCode, valueList);
        return this;
    }

    public AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo inAppServiceName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceName, valueList);
        return this;
    }

    public AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo inAppServicePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePath, valueList);
        return this;
    }

    public AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo inAppServicePort(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePort, valueList);
        return this;
    }

    public AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo inAppServiceTruePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceTruePath, valueList);
        return this;
    }

    public AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo selectId() {
        this.queryWrapper.lambda().select(AppServicePo::getId);
        return this;
    }

    public AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getId, valueList);
        return this;
    }

    public AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedBy);
        return this;
    }

    public AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedBy);
        return this;
    }

    public AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(AppServicePo::getStatus);
        return this;
    }

    public AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), AppServicePo::getStatus, getStatus());
        return this;
    }

    public AppServicePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getStatus()), AppServicePo::getStatus, getStatus());
        return this;
    }

    public AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNull(getSortCode()), AppServicePo::getSortCode, getSortCode());
        return this;
    }

    public AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:01:10 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AppServicePo> queryWrapper = new QueryWrapper<>();

    public AppServicePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AppServicePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo inAppServiceApi(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceApi, valueList);
        return this;
    }

    public AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo inAppServiceCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceCode, valueList);
        return this;
    }

    public AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo inAppServiceName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceName, valueList);
        return this;
    }

    public AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo inAppServicePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePath, valueList);
        return this;
    }

    public AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo inAppServicePort(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePort, valueList);
        return this;
    }

    public AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo inAppServiceTruePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceTruePath, valueList);
        return this;
    }

    public AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo selectId() {
        this.queryWrapper.lambda().select(AppServicePo::getId);
        return this;
    }

    public AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getId, valueList);
        return this;
    }

    public AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedBy);
        return this;
    }

    public AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedBy);
        return this;
    }

    public AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(AppServicePo::getStatus);
        return this;
    }

    public AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AppServicePo::getStatus, getStatus());
        return this;
    }

    public AppServicePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AppServicePo::getStatus, getStatus());
        return this;
    }

    public AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AppServicePo::getSortCode, getSortCode());
        return this;
    }

    public AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

## 2024-10-20 20:24:36 noice 作者大大 曹元杰 天才 笔记本

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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AppServicePo> queryWrapper = new QueryWrapper<>();

    public AppServicePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AppServicePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo inAppServiceApi(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceApi, valueList);
        return this;
    }

    public AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo inAppServiceCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceCode, valueList);
        return this;
    }

    public AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo inAppServiceName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceName, valueList);
        return this;
    }

    public AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo inAppServicePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePath, valueList);
        return this;
    }

    public AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo inAppServicePort(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePort, valueList);
        return this;
    }

    public AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo inAppServiceTruePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceTruePath, valueList);
        return this;
    }

    public AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo selectId() {
        this.queryWrapper.lambda().select(AppServicePo::getId);
        return this;
    }

    public AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getId, valueList);
        return this;
    }

    public AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedBy);
        return this;
    }

    public AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedBy);
        return this;
    }

    public AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(AppServicePo::getStatus);
        return this;
    }

    public AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AppServicePo::getStatus, getStatus());
        return this;
    }

    public AppServicePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AppServicePo::getStatus, getStatus());
        return this;
    }

    public AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AppServicePo::getSortCode, getSortCode());
        return this;
    }

    public AppServicePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AppServicePo::getSortCode, getSortCode());
        return this;
    }

    public AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo baseQueryWrapper() {
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
@TableName("t_app_service")
@SuppressWarnings("unused")
public class AppServicePo extends BasePoBean<AppServicePo> {

    public static final String PO = "AppService";

    @TableField("app_service_api")
    private String appServiceApi;

    @TableField("app_service_code")
    private String appServiceCode;

    @TableField("app_service_name")
    private String appServiceName;

    @TableField("app_service_path")
    private String appServicePath;

    @TableField("app_service_port")
    private String appServicePort;

    @TableField("app_service_true_path")
    private String appServiceTruePath;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AppServicePo> queryWrapper = new QueryWrapper<>();

    public AppServicePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AppServicePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AppServicePo selectAppServiceApi() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo eqAppServiceApi() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo eqAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo inAppServiceApi(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceApi, valueList);
        return this;
    }

    public AppServicePo likeAppServiceApi() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo likeAppServiceApi(String value) {
        this.setAppServiceApi(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceApi()), AppServicePo::getAppServiceApi, getAppServiceApi());
        return this;
    }

    public AppServicePo orderByAppServiceApi(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo orderByAppServiceApiDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceApi);
        return this;
    }

    public AppServicePo selectAppServiceCode() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo eqAppServiceCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo eqAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo inAppServiceCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceCode, valueList);
        return this;
    }

    public AppServicePo likeAppServiceCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo likeAppServiceCode(String value) {
        this.setAppServiceCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceCode()), AppServicePo::getAppServiceCode, getAppServiceCode());
        return this;
    }

    public AppServicePo orderByAppServiceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo orderByAppServiceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceCode);
        return this;
    }

    public AppServicePo selectAppServiceName() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo eqAppServiceName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo eqAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo inAppServiceName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceName, valueList);
        return this;
    }

    public AppServicePo likeAppServiceName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo likeAppServiceName(String value) {
        this.setAppServiceName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceName()), AppServicePo::getAppServiceName, getAppServiceName());
        return this;
    }

    public AppServicePo orderByAppServiceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo orderByAppServiceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceName);
        return this;
    }

    public AppServicePo selectAppServicePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo eqAppServicePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo eqAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo inAppServicePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePath, valueList);
        return this;
    }

    public AppServicePo likeAppServicePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo likeAppServicePath(String value) {
        this.setAppServicePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePath()), AppServicePo::getAppServicePath, getAppServicePath());
        return this;
    }

    public AppServicePo orderByAppServicePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo orderByAppServicePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePath);
        return this;
    }

    public AppServicePo selectAppServicePort() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo eqAppServicePort() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo eqAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo inAppServicePort(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServicePort, valueList);
        return this;
    }

    public AppServicePo likeAppServicePort() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo likeAppServicePort(String value) {
        this.setAppServicePort(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServicePort()), AppServicePo::getAppServicePort, getAppServicePort());
        return this;
    }

    public AppServicePo orderByAppServicePort(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo orderByAppServicePortDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServicePort);
        return this;
    }

    public AppServicePo selectAppServiceTruePath() {
        this.queryWrapper.lambda().select(AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo eqAppServiceTruePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo eqAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo inAppServiceTruePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getAppServiceTruePath, valueList);
        return this;
    }

    public AppServicePo likeAppServiceTruePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo likeAppServiceTruePath(String value) {
        this.setAppServiceTruePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAppServiceTruePath()), AppServicePo::getAppServiceTruePath, getAppServiceTruePath());
        return this;
    }

    public AppServicePo orderByAppServiceTruePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo orderByAppServiceTruePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AppServicePo::getAppServiceTruePath);
        return this;
    }

    public AppServicePo selectId() {
        this.queryWrapper.lambda().select(AppServicePo::getId);
        return this;
    }

    public AppServicePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AppServicePo::getId, getId());
        return this;
    }

    public AppServicePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AppServicePo::getId, valueList);
        return this;
    }

    public AppServicePo selectCreatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedBy);
        return this;
    }

    public AppServicePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AppServicePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AppServicePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedBy);
        return this;
    }

    public AppServicePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AppServicePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AppServicePo selectStatus() {
        this.queryWrapper.lambda().select(AppServicePo::getStatus);
        return this;
    }

    public AppServicePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AppServicePo::getStatus, getStatus());
        return this;
    }

    public AppServicePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AppServicePo::getStatus, getStatus());
        return this;
    }

    public AppServicePo selectSortCode() {
        this.queryWrapper.lambda().select(AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getSortCode);
        return this;
    }

    public AppServicePo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AppServicePo::getSortCode, getSortCode());
        return this;
    }

    public AppServicePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AppServicePo::getSortCode, getSortCode());
        return this;
    }

    public AppServicePo selectCreatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getCreatedDate);
        return this;
    }

    public AppServicePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AppServicePo::getUpdatedDate);
        return this;
    }

    public AppServicePo eqAuto() {
        return this.eqAppServiceCode().eqAppServiceName().eqAppServiceApi().eqAppServicePath().eqAppServicePort().eqAppServiceTruePath();
    }

    public AppServicePo likeAuto() {
        return this.likeAppServiceCode().likeAppServiceName().likeAppServiceApi().likeAppServicePath().likeAppServicePort().likeAppServiceTruePath();
    }

    public AppServicePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}
```

