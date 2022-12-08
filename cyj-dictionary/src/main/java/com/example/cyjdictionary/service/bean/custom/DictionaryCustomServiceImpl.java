package com.example.cyjdictionary.service.bean.custom;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Catalog;
import com.example.cyjcommon.entity.bean.Dictionary;
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
        extends ServiceImpl<DictionaryMapper, Dictionary>
        implements IService<Dictionary> {
    public List<Dictionary> findCatalogByValue(String value) {
        Catalog catalog = new Catalog()
                .selectOne(new QueryWrapper<Catalog>().lambda()
                        .eq(Catalog::getCatalogValue, value));
        if (catalog == null) {
            return new ArrayList<>();
        }
        return new Dictionary()
                .selectList(new QueryWrapper<Dictionary>().lambda()
                        .eq(Dictionary::getCatalogId, catalog.getId()));
    }

    private static final Logger logger = LoggerFactory.getLogger(DictionaryCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.bean.auto.DictionaryServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.findAllAfter:{}", joinPoint);
    }

}
