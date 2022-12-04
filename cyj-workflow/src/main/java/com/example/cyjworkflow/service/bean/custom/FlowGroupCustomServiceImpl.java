package com.example.cyjworkflow.service.bean.custom;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.FlowGroup;
import com.example.cyjcommon.mapper.bean.FlowGroupMapper;
import com.example.cyjcommon.service.bean.FlowGroupService;
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
public class FlowGroupCustomServiceImpl
        extends ServiceImpl<FlowGroupMapper, FlowGroup>
        implements FlowGroupService {

    private static final Logger logger = LoggerFactory.getLogger(FlowGroupCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowGroupServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowGroupServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowGroupServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowGroupServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowGroupServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowGroupServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowGroupServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("FlowGroupService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.FlowGroupServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("FlowGroupService.findAllAfter:{}", joinPoint);
    }

}