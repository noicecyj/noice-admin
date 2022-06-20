package com.example.cyjauth.service.custom;

import com.example.cyjcommon.service.BaseService;
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
 * @version 1.0
 * @date 2022-03-02
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(AuthorityCustomService.class);

    @Before(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("AuthorityService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjauth.service.auto.AuthorityService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("AuthorityService.findAllAfter:{}", joinPoint);
    }

}
