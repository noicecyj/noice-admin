package com.example.cyjuser.service.bean.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.AuthorityBean;
import com.example.cyjcommon.mapper.bean.AuthorityMapper;
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
public class AuthorityCustomServiceImpl
        extends ServiceImpl<AuthorityMapper, AuthorityBean>
        implements IService<AuthorityBean> {

    private static final Logger logger = LoggerFactory.getLogger(AuthorityCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjuser.service.bean.auto.AuthorityServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.addOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjuser.service.bean.auto.AuthorityServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.addOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjuser.service.bean.auto.AuthorityServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.deleteOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjuser.service.bean.auto.AuthorityServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.deleteOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjuser.service.bean.auto.AuthorityServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.updateOne.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjuser.service.bean.auto.AuthorityServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.updateOne.After:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjuser.service.bean.auto.AuthorityServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.findAll.Before:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjuser.service.bean.auto.AuthorityServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.findAll.After:{}", joinPoint);
    }

}
