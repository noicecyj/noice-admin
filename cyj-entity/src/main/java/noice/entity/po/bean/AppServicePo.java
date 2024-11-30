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
        return this.eqAppServiceApi().eqAppServiceCode().eqAppServiceName().eqAppServicePath().eqAppServicePort().eqAppServiceTruePath();
    }

    public AppServicePo likeAuto() {
        return this.likeAppServiceApi().likeAppServiceCode().likeAppServiceName().likeAppServicePath().likeAppServicePort().likeAppServiceTruePath();
    }

    public AppServicePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}