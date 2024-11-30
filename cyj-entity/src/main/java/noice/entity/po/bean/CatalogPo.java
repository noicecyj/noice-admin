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
@TableName("t_catalog")
@SuppressWarnings("unused")
public class CatalogPo extends BasePoBean<CatalogPo> {

    public static final String PO = "Catalog";

    @TableField("catalog_code")
    private String catalogCode;

    @TableField("catalog_name")
    private String catalogName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<CatalogPo> queryWrapper = new QueryWrapper<>();

    public CatalogPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public CatalogPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public CatalogPo selectCatalogCode() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo eqCatalogCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo eqCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo inCatalogCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogCode, valueList);
        return this;
    }

    public CatalogPo likeCatalogCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo likeCatalogCode(String value) {
        this.setCatalogCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogCode()), CatalogPo::getCatalogCode, getCatalogCode());
        return this;
    }

    public CatalogPo orderByCatalogCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo orderByCatalogCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogCode);
        return this;
    }

    public CatalogPo selectCatalogName() {
        this.queryWrapper.lambda().select(CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo eqCatalogName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo eqCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo inCatalogName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getCatalogName, valueList);
        return this;
    }

    public CatalogPo likeCatalogName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo likeCatalogName(String value) {
        this.setCatalogName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getCatalogName()), CatalogPo::getCatalogName, getCatalogName());
        return this;
    }

    public CatalogPo orderByCatalogName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo orderByCatalogNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, CatalogPo::getCatalogName);
        return this;
    }

    public CatalogPo selectId() {
        this.queryWrapper.lambda().select(CatalogPo::getId);
        return this;
    }

    public CatalogPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), CatalogPo::getId, getId());
        return this;
    }

    public CatalogPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), CatalogPo::getId, valueList);
        return this;
    }

    public CatalogPo selectCreatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedBy);
        return this;
    }

    public CatalogPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), CatalogPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public CatalogPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedBy);
        return this;
    }

    public CatalogPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), CatalogPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public CatalogPo selectStatus() {
        this.queryWrapper.lambda().select(CatalogPo::getStatus);
        return this;
    }

    public CatalogPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), CatalogPo::getStatus, getStatus());
        return this;
    }

    public CatalogPo selectSortCode() {
        this.queryWrapper.lambda().select(CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getSortCode);
        return this;
    }

    public CatalogPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), CatalogPo::getSortCode, getSortCode());
        return this;
    }

    public CatalogPo selectCreatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getCreatedDate);
        return this;
    }

    public CatalogPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, CatalogPo::getUpdatedDate);
        return this;
    }

    public CatalogPo eqAuto() {
        return this.eqCatalogCode().eqCatalogName();
    }

    public CatalogPo likeAuto() {
        return this.likeCatalogCode().likeCatalogName();
    }

    public CatalogPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}