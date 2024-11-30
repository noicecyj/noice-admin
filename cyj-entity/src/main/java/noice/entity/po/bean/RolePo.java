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
@TableName("t_role")
@SuppressWarnings("unused")
public class RolePo extends BasePoBean<RolePo> {

    public static final String PO = "Role";

    @TableField("role_code")
    private String roleCode;

    @TableField("role_name")
    private String roleName;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RolePo> queryWrapper = new QueryWrapper<>();

    public RolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RolePo selectRoleCode() {
        this.queryWrapper.lambda().select(RolePo::getRoleCode);
        return this;
    }

    public RolePo eqRoleCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo eqRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo inRoleCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleCode, valueList);
        return this;
    }

    public RolePo likeRoleCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo likeRoleCode(String value) {
        this.setRoleCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleCode()), RolePo::getRoleCode, getRoleCode());
        return this;
    }

    public RolePo orderByRoleCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleCode);
        return this;
    }

    public RolePo orderByRoleCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleCode);
        return this;
    }

    public RolePo selectRoleName() {
        this.queryWrapper.lambda().select(RolePo::getRoleName);
        return this;
    }

    public RolePo eqRoleName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo eqRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo inRoleName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getRoleName, valueList);
        return this;
    }

    public RolePo likeRoleName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo likeRoleName(String value) {
        this.setRoleName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getRoleName()), RolePo::getRoleName, getRoleName());
        return this;
    }

    public RolePo orderByRoleName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, RolePo::getRoleName);
        return this;
    }

    public RolePo orderByRoleNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, RolePo::getRoleName);
        return this;
    }

    public RolePo selectId() {
        this.queryWrapper.lambda().select(RolePo::getId);
        return this;
    }

    public RolePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RolePo::getId, getId());
        return this;
    }

    public RolePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RolePo::getId, valueList);
        return this;
    }

    public RolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(RolePo::getCreatedBy);
        return this;
    }

    public RolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedBy);
        return this;
    }

    public RolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RolePo selectStatus() {
        this.queryWrapper.lambda().select(RolePo::getStatus);
        return this;
    }

    public RolePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), RolePo::getStatus, getStatus());
        return this;
    }

    public RolePo selectSortCode() {
        this.queryWrapper.lambda().select(RolePo::getSortCode);
        return this;
    }

    public RolePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getSortCode);
        return this;
    }

    public RolePo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), RolePo::getSortCode, getSortCode());
        return this;
    }

    public RolePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), RolePo::getSortCode, getSortCode());
        return this;
    }

    public RolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(RolePo::getCreatedDate);
        return this;
    }

    public RolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getCreatedDate);
        return this;
    }

    public RolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RolePo::getUpdatedDate);
        return this;
    }

    public RolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RolePo::getUpdatedDate);
        return this;
    }

    public RolePo eqAuto() {
        return this.eqRoleCode().eqRoleName();
    }

    public RolePo likeAuto() {
        return this.likeRoleCode().likeRoleName();
    }

    public RolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}