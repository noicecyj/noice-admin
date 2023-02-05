package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.MenuBean;
import com.example.cyjcommon.mapper.bean.MenuMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MenuServiceImpl
        extends ServiceImpl<MenuMapper, MenuBean>
        implements IService<MenuBean> {

    public MenuBean addOne(MenuBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(MenuBean po) {
        po.deleteById();
    }

    public MenuBean updateOne(MenuBean po) {
        po.updateById();
        return po;
    }

    public Page<MenuBean> findAll(MenuBean po, Integer pageNumber, Integer pageSize) {
        Page<MenuBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<MenuBean> queryWrapper = searchHandler(po);
        return new MenuBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<MenuBean> searchHandler(MenuBean po) {
        return new LambdaQueryWrapper<MenuBean>()
                .like(StringUtils.isNotEmpty(po.getMenuName()),
                        MenuBean::getMenuName, po.getMenuName())
                .like(StringUtils.isNotEmpty(po.getMenuCode()),
                        MenuBean::getMenuCode, po.getMenuCode())
                .eq(MenuBean::getStatus, po.getStatus())
                .orderByAsc(MenuBean::getSortCode);
    }

}