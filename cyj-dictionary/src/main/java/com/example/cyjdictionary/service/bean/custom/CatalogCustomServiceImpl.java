package com.example.cyjdictionary.service.bean.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.CatalogBean;
import com.example.cyjcommon.mapper.bean.CatalogMapper;
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
public class CatalogCustomServiceImpl
        extends ServiceImpl<CatalogMapper, CatalogBean>
        implements IService<CatalogBean> {

    private static final Logger logger = LoggerFactory.getLogger(CatalogCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.CatalogServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("CatalogService.addOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.CatalogServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("CatalogService.addOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.CatalogServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("CatalogService.deleteOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.CatalogServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("CatalogService.deleteOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.CatalogServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("CatalogService.updateOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.CatalogServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("CatalogService.updateOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.CatalogServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("CatalogService.findAll.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.CatalogServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("CatalogService.findAll.After:{}", joinPoint);
    }

}
