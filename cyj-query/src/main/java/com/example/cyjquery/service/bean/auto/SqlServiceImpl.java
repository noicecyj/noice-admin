package com.example.cyjquery.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.SqlBean;
import com.example.cyjcommon.mapper.bean.SqlMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SqlServiceImpl
        extends ServiceImpl<SqlMapper, SqlBean>
        implements IService<SqlBean> {

    public SqlBean addOne(SqlBean po) {
        po.insert();
        return po;
    }

    public void deleteOne(SqlBean po) {
        po.deleteById();
    }

    public SqlBean updateOne(SqlBean po) {
        po.updateById();
        return po;
    }

    public Page<SqlBean> findAll(SqlBean po, Integer pageNumber, Integer pageSize) {
        Page<SqlBean> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<SqlBean> queryWrapper = searchHandler(po);
        return new SqlBean().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<SqlBean> searchHandler(SqlBean po) {
        return new LambdaQueryWrapper<SqlBean>()
                .like(StringUtils.isNotEmpty(po.getSqlName()),
                        SqlBean::getSqlName, po.getSqlName())
                .orderByAsc(SqlBean::getSortCode);
    }

}