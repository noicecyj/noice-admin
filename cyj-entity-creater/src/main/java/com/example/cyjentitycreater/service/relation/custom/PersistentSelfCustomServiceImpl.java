package com.example.cyjentitycreater.service.relation.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.relation.PersistentSelfRelation;
import com.example.cyjcommon.mapper.relation.PersistentSelfMapper;
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
public class PersistentSelfCustomServiceImpl
        extends ServiceImpl<PersistentSelfMapper, PersistentSelfRelation>
        implements IService<PersistentSelfRelation> {

    private static final Logger logger = LoggerFactory.getLogger(PersistentSelfCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.relation.auto.PersistentSelfServiceImpl.getPersistentSelf(..))")
    public void getPersistentSelfBefore(JoinPoint joinPoint) {
        logger.info("PersistentSelfService.getPersistentSelf.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.relation.auto.PersistentSelfServiceImpl.getPersistentSelf(..))")
    public void getPersistentSelfAfter(JoinPoint joinPoint) {
        logger.info("PersistentSelfService.getPersistentSelf.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.relation.auto.PersistentSelfServiceImpl.setPersistentSelf(..))")
    public void setPersistentSelfBefore(JoinPoint joinPoint) {
        logger.info("PersistentSelfService.setPersistentSelf.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.relation.auto.PersistentSelfServiceImpl.setPersistentSelf(..))")
    public void setPersistentSelfAfter(JoinPoint joinPoint) {
        logger.info("PersistentSelfService.setPersistentSelf.After:{}", joinPoint);
    }

}
