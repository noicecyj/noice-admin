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
@TableName("t_interface")
@SuppressWarnings("unused")
public class InterfacePo extends BasePoBean<InterfacePo> {

    public static final String PO = "Interface";

    @TableField("authority_id")
    private String authorityId;

    @TableField("interface_code")
    private String interfaceCode;

    @TableField("interface_name")
    private String interfaceName;

    @TableField("interface_path")
    private String interfacePath;

    @TableField("interface_type")
    private String interfaceType;

    @TableField("persistent_id")
    private String persistentId;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<InterfacePo> queryWrapper = new QueryWrapper<>();

    public InterfacePo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public InterfacePo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public InterfacePo selectAuthorityId() {
        this.queryWrapper.lambda().select(InterfacePo::getAuthorityId);
        return this;
    }

    public InterfacePo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), InterfacePo::getAuthorityId, getAuthorityId());
        return this;
    }

    public InterfacePo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), InterfacePo::getAuthorityId, getAuthorityId());
        return this;
    }

    public InterfacePo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), InterfacePo::getAuthorityId, valueList);
        return this;
    }

    public InterfacePo orderByAuthorityId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, InterfacePo::getAuthorityId);
        return this;
    }

    public InterfacePo selectInterfaceCode() {
        this.queryWrapper.lambda().select(InterfacePo::getInterfaceCode);
        return this;
    }

    public InterfacePo eqInterfaceCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getInterfaceCode()), InterfacePo::getInterfaceCode, getInterfaceCode());
        return this;
    }

    public InterfacePo eqInterfaceCode(String value) {
        this.setInterfaceCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getInterfaceCode()), InterfacePo::getInterfaceCode, getInterfaceCode());
        return this;
    }

    public InterfacePo inInterfaceCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), InterfacePo::getInterfaceCode, valueList);
        return this;
    }

    public InterfacePo likeInterfaceCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getInterfaceCode()), InterfacePo::getInterfaceCode, getInterfaceCode());
        return this;
    }

    public InterfacePo likeInterfaceCode(String value) {
        this.setInterfaceCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getInterfaceCode()), InterfacePo::getInterfaceCode, getInterfaceCode());
        return this;
    }

    public InterfacePo orderByInterfaceCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, InterfacePo::getInterfaceCode);
        return this;
    }

    public InterfacePo orderByInterfaceCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, InterfacePo::getInterfaceCode);
        return this;
    }

    public InterfacePo orderByInterfaceCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, InterfacePo::getInterfaceCode);
        return this;
    }

    public InterfacePo selectInterfaceName() {
        this.queryWrapper.lambda().select(InterfacePo::getInterfaceName);
        return this;
    }

    public InterfacePo eqInterfaceName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getInterfaceName()), InterfacePo::getInterfaceName, getInterfaceName());
        return this;
    }

    public InterfacePo eqInterfaceName(String value) {
        this.setInterfaceName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getInterfaceName()), InterfacePo::getInterfaceName, getInterfaceName());
        return this;
    }

    public InterfacePo inInterfaceName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), InterfacePo::getInterfaceName, valueList);
        return this;
    }

    public InterfacePo likeInterfaceName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getInterfaceName()), InterfacePo::getInterfaceName, getInterfaceName());
        return this;
    }

    public InterfacePo likeInterfaceName(String value) {
        this.setInterfaceName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getInterfaceName()), InterfacePo::getInterfaceName, getInterfaceName());
        return this;
    }

    public InterfacePo orderByInterfaceName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, InterfacePo::getInterfaceName);
        return this;
    }

    public InterfacePo orderByInterfaceNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, InterfacePo::getInterfaceName);
        return this;
    }

    public InterfacePo orderByInterfaceNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, InterfacePo::getInterfaceName);
        return this;
    }

    public InterfacePo selectInterfacePath() {
        this.queryWrapper.lambda().select(InterfacePo::getInterfacePath);
        return this;
    }

    public InterfacePo eqInterfacePath() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getInterfacePath()), InterfacePo::getInterfacePath, getInterfacePath());
        return this;
    }

    public InterfacePo eqInterfacePath(String value) {
        this.setInterfacePath(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getInterfacePath()), InterfacePo::getInterfacePath, getInterfacePath());
        return this;
    }

    public InterfacePo inInterfacePath(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), InterfacePo::getInterfacePath, valueList);
        return this;
    }

    public InterfacePo likeInterfacePath() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getInterfacePath()), InterfacePo::getInterfacePath, getInterfacePath());
        return this;
    }

    public InterfacePo likeInterfacePath(String value) {
        this.setInterfacePath(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getInterfacePath()), InterfacePo::getInterfacePath, getInterfacePath());
        return this;
    }

    public InterfacePo orderByInterfacePath(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, InterfacePo::getInterfacePath);
        return this;
    }

    public InterfacePo orderByInterfacePathAsc() {
        this.queryWrapper.lambda().orderBy(true, true, InterfacePo::getInterfacePath);
        return this;
    }

    public InterfacePo orderByInterfacePathDesc() {
        this.queryWrapper.lambda().orderBy(true, false, InterfacePo::getInterfacePath);
        return this;
    }

    public InterfacePo selectInterfaceType() {
        this.queryWrapper.lambda().select(InterfacePo::getInterfaceType);
        return this;
    }

    public InterfacePo eqInterfaceType() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getInterfaceType()), InterfacePo::getInterfaceType, getInterfaceType());
        return this;
    }

    public InterfacePo eqInterfaceType(String value) {
        this.setInterfaceType(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getInterfaceType()), InterfacePo::getInterfaceType, getInterfaceType());
        return this;
    }

    public InterfacePo inInterfaceType(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), InterfacePo::getInterfaceType, valueList);
        return this;
    }

    public InterfacePo likeInterfaceType() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getInterfaceType()), InterfacePo::getInterfaceType, getInterfaceType());
        return this;
    }

    public InterfacePo likeInterfaceType(String value) {
        this.setInterfaceType(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getInterfaceType()), InterfacePo::getInterfaceType, getInterfaceType());
        return this;
    }

    public InterfacePo orderByInterfaceType(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, InterfacePo::getInterfaceType);
        return this;
    }

    public InterfacePo orderByInterfaceTypeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, InterfacePo::getInterfaceType);
        return this;
    }

    public InterfacePo orderByInterfaceTypeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, InterfacePo::getInterfaceType);
        return this;
    }

    public InterfacePo selectPersistentId() {
        this.queryWrapper.lambda().select(InterfacePo::getPersistentId);
        return this;
    }

    public InterfacePo eqPersistentId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), InterfacePo::getPersistentId, getPersistentId());
        return this;
    }

    public InterfacePo eqPersistentId(String value) {
        this.setPersistentId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getPersistentId()), InterfacePo::getPersistentId, getPersistentId());
        return this;
    }

    public InterfacePo inPersistentId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), InterfacePo::getPersistentId, valueList);
        return this;
    }

    public InterfacePo orderByPersistentId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, InterfacePo::getPersistentId);
        return this;
    }

    public InterfacePo selectId() {
        this.queryWrapper.lambda().select(InterfacePo::getId);
        return this;
    }

    public InterfacePo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), InterfacePo::getId, getId());
        return this;
    }

    public InterfacePo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), InterfacePo::getId, getId());
        return this;
    }

    public InterfacePo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), InterfacePo::getId, valueList);
        return this;
    }

    public InterfacePo selectCreatedBy() {
        this.queryWrapper.lambda().select(InterfacePo::getCreatedBy);
        return this;
    }

    public InterfacePo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), InterfacePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public InterfacePo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), InterfacePo::getCreatedBy, getCreatedBy());
        return this;
    }

    public InterfacePo selectUpdatedBy() {
        this.queryWrapper.lambda().select(InterfacePo::getUpdatedBy);
        return this;
    }

    public InterfacePo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), InterfacePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public InterfacePo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), InterfacePo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public InterfacePo selectStatus() {
        this.queryWrapper.lambda().select(InterfacePo::getStatus);
        return this;
    }

    public InterfacePo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), InterfacePo::getStatus, getStatus());
        return this;
    }

    public InterfacePo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), InterfacePo::getStatus, getStatus());
        return this;
    }

    public InterfacePo selectSortCode() {
        this.queryWrapper.lambda().select(InterfacePo::getSortCode);
        return this;
    }

    public InterfacePo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, InterfacePo::getSortCode);
        return this;
    }

    public InterfacePo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), InterfacePo::getSortCode, getSortCode());
        return this;
    }

    public InterfacePo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), InterfacePo::getSortCode, getSortCode());
        return this;
    }

    public InterfacePo selectCreatedDate() {
        this.queryWrapper.lambda().select(InterfacePo::getCreatedDate);
        return this;
    }

    public InterfacePo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, InterfacePo::getCreatedDate);
        return this;
    }

    public InterfacePo selectUpdatedDate() {
        this.queryWrapper.lambda().select(InterfacePo::getUpdatedDate);
        return this;
    }

    public InterfacePo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, InterfacePo::getUpdatedDate);
        return this;
    }

    public InterfacePo eqAuto() {
        return this.eqAuthorityId().eqInterfaceCode().eqInterfaceName().eqInterfacePath().eqInterfaceType().eqPersistentId();
    }

    public InterfacePo likeAuto() {
        return this.eqAuthorityId().likeInterfaceCode().likeInterfaceName().likeInterfacePath().likeInterfaceType().eqPersistentId();
    }

    public InterfacePo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}