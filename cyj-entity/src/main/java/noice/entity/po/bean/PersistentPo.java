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
@TableName("t_persistent")
@SuppressWarnings("unused")
public class PersistentPo extends BasePoBean<PersistentPo> {

    public static final String PO = "Persistent";

    @TableField("app_service_id")
    private String appServiceId;

    @TableField("persistent_cascade")
    private boolean persistentCascade;

    @TableField("persistent_code")
    private String persistentCode;

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_name")
    private String persistentName;

    @TableField("persistent_type")
    private String persistentType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentPo> queryWrapper = new QueryWrapper<>();

    public PersistentPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentPo selectAppServiceId() {
        this.queryWrapper.lambda().select(PersistentPo::getAppServiceId);
        return this;
    }

    public PersistentPo eqAppServiceId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceId()), PersistentPo::getAppServiceId, getAppServiceId());
        return this;
    }

    public PersistentPo eqAppServiceId(String value) {
        this.setAppServiceId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAppServiceId()), PersistentPo::getAppServiceId, getAppServiceId());
        return this;
    }

    public PersistentPo inAppServiceId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPo::getAppServiceId, valueList);
        return this;
    }

    public PersistentPo orderByAppServiceId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPo::getAppServiceId);
        return this;
    }

    public PersistentPo selectPersistentCascade() {
        this.queryWrapper.lambda().select(PersistentPo::isPersistentCascade);
        return this;
    }

    public PersistentPo eqPersistentCascade() {
        this.queryWrapper.lambda().eq(PersistentPo::isPersistentCascade, isPersistentCascade());
        return this;
    }

    public PersistentPo eqPersistentCascade(boolean value) {
        this.setPersistentCascade(value);
        this.queryWrapper.lambda().eq(PersistentPo::isPersistentCascade, isPersistentCascade());
        return this;
    }

    public PersistentPo selectPersistentCode() {
        this.queryWrapper.lambda().select(PersistentPo::getPersistentCode);
        return this;
    }

    public PersistentPo eqPersistentCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentCode()), PersistentPo::getPersistentCode, getPersistentCode());
        return this;
    }

    public PersistentPo eqPersistentCode(String value) {
        this.setPersistentCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentCode()), PersistentPo::getPersistentCode, getPersistentCode());
        return this;
    }

    public PersistentPo inPersistentCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPo::getPersistentCode, valueList);
        return this;
    }

    public PersistentPo likePersistentCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentCode()), PersistentPo::getPersistentCode, getPersistentCode());
        return this;
    }

    public PersistentPo likePersistentCode(String value) {
        this.setPersistentCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentCode()), PersistentPo::getPersistentCode, getPersistentCode());
        return this;
    }

    public PersistentPo orderByPersistentCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPo::getPersistentCode);
        return this;
    }

    public PersistentPo orderByPersistentCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPo::getPersistentCode);
        return this;
    }

    public PersistentPo orderByPersistentCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPo::getPersistentCode);
        return this;
    }

    public PersistentPo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentPo::getPersistentId);
        return this;
    }

    public PersistentPo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentPo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentPo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPo::getPersistentId, valueList);
        return this;
    }

    public PersistentPo orderByPersistentId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPo::getPersistentId);
        return this;
    }

    public PersistentPo selectPersistentName() {
        this.queryWrapper.lambda().select(PersistentPo::getPersistentName);
        return this;
    }

    public PersistentPo eqPersistentName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentName()), PersistentPo::getPersistentName, getPersistentName());
        return this;
    }

    public PersistentPo eqPersistentName(String value) {
        this.setPersistentName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentName()), PersistentPo::getPersistentName, getPersistentName());
        return this;
    }

    public PersistentPo inPersistentName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPo::getPersistentName, valueList);
        return this;
    }

    public PersistentPo likePersistentName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentName()), PersistentPo::getPersistentName, getPersistentName());
        return this;
    }

    public PersistentPo likePersistentName(String value) {
        this.setPersistentName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentName()), PersistentPo::getPersistentName, getPersistentName());
        return this;
    }

    public PersistentPo orderByPersistentName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPo::getPersistentName);
        return this;
    }

    public PersistentPo orderByPersistentNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPo::getPersistentName);
        return this;
    }

    public PersistentPo orderByPersistentNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPo::getPersistentName);
        return this;
    }

    public PersistentPo selectPersistentType() {
        this.queryWrapper.lambda().select(PersistentPo::getPersistentType);
        return this;
    }

    public PersistentPo eqPersistentType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentType()), PersistentPo::getPersistentType, getPersistentType());
        return this;
    }

    public PersistentPo eqPersistentType(String value) {
        this.setPersistentType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentType()), PersistentPo::getPersistentType, getPersistentType());
        return this;
    }

    public PersistentPo inPersistentType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPo::getPersistentType, valueList);
        return this;
    }

    public PersistentPo likePersistentType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentType()), PersistentPo::getPersistentType, getPersistentType());
        return this;
    }

    public PersistentPo likePersistentType(String value) {
        this.setPersistentType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentType()), PersistentPo::getPersistentType, getPersistentType());
        return this;
    }

    public PersistentPo orderByPersistentType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPo::getPersistentType);
        return this;
    }

    public PersistentPo orderByPersistentTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentPo::getPersistentType);
        return this;
    }

    public PersistentPo orderByPersistentTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentPo::getPersistentType);
        return this;
    }

    public PersistentPo selectId() {
        this.queryWrapper.lambda().select(PersistentPo::getId);
        return this;
    }

    public PersistentPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPo::getId, getId());
        return this;
    }

    public PersistentPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentPo::getId, getId());
        return this;
    }

    public PersistentPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentPo::getId, valueList);
        return this;
    }

    public PersistentPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentPo::getCreatedBy);
        return this;
    }

    public PersistentPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentPo::getUpdatedBy);
        return this;
    }

    public PersistentPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentPo::getStatus);
        return this;
    }

    public PersistentPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPo::getStatus, getStatus());
        return this;
    }

    public PersistentPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentPo::getStatus, getStatus());
        return this;
    }

    public PersistentPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentPo::getSortCode);
        return this;
    }

    public PersistentPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPo::getSortCode);
        return this;
    }

    public PersistentPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentPo::getCreatedDate);
        return this;
    }

    public PersistentPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPo::getCreatedDate);
        return this;
    }

    public PersistentPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentPo::getUpdatedDate);
        return this;
    }

    public PersistentPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentPo::getUpdatedDate);
        return this;
    }

    public PersistentPo eqAuto() {
        return this.eqAppServiceId().eqPersistentCascade().eqPersistentCode().eqPersistentId().eqPersistentName().eqPersistentType();
    }

    public PersistentPo likeAuto() {
        return this.eqAppServiceId().likePersistentCode().eqPersistentId().likePersistentName().likePersistentType();
    }

    public PersistentPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderByAppServiceId(true).orderByPersistentId(true).orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}