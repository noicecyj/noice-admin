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
@TableName("t_persistent_table")
@SuppressWarnings("unused")
public class PersistentTablePo extends BasePoBean<PersistentTablePo> {

    public static final String PO = "PersistentTable";

    @TableField("persistent_id")
    private String persistentId;

    @TableField("persistent_table_code")
    private String persistentTableCode;

    @TableField("persistent_table_name")
    private String persistentTableName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<PersistentTablePo> queryWrapper = new QueryWrapper<>();

    public PersistentTablePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public PersistentTablePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public PersistentTablePo selectPersistentId() {
        this.queryWrapper.lambda().select(PersistentTablePo::getPersistentId);
        return this;
    }

    public PersistentTablePo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentTablePo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentTablePo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), PersistentTablePo::getPersistentId, getPersistentId());
        return this;
    }

    public PersistentTablePo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTablePo::getPersistentId, valueList);
        return this;
    }

    public PersistentTablePo orderByPersistentId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTablePo::getPersistentId);
        return this;
    }

    public PersistentTablePo selectPersistentTableCode() {
        this.queryWrapper.lambda().select(PersistentTablePo::getPersistentTableCode);
        return this;
    }

    public PersistentTablePo eqPersistentTableCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableCode()), PersistentTablePo::getPersistentTableCode, getPersistentTableCode());
        return this;
    }

    public PersistentTablePo eqPersistentTableCode(String value) {
        this.setPersistentTableCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableCode()), PersistentTablePo::getPersistentTableCode, getPersistentTableCode());
        return this;
    }

    public PersistentTablePo inPersistentTableCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTablePo::getPersistentTableCode, valueList);
        return this;
    }

    public PersistentTablePo likePersistentTableCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableCode()), PersistentTablePo::getPersistentTableCode, getPersistentTableCode());
        return this;
    }

    public PersistentTablePo likePersistentTableCode(String value) {
        this.setPersistentTableCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableCode()), PersistentTablePo::getPersistentTableCode, getPersistentTableCode());
        return this;
    }

    public PersistentTablePo orderByPersistentTableCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTablePo::getPersistentTableCode);
        return this;
    }

    public PersistentTablePo orderByPersistentTableCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTablePo::getPersistentTableCode);
        return this;
    }

    public PersistentTablePo orderByPersistentTableCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTablePo::getPersistentTableCode);
        return this;
    }

    public PersistentTablePo selectPersistentTableName() {
        this.queryWrapper.lambda().select(PersistentTablePo::getPersistentTableName);
        return this;
    }

    public PersistentTablePo eqPersistentTableName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableName()), PersistentTablePo::getPersistentTableName, getPersistentTableName());
        return this;
    }

    public PersistentTablePo eqPersistentTableName(String value) {
        this.setPersistentTableName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentTableName()), PersistentTablePo::getPersistentTableName, getPersistentTableName());
        return this;
    }

    public PersistentTablePo inPersistentTableName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTablePo::getPersistentTableName, valueList);
        return this;
    }

    public PersistentTablePo likePersistentTableName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableName()), PersistentTablePo::getPersistentTableName, getPersistentTableName());
        return this;
    }

    public PersistentTablePo likePersistentTableName(String value) {
        this.setPersistentTableName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getPersistentTableName()), PersistentTablePo::getPersistentTableName, getPersistentTableName());
        return this;
    }

    public PersistentTablePo orderByPersistentTableName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTablePo::getPersistentTableName);
        return this;
    }

    public PersistentTablePo orderByPersistentTableNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, PersistentTablePo::getPersistentTableName);
        return this;
    }

    public PersistentTablePo orderByPersistentTableNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, PersistentTablePo::getPersistentTableName);
        return this;
    }

    public PersistentTablePo selectId() {
        this.queryWrapper.lambda().select(PersistentTablePo::getId);
        return this;
    }

    public PersistentTablePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTablePo::getId, getId());
        return this;
    }

    public PersistentTablePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), PersistentTablePo::getId, getId());
        return this;
    }

    public PersistentTablePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), PersistentTablePo::getId, valueList);
        return this;
    }

    public PersistentTablePo selectCreatedBy() {
        this.queryWrapper.lambda().select(PersistentTablePo::getCreatedBy);
        return this;
    }

    public PersistentTablePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTablePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTablePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), PersistentTablePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public PersistentTablePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(PersistentTablePo::getUpdatedBy);
        return this;
    }

    public PersistentTablePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTablePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTablePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), PersistentTablePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public PersistentTablePo selectStatus() {
        this.queryWrapper.lambda().select(PersistentTablePo::getStatus);
        return this;
    }

    public PersistentTablePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTablePo::getStatus, getStatus());
        return this;
    }

    public PersistentTablePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), PersistentTablePo::getStatus, getStatus());
        return this;
    }

    public PersistentTablePo selectSortCode() {
        this.queryWrapper.lambda().select(PersistentTablePo::getSortCode);
        return this;
    }

    public PersistentTablePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTablePo::getSortCode);
        return this;
    }

    public PersistentTablePo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTablePo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTablePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), PersistentTablePo::getSortCode, getSortCode());
        return this;
    }

    public PersistentTablePo selectCreatedDate() {
        this.queryWrapper.lambda().select(PersistentTablePo::getCreatedDate);
        return this;
    }

    public PersistentTablePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTablePo::getCreatedDate);
        return this;
    }

    public PersistentTablePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(PersistentTablePo::getUpdatedDate);
        return this;
    }

    public PersistentTablePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, PersistentTablePo::getUpdatedDate);
        return this;
    }

    public PersistentTablePo eqAuto() {
        return this.eqPersistentId().eqPersistentTableCode().eqPersistentTableName();
    }

    public PersistentTablePo likeAuto() {
        return this.eqPersistentId().likePersistentTableCode().likePersistentTableName();
    }

    public PersistentTablePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderByPersistentId(true).orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}