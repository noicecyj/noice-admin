package noice.entity.po.relation;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;
import noice.handler.po.BasePoRelation;

import java.util.List;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@TableName("t_role_authority")
@SuppressWarnings("unused")
public class RoleAuthorityPo extends BasePoRelation<RoleAuthorityPo> {

    public static final String PO = "RoleAuthority";

    @TableField("authority_id")
    private String authorityId;

    @TableField("role_id")
    private String roleId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<RoleAuthorityPo> queryWrapper = new QueryWrapper<>();

    public RoleAuthorityPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public RoleAuthorityPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public RoleAuthorityPo selectAuthorityId() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getAuthorityId);
        return this;
    }

    public RoleAuthorityPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), RoleAuthorityPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public RoleAuthorityPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), RoleAuthorityPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public RoleAuthorityPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RoleAuthorityPo::getAuthorityId, valueList);
        return this;
    }

    public RoleAuthorityPo selectRoleId() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getRoleId);
        return this;
    }

    public RoleAuthorityPo eqRoleId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleId()), RoleAuthorityPo::getRoleId, getRoleId());
        return this;
    }

    public RoleAuthorityPo eqRoleId(String value) {
        this.setRoleId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleId()), RoleAuthorityPo::getRoleId, getRoleId());
        return this;
    }

    public RoleAuthorityPo inRoleId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RoleAuthorityPo::getRoleId, valueList);
        return this;
    }

    public RoleAuthorityPo selectId() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getId);
        return this;
    }

    public RoleAuthorityPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), RoleAuthorityPo::getId, getId());
        return this;
    }

    public RoleAuthorityPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), RoleAuthorityPo::getId, valueList);
        return this;
    }

    public RoleAuthorityPo selectCreatedBy() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getCreatedBy);
        return this;
    }

    public RoleAuthorityPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), RoleAuthorityPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public RoleAuthorityPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getUpdatedBy);
        return this;
    }

    public RoleAuthorityPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), RoleAuthorityPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public RoleAuthorityPo selectCreatedDate() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getCreatedDate);
        return this;
    }

    public RoleAuthorityPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RoleAuthorityPo::getCreatedDate);
        return this;
    }

    public RoleAuthorityPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(RoleAuthorityPo::getUpdatedDate);
        return this;
    }

    public RoleAuthorityPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, RoleAuthorityPo::getUpdatedDate);
        return this;
    }

    public RoleAuthorityPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}