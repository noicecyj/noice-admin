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
@TableName("t_authority")
@SuppressWarnings("unused")
public class AuthorityPo extends BasePoBean<AuthorityPo> {

    public static final String PO = "Authority";

    @TableField("authority_code")
    private String authorityCode;

    @TableField("authority_name")
    private String authorityName;

    @TableField("authority_type")
    private String authorityType;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<AuthorityPo> queryWrapper = new QueryWrapper<>();

    public AuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public AuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public AuthorityPo selectAuthorityCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo eqAuthorityCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo eqAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo inAuthorityCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityCode, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo likeAuthorityCode(String value) {
        this.setAuthorityCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityCode()), AuthorityPo::getAuthorityCode, getAuthorityCode());
        return this;
    }

    public AuthorityPo orderByAuthorityCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo orderByAuthorityCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityCode);
        return this;
    }

    public AuthorityPo selectAuthorityName() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo eqAuthorityName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo eqAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo inAuthorityName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityName, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo likeAuthorityName(String value) {
        this.setAuthorityName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityName()), AuthorityPo::getAuthorityName, getAuthorityName());
        return this;
    }

    public AuthorityPo orderByAuthorityName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo orderByAuthorityNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityName);
        return this;
    }

    public AuthorityPo selectAuthorityType() {
        this.queryWrapper.lambda().select(AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo eqAuthorityType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo eqAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo inAuthorityType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getAuthorityType, valueList);
        return this;
    }

    public AuthorityPo likeAuthorityType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo likeAuthorityType(String value) {
        this.setAuthorityType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getAuthorityType()), AuthorityPo::getAuthorityType, getAuthorityType());
        return this;
    }

    public AuthorityPo orderByAuthorityType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo orderByAuthorityTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, AuthorityPo::getAuthorityType);
        return this;
    }

    public AuthorityPo selectId() {
        this.queryWrapper.lambda().select(AuthorityPo::getId);
        return this;
    }

    public AuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), AuthorityPo::getId, getId());
        return this;
    }

    public AuthorityPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), AuthorityPo::getId, valueList);
        return this;
    }

    public AuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedBy);
        return this;
    }

    public AuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), AuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public AuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedBy);
        return this;
    }

    public AuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), AuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public AuthorityPo selectStatus() {
        this.queryWrapper.lambda().select(AuthorityPo::getStatus);
        return this;
    }

    public AuthorityPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), AuthorityPo::getStatus, getStatus());
        return this;
    }

    public AuthorityPo selectSortCode() {
        this.queryWrapper.lambda().select(AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getSortCode);
        return this;
    }

    public AuthorityPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AuthorityPo::getSortCode, getSortCode());
        return this;
    }

    public AuthorityPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), AuthorityPo::getSortCode, getSortCode());
        return this;
    }

    public AuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getCreatedDate);
        return this;
    }

    public AuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, AuthorityPo::getUpdatedDate);
        return this;
    }

    public AuthorityPo eqAuto() {
        return this.eqAuthorityCode().eqAuthorityName().eqAuthorityType();
    }

    public AuthorityPo likeAuto() {
        return this.likeAuthorityCode().likeAuthorityName().likeAuthorityType();
    }

    public AuthorityPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}