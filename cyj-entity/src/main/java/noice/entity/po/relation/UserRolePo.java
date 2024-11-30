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
@TableName("t_user_role")
@SuppressWarnings("unused")
public class UserRolePo extends BasePoRelation<UserRolePo> {

    public static final String PO = "UserRole";

    @TableField("role_id")
    private String roleId;

    @TableField("user_id")
    private String userId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<UserRolePo> queryWrapper = new QueryWrapper<>();

    public UserRolePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public UserRolePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public UserRolePo selectRoleId() {
        this.queryWrapper.lambda().select(UserRolePo::getRoleId);
        return this;
    }

    public UserRolePo eqRoleId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleId()), UserRolePo::getRoleId, getRoleId());
        return this;
    }

    public UserRolePo eqRoleId(String value) {
        this.setRoleId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getRoleId()), UserRolePo::getRoleId, getRoleId());
        return this;
    }

    public UserRolePo inRoleId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserRolePo::getRoleId, valueList);
        return this;
    }

    public UserRolePo selectUserId() {
        this.queryWrapper.lambda().select(UserRolePo::getUserId);
        return this;
    }

    public UserRolePo eqUserId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserId()), UserRolePo::getUserId, getUserId());
        return this;
    }

    public UserRolePo eqUserId(String value) {
        this.setUserId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUserId()), UserRolePo::getUserId, getUserId());
        return this;
    }

    public UserRolePo inUserId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserRolePo::getUserId, valueList);
        return this;
    }

    public UserRolePo selectId() {
        this.queryWrapper.lambda().select(UserRolePo::getId);
        return this;
    }

    public UserRolePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), UserRolePo::getId, getId());
        return this;
    }

    public UserRolePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), UserRolePo::getId, valueList);
        return this;
    }

    public UserRolePo selectCreatedBy() {
        this.queryWrapper.lambda().select(UserRolePo::getCreatedBy);
        return this;
    }

    public UserRolePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), UserRolePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public UserRolePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(UserRolePo::getUpdatedBy);
        return this;
    }

    public UserRolePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), UserRolePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public UserRolePo selectCreatedDate() {
        this.queryWrapper.lambda().select(UserRolePo::getCreatedDate);
        return this;
    }

    public UserRolePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserRolePo::getCreatedDate);
        return this;
    }

    public UserRolePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(UserRolePo::getUpdatedDate);
        return this;
    }

    public UserRolePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, UserRolePo::getUpdatedDate);
        return this;
    }

    public UserRolePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}