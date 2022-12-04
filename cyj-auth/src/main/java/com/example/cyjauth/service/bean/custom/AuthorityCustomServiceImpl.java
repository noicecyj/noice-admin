package com.example.cyjauth.service.bean.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjauth.mapper.bean.AuthorityMapper;
import com.example.cyjcommon.entity.bean.Authority;
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
        extends ServiceImpl<AuthorityMapper, Authority>
        implements IService<Authority> {

    private static final Logger logger = LoggerFactory.getLogger(AuthorityCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.AuthorityServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.AuthorityServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.AuthorityServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.AuthorityServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.AuthorityServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.AuthorityServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.bean.auto.AuthorityServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.bean.auto.AuthorityServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.findAllAfter:{}", joinPoint);
    }

}
