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
@TableName("t_menu")
@SuppressWarnings("unused")
public class MenuPo extends BasePoBean<MenuPo> {

    public static final String PO = "Menu";

    @TableField("authority_id")
    private String authorityId;

    @TableField("menu_code")
    private String menuCode;

    @TableField("menu_icon")
    private String menuIcon;

    @TableField("menu_id")
    private String menuId;

    @TableField("menu_name")
    private String menuName;

    @TableField("menu_url")
    private String menuUrl;

    @JsonIgnore
    @TableField(exist = false)
    private QueryWrapper<MenuPo> queryWrapper = new QueryWrapper<>();

    public MenuPo or() {
        this.queryWrapper.lambda().or();
        return this;
    }

    public MenuPo or(boolean condition) {
        this.queryWrapper.lambda().or(condition);
        return this;
    }

    public MenuPo selectAuthorityId() {
        this.queryWrapper.lambda().select(MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo eqAuthorityId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo eqAuthorityId(String value) {
        this.setAuthorityId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getAuthorityId()), MenuPo::getAuthorityId, getAuthorityId());
        return this;
    }

    public MenuPo inAuthorityId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getAuthorityId, valueList);
        return this;
    }

    public MenuPo orderByAuthorityId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getAuthorityId);
        return this;
    }

    public MenuPo selectMenuCode() {
        this.queryWrapper.lambda().select(MenuPo::getMenuCode);
        return this;
    }

    public MenuPo eqMenuCode() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo eqMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo inMenuCode(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuCode, valueList);
        return this;
    }

    public MenuPo likeMenuCode() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo likeMenuCode(String value) {
        this.setMenuCode(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuCode()), MenuPo::getMenuCode, getMenuCode());
        return this;
    }

    public MenuPo orderByMenuCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo orderByMenuCodeDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuCode);
        return this;
    }

    public MenuPo selectMenuIcon() {
        this.queryWrapper.lambda().select(MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo eqMenuIcon() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo eqMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo inMenuIcon(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuIcon, valueList);
        return this;
    }

    public MenuPo likeMenuIcon() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo likeMenuIcon(String value) {
        this.setMenuIcon(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuIcon()), MenuPo::getMenuIcon, getMenuIcon());
        return this;
    }

    public MenuPo orderByMenuIcon(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo orderByMenuIconDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuIcon);
        return this;
    }

    public MenuPo selectMenuId() {
        this.queryWrapper.lambda().select(MenuPo::getMenuId);
        return this;
    }

    public MenuPo eqMenuId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo eqMenuId(String value) {
        this.setMenuId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuId()), MenuPo::getMenuId, getMenuId());
        return this;
    }

    public MenuPo inMenuId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuId, valueList);
        return this;
    }

    public MenuPo orderByMenuId(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuId);
        return this;
    }

    public MenuPo selectMenuName() {
        this.queryWrapper.lambda().select(MenuPo::getMenuName);
        return this;
    }

    public MenuPo eqMenuName() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo eqMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo inMenuName(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuName, valueList);
        return this;
    }

    public MenuPo likeMenuName() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo likeMenuName(String value) {
        this.setMenuName(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuName()), MenuPo::getMenuName, getMenuName());
        return this;
    }

    public MenuPo orderByMenuName(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuName);
        return this;
    }

    public MenuPo orderByMenuNameDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuName);
        return this;
    }

    public MenuPo selectMenuUrl() {
        this.queryWrapper.lambda().select(MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo eqMenuUrl() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo eqMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo inMenuUrl(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getMenuUrl, valueList);
        return this;
    }

    public MenuPo likeMenuUrl() {
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo likeMenuUrl(String value) {
        this.setMenuUrl(value);
        this.queryWrapper.lambda().like(StrUtil.isNotEmpty(getMenuUrl()), MenuPo::getMenuUrl, getMenuUrl());
        return this;
    }

    public MenuPo orderByMenuUrl(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlAsc() {
        this.queryWrapper.lambda().orderBy(true, true, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo orderByMenuUrlDesc() {
        this.queryWrapper.lambda().orderBy(true, false, MenuPo::getMenuUrl);
        return this;
    }

    public MenuPo selectId() {
        this.queryWrapper.lambda().select(MenuPo::getId);
        return this;
    }

    public MenuPo eqId() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo eqId(String value) {
        this.setId(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getId()), MenuPo::getId, getId());
        return this;
    }

    public MenuPo inId(List<String> valueList) {
        this.queryWrapper.lambda().in(CollUtil.isNotEmpty(valueList), MenuPo::getId, valueList);
        return this;
    }

    public MenuPo selectCreatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedBy);
        return this;
    }

    public MenuPo eqCreatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo eqCreatedBy(String value) {
        this.setCreatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getCreatedBy()), MenuPo::getCreatedBy, getCreatedBy());
        return this;
    }

    public MenuPo selectUpdatedBy() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedBy);
        return this;
    }

    public MenuPo eqUpdatedBy() {
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo eqUpdatedBy(String value) {
        this.setUpdatedBy(value);
        this.queryWrapper.lambda().eq(StrUtil.isNotEmpty(getUpdatedBy()), MenuPo::getUpdatedBy, getUpdatedBy());
        return this;
    }

    public MenuPo selectStatus() {
        this.queryWrapper.lambda().select(MenuPo::getStatus);
        return this;
    }

    public MenuPo eqStatus() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo eqStatus(Boolean value) {
        this.setStatus(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getStatus()), MenuPo::getStatus, getStatus());
        return this;
    }

    public MenuPo selectSortCode() {
        this.queryWrapper.lambda().select(MenuPo::getSortCode);
        return this;
    }

    public MenuPo orderBySortCode(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getSortCode);
        return this;
    }

    public MenuPo eqSortCode() {
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), MenuPo::getSortCode, getSortCode());
        return this;
    }

    public MenuPo eqSortCode(Long value) {
        this.setSortCode(value);
        this.queryWrapper.lambda().eq(ObjectUtil.isNotNull(getSortCode()), MenuPo::getSortCode, getSortCode());
        return this;
    }

    public MenuPo selectCreatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo orderByCreatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getCreatedDate);
        return this;
    }

    public MenuPo selectUpdatedDate() {
        this.queryWrapper.lambda().select(MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo orderByUpdatedDate(boolean isAsc) {
        this.queryWrapper.lambda().orderBy(true, isAsc, MenuPo::getUpdatedDate);
        return this;
    }

    public MenuPo eqAuto() {
        return this.eqAuthorityId().eqMenuCode().eqMenuIcon().eqMenuId().eqMenuName().eqMenuUrl();
    }

    public MenuPo likeAuto() {
        return this.eqAuthorityId().likeMenuCode().likeMenuIcon().eqMenuId().likeMenuName().likeMenuUrl();
    }

    public MenuPo baseQueryWrapper() {
        return this.eqId().eqCreatedBy().eqUpdatedBy().eqStatus().eqSortCode().orderByAuthorityId(true).orderByMenuId(true).orderBySortCode(true).orderByCreatedDate(true).orderByUpdatedDate(true);
    }

}