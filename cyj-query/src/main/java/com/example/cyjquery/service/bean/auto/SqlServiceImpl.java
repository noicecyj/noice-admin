package com.example.cyjquery.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Sql;
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
        extends ServiceImpl<SqlMapper, Sql>
        implements IService<Sql> {

    public Sql addOne(Sql po) {
        po.insert();
        return po;
    }

    public void deleteOne(Sql po) {
        po.deleteById();
    }

    public Sql updateOne(Sql po) {
        po.updateById();
        return po;
    }

    public Page<Sql> findAll(Sql po, Integer pageNumber, Integer pageSize) {
        Page<Sql> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Sql> queryWrapper = searchHandler(po);
        return new Sql().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<Sql> searchHandler(Sql po) {
        return new QueryWrapper<Sql>().lambda()
                .like(StringUtils.isNotEmpty(po.getSqlName()),
                        Sql::getSqlName, po.getSqlName())
                .orderByAsc(Sql::getSortCode);
    }

}