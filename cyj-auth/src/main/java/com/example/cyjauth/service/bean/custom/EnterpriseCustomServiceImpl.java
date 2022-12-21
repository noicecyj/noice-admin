package com.example.cyjauth.service.bean.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.EnterpriseBean;
import com.example.cyjcommon.mapper.bean.EnterpriseMapper;
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
public class EnterpriseCustomServiceImpl
        extends ServiceImpl<EnterpriseMapper, EnterpriseBean>
        implements IService<EnterpriseBean> {

    private static final Logger logger = LoggerFactory.getLogger(EnterpriseCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseService.addOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseService.addOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseService.deleteOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseService.deleteOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseService.updateOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseService.updateOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("EnterpriseService.findAll.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.EnterpriseServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("EnterpriseService.findAll.After:{}", joinPoint);
    }

}
