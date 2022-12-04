package com.example.cyjworkflow.service.bean.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.FlowUser;
import com.example.cyjworkflow.mapper.bean.FlowUserMapper;
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
public class FlowUserCustomServiceImpl
        extends ServiceImpl<FlowUserMapper, FlowUser>
        implements IService<FlowUser> {

    private static final Logger logger = LoggerFactory.getLogger(FlowUserCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowUserServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("FlowUserService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowUserServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("FlowUserService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowUserServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("FlowUserService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowUserServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("FlowUserService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowUserServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("FlowUserService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowUserServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("FlowUserService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowUserServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("FlowUserService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowUserServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("FlowUserService.findAllAfter:{}", joinPoint);
    }

}
