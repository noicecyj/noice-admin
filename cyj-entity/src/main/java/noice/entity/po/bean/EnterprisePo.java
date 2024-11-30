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

    public EnterprisePo eqAuto() {
        return this.eqEnterpriseCode().eqEnterpriseName();
    }

    public EnterprisePo likeAuto() {
        return this.likeEnterpriseCode().likeEnterpriseName();
    }

    public EnterprisePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}