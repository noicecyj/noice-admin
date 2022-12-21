package com.example.cyjauth.service.bean.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.RoleBean;
import com.example.cyjcommon.mapper.bean.RoleMapper;
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
public class RoleCustomServiceImpl
        extends ServiceImpl<RoleMapper, RoleBean>
        implements IService<RoleBean> {

    private static final Logger logger = LoggerFactory.getLogger(RoleCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.RoleServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("RoleService.addOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.RoleServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("RoleService.addOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.RoleServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("RoleService.deleteOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.RoleServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("RoleService.deleteOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.RoleServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("RoleService.updateOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.RoleServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("RoleService.updateOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.RoleServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("RoleService.findAll.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.RoleServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("RoleService.findAll.After:{}", joinPoint);
    }

}
