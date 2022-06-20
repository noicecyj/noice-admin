package com.example.cyjdictionary.service.custom;

import com.example.cyjcommon.entity.Dictionary;
import com.example.cyjcommon.entity.QCatalog;
import com.example.cyjcommon.entity.QDictionary;
import com.example.cyjcommon.service.BaseService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class DictionaryCustomService extends BaseService {

    public List<Dictionary> findCatalogByValue(String value) {
        QDictionary qDictionary = QDictionary.dictionary;
        QCatalog qCatalog = QCatalog.catalog;
        return queryFactory.selectFrom(qDictionary)
                .innerJoin(qCatalog)
                .on(qDictionary.catalog.id.eq(qCatalog.id))
                .where(qCatalog.catalogValue.eq(value))
                .orderBy(qDictionary.sortCode.asc()).fetch();
    }

    private static final Logger logger = LoggerFactory.getLogger(DictionaryCustomService.class);

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("DictionaryService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjdictionary.service.auto.DictionaryService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("DictionaryService.findAllAfter:{}", joinPoint);
    }

}
