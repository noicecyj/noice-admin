package com.example.cyjquery.service.bean.custom;

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

    private static final Logger logger = LoggerFactory.getLogger(SqlCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("SqlService.addOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("SqlService.addOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("SqlService.deleteOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("SqlService.deleteOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("SqlService.updateOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("SqlService.updateOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("SqlService.findAll.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjquery.service.bean.auto.SqlServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("SqlService.findAll.After:{}", joinPoint);
    }

}
