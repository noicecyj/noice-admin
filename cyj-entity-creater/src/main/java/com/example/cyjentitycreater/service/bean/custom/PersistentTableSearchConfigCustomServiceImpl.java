package com.example.cyjentitycreater.service.bean.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.PersistentTableSearchConfigBean;
import com.example.cyjcommon.mapper.bean.PersistentTableSearchConfigMapper;
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
public class PersistentTableSearchConfigCustomServiceImpl
        extends ServiceImpl<PersistentTableSearchConfigMapper, PersistentTableSearchConfigBean>
        implements IService<PersistentTableSearchConfigBean> {

    private static final Logger logger = LoggerFactory.getLogger(PersistentTableSearchConfigCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentTableSearchConfigServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("PersistentTableSearchConfigService.addOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentTableSearchConfigServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("PersistentTableSearchConfigService.addOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentTableSearchConfigServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("PersistentTableSearchConfigService.deleteOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentTableSearchConfigServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("PersistentTableSearchConfigService.deleteOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentTableSearchConfigServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("PersistentTableSearchConfigService.updateOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentTableSearchConfigServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("PersistentTableSearchConfigService.updateOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentTableSearchConfigServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("PersistentTableSearchConfigService.findAll.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.PersistentTableSearchConfigServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("PersistentTableSearchConfigService.findAll.After:{}", joinPoint);
    }

}
