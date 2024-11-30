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
@TableName("t_persistent_table_search_config")
@SuppressWarnings("unused")
public class PersistentTableSearchConfigPo extends BasePoBean<PersistentTableSearchConfigPo> {

    public static final String PO = "PersistentTableSearchConfig";

    @TableField("authority_id")
    private String authorityId;

    @TableField("persistent_table_id")
    private String persistentTableId;

    @TableField("persistent_table_search_config_code")
    private String persistentTableSearchConfigCode;

    @TableField("persistent_table_search_config_data_source")
    private String persistentTableSearchConfigDataSource;

    @TableField("persistent_table_search_config_default_value")
    private String persistentTableSearchConfigDefaultValue;

    @TableField("persistent_table_search_config_display")
    private boolean persistentTableSearchConfigDisplay;

    @TableField("persistent_table_search_config_mode")
    private String persistentTableSearchConfigMode;

    @TableField("persistent_table_search_config_name")
    private String persistentTableSearchConfigName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTableSearchConfigPo> queryWrapper = new QueryWrapper<>();

    public PersistentTableSearchConfigPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentTableSearchConfigPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentTableSearchConfigPo selectAuthorityId() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getAuthorityId);
        return this;
    }

    public PersistentTableSearchConfigPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableSearchConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableSearchConfigPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), PersistentTableSearchConfigPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public PersistentTableSearchConfigPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableSearchConfigPo::getAuthorityId, valueList);
        return this;
    }

    public PersistentTableSearchConfigPo selectPersistentTableId() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getPersistentTableId);
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableSearchConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableId(String value) {
        this.setPersistentTableId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableId()), PersistentTableSearchConfigPo::getPersistentTableId, getPersistentTableId());
        return this;
    }

    public PersistentTableSearchConfigPo inPersistentTableId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableSearchConfigPo::getPersistentTableId, valueList);
        return this;
    }

    public PersistentTableSearchConfigPo selectPersistentTableSearchConfigCode() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getPersistentTableSearchConfigCode);
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableSearchConfigCode()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigCode, getPersistentTableSearchConfigCode());
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigCode(String value) {
        this.setPersistentTableSearchConfigCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableSearchConfigCode()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigCode, getPersistentTableSearchConfigCode());
        return this;
    }

    public PersistentTableSearchConfigPo inPersistentTableSearchConfigCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableSearchConfigPo::getPersistentTableSearchConfigCode, valueList);
        return this;
    }

    public PersistentTableSearchConfigPo likePersistentTableSearchConfigCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableSearchConfigCode()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigCode, getPersistentTableSearchConfigCode());
        return this;
    }

    public PersistentTableSearchConfigPo likePersistentTableSearchConfigCode(String value) {
        this.setPersistentTableSearchConfigCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableSearchConfigCode()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigCode, getPersistentTableSearchConfigCode());
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableSearchConfigPo::getPersistentTableSearchConfigCode);
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableSearchConfigPo::getPersistentTableSearchConfigCode);
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableSearchConfigPo::getPersistentTableSearchConfigCode);
        return this;
    }

    public PersistentTableSearchConfigPo selectPersistentTableSearchConfigDataSource() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getPersistentTableSearchConfigDataSource);
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigDataSource() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableSearchConfigDataSource()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigDataSource, getPersistentTableSearchConfigDataSource());
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigDataSource(String value) {
        this.setPersistentTableSearchConfigDataSource(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableSearchConfigDataSource()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigDataSource, getPersistentTableSearchConfigDataSource());
        return this;
    }

    public PersistentTableSearchConfigPo inPersistentTableSearchConfigDataSource(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableSearchConfigPo::getPersistentTableSearchConfigDataSource, valueList);
        return this;
    }

    public PersistentTableSearchConfigPo likePersistentTableSearchConfigDataSource() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableSearchConfigDataSource()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigDataSource, getPersistentTableSearchConfigDataSource());
        return this;
    }

    public PersistentTableSearchConfigPo likePersistentTableSearchConfigDataSource(String value) {
        this.setPersistentTableSearchConfigDataSource(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableSearchConfigDataSource()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigDataSource, getPersistentTableSearchConfigDataSource());
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigDataSource(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableSearchConfigPo::getPersistentTableSearchConfigDataSource);
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigDataSourceAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableSearchConfigPo::getPersistentTableSearchConfigDataSource);
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigDataSourceDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableSearchConfigPo::getPersistentTableSearchConfigDataSource);
        return this;
    }

    public PersistentTableSearchConfigPo selectPersistentTableSearchConfigDefaultValue() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getPersistentTableSearchConfigDefaultValue);
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigDefaultValue() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableSearchConfigDefaultValue()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigDefaultValue, getPersistentTableSearchConfigDefaultValue());
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigDefaultValue(String value) {
        this.setPersistentTableSearchConfigDefaultValue(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableSearchConfigDefaultValue()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigDefaultValue, getPersistentTableSearchConfigDefaultValue());
        return this;
    }

    public PersistentTableSearchConfigPo inPersistentTableSearchConfigDefaultValue(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableSearchConfigPo::getPersistentTableSearchConfigDefaultValue, valueList);
        return this;
    }

    public PersistentTableSearchConfigPo likePersistentTableSearchConfigDefaultValue() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableSearchConfigDefaultValue()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigDefaultValue, getPersistentTableSearchConfigDefaultValue());
        return this;
    }

    public PersistentTableSearchConfigPo likePersistentTableSearchConfigDefaultValue(String value) {
        this.setPersistentTableSearchConfigDefaultValue(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableSearchConfigDefaultValue()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigDefaultValue, getPersistentTableSearchConfigDefaultValue());
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigDefaultValue(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableSearchConfigPo::getPersistentTableSearchConfigDefaultValue);
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigDefaultValueAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableSearchConfigPo::getPersistentTableSearchConfigDefaultValue);
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigDefaultValueDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableSearchConfigPo::getPersistentTableSearchConfigDefaultValue);
        return this;
    }

    public PersistentTableSearchConfigPo selectPersistentTableSearchConfigDisplay() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::isPersistentTableSearchConfigDisplay);
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigDisplay() {
        this.queryWrapper.lambda().eq(PersistentTableSearchConfigPo::isPersistentTableSearchConfigDisplay, isPersistentTableSearchConfigDisplay());
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigDisplay(boolean value) {
        this.setPersistentTableSearchConfigDisplay(value);
        this.queryWrapper.lambda().eq(PersistentTableSearchConfigPo::isPersistentTableSearchConfigDisplay, isPersistentTableSearchConfigDisplay());
        return this;
    }

    public PersistentTableSearchConfigPo selectPersistentTableSearchConfigMode() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getPersistentTableSearchConfigMode);
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigMode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableSearchConfigMode()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigMode, getPersistentTableSearchConfigMode());
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigMode(String value) {
        this.setPersistentTableSearchConfigMode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableSearchConfigMode()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigMode, getPersistentTableSearchConfigMode());
        return this;
    }

    public PersistentTableSearchConfigPo inPersistentTableSearchConfigMode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableSearchConfigPo::getPersistentTableSearchConfigMode, valueList);
        return this;
    }

    public PersistentTableSearchConfigPo likePersistentTableSearchConfigMode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableSearchConfigMode()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigMode, getPersistentTableSearchConfigMode());
        return this;
    }

    public PersistentTableSearchConfigPo likePersistentTableSearchConfigMode(String value) {
        this.setPersistentTableSearchConfigMode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableSearchConfigMode()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigMode, getPersistentTableSearchConfigMode());
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigMode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableSearchConfigPo::getPersistentTableSearchConfigMode);
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigModeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableSearchConfigPo::getPersistentTableSearchConfigMode);
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigModeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableSearchConfigPo::getPersistentTableSearchConfigMode);
        return this;
    }

    public PersistentTableSearchConfigPo selectPersistentTableSearchConfigName() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getPersistentTableSearchConfigName);
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableSearchConfigName()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigName, getPersistentTableSearchConfigName());
        return this;
    }

    public PersistentTableSearchConfigPo eqPersistentTableSearchConfigName(String value) {
        this.setPersistentTableSearchConfigName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableSearchConfigName()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigName, getPersistentTableSearchConfigName());
        return this;
    }

    public PersistentTableSearchConfigPo inPersistentTableSearchConfigName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableSearchConfigPo::getPersistentTableSearchConfigName, valueList);
        return this;
    }

    public PersistentTableSearchConfigPo likePersistentTableSearchConfigName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableSearchConfigName()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigName, getPersistentTableSearchConfigName());
        return this;
    }

    public PersistentTableSearchConfigPo likePersistentTableSearchConfigName(String value) {
        this.setPersistentTableSearchConfigName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableSearchConfigName()), PersistentTableSearchConfigPo::getPersistentTableSearchConfigName, getPersistentTableSearchConfigName());
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableSearchConfigPo::getPersistentTableSearchConfigName);
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTableSearchConfigPo::getPersistentTableSearchConfigName);
        return this;
    }

    public PersistentTableSearchConfigPo orderByPersistentTableSearchConfigNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTableSearchConfigPo::getPersistentTableSearchConfigName);
        return this;
    }

    public PersistentTableSearchConfigPo selectId() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getId);
        return this;
    }

    public PersistentTableSearchConfigPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableSearchConfigPo::getId, getId());
        return this;
    }

    public PersistentTableSearchConfigPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTableSearchConfigPo::getId, getId());
        return this;
    }

    public PersistentTableSearchConfigPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTableSearchConfigPo::getId, valueList);
        return this;
    }

    public PersistentTableSearchConfigPo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getCreatedBy);
        return this;
    }

    public PersistentTableSearchConfigPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableSearchConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableSearchConfigPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTableSearchConfigPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTableSearchConfigPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getUpdatedBy);
        return this;
    }

    public PersistentTableSearchConfigPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableSearchConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableSearchConfigPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTableSearchConfigPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTableSearchConfigPo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getStatus);
        return this;
    }

    public PersistentTableSearchConfigPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableSearchConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableSearchConfigPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTableSearchConfigPo::getStatus, getStatus());
        return this;
    }

    public PersistentTableSearchConfigPo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getSortCode);
        return this;
    }

    public PersistentTableSearchConfigPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableSearchConfigPo::getSortCode);
        return this;
    }

    public PersistentTableSearchConfigPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTableSearchConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableSearchConfigPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTableSearchConfigPo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTableSearchConfigPo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableSearchConfigPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableSearchConfigPo::getCreatedDate);
        return this;
    }

    public PersistentTableSearchConfigPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTableSearchConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableSearchConfigPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTableSearchConfigPo::getUpdatedDate);
        return this;
    }

    public PersistentTableSearchConfigPo eqAuto() {
        return this.eqAuthorityId().eqPersistentTableId().eqPersistentTableSearchConfigCode().eqPersistentTableSearchConfigDataSource().eqPersistentTableSearchConfigDefaultValue().eqPersistentTableSearchConfigDisplay().eqPersistentTableSearchConfigMode().eqPersistentTableSearchConfigName();
    }

    public PersistentTableSearchConfigPo likeAuto() {
        return this.eqAuthorityId().eqPersistentTableId().likePersistentTableSearchConfigCode().likePersistentTableSearchConfigDataSource().likePersistentTableSearchConfigDefaultValue().likePersistentTableSearchConfigMode().likePersistentTableSearchConfigName();
    }

    public PersistentTableSearchConfigPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}