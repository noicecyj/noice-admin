package com.example.cyjentitycreater.service.bean.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.AppServiceBean;
import com.example.cyjcommon.mapper.bean.AppServiceMapper;
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
public class AppServiceCustomServiceImpl
        extends ServiceImpl<AppServiceMapper, AppServiceBean>
        implements IService<AppServiceBean> {

    private static final Logger logger = LoggerFactory.getLogger(AppServiceCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.AppServiceServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("AppServiceService.addOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.AppServiceServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("AppServiceService.addOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.AppServiceServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("AppServiceService.deleteOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.AppServiceServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("AppServiceService.deleteOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.AppServiceServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("AppServiceService.updateOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.AppServiceServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("AppServiceService.updateOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.bean.auto.AppServiceServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("AppServiceService.findAll.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.bean.auto.AppServiceServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("AppServiceService.findAll.After:{}", joinPoint);
    }

}
