package com.example.cyjquery.service.bean.custom;

import com.alibaba.fastjson2.JSONArray;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Sql;
import com.example.cyjcommon.mapper.bean.SqlMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class SqlCustomServiceImpl
        extends ServiceImpl<SqlMapper, Sql>
        implements IService<Sql> {

    private SqlMapper sqlMapper;

    @Autowired
    public void setSqlMapper(SqlMapper sqlMapper) {
        this.sqlMapper = sqlMapper;
    }

    public JSONArray queryBySql(String sql) {
        return sqlMapper.queryBySql(sql);
    }


    private static final Logger logger = LoggerFactory.getLogger(SqlCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("SqlService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("SqlService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("SqlService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("SqlService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("SqlService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("SqlService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("SqlService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("SqlService.findAllAfter:{}", joinPoint);
    }

}
