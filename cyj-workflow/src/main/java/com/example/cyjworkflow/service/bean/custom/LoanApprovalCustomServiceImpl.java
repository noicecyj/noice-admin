package com.example.cyjworkflow.service.bean.custom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.LoanApproval;
import com.example.cyjcommon.mapper.bean.LoanApprovalMapper;
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
public class LoanApprovalCustomServiceImpl
        extends ServiceImpl<LoanApprovalMapper, LoanApproval>
        implements IService<LoanApproval> {

    private static final Logger logger = LoggerFactory.getLogger(LoanApprovalCustomServiceImpl.class);

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.LoanApprovalServiceImpl.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.LoanApprovalServiceImpl.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.LoanApprovalServiceImpl.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.LoanApprovalServiceImpl.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.LoanApprovalServiceImpl.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.LoanApprovalServiceImpl.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.bean.auto.LoanApprovalServiceImpl.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.bean.auto.LoanApprovalServiceImpl.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.findAllAfter:{}", joinPoint);
    }

}
