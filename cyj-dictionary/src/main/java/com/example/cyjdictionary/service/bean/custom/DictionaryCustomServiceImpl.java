package com.example.cyjdictionary.service.bean.custom;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.CatalogBean;
import com.example.cyjcommon.entity.bean.DictionaryBean;
import com.example.cyjcommon.mapper.bean.DictionaryMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class DictionaryCustomServiceImpl
        extends ServiceImpl<DictionaryMapper, DictionaryBean>
        implements IService<DictionaryBean> {

    public List<DictionaryBean> findCatalogByValue(String value) {
        CatalogBean catalog = new CatalogBean()
                .selectOne(new QueryWrapper<CatalogBean>().lambda()
                        .eq(CatalogBean::getCatalogCode, value));
        if (catalog == null) {
            return new ArrayList<>();
        }
        return new DictionaryBean()
                .selectList(new QueryWrapper<DictionaryBean>().lambda()
                        .eq(DictionaryBean::getCatalogId, catalog.getId()));
    }

    private static final Logger logger = LoggerFactory.getLogger(DictionaryCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.addOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.addOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.deleteOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.deleteOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.updateOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.updateOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.findAll.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.findAll.After:{}", joinPoint);
    }

}
