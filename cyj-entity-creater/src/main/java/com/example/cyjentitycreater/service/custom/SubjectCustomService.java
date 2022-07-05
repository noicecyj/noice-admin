package com.example.cyjentitycreater.service.custom;

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
 */
@Aspect
@Service
@Transactional(rollbackFor = Exception.class)
public class SubjectCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(SubjectCustomService.class);

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.SubjectService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("SubjectService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.SubjectService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("SubjectService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.SubjectService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("SubjectService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.SubjectService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("SubjectService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.SubjectService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("SubjectService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.SubjectService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("SubjectService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjentitycreater.service.auto.SubjectService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("SubjectService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjentitycreater.service.auto.SubjectService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("SubjectService.findAllAfter:{}", joinPoint);
    }

}
