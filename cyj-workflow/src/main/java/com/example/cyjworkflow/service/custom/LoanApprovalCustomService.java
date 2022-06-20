package com.example.cyjworkflow.service.custom;

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
public class LoanApprovalCustomService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(LoanApprovalCustomService.class);

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.LoanApprovalService.addOne(..))")
    public void addOneBefore(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.addOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.LoanApprovalService.addOne(..))")
    public void addOneAfter(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.addOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.LoanApprovalService.deleteOne(..))")
    public void deleteOneBefore(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.deleteOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.LoanApprovalService.deleteOne(..))")
    public void deleteOneAfter(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.deleteOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.LoanApprovalService.updateOne(..))")
    public void updateOneBefore(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.updateOneBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.LoanApprovalService.updateOne(..))")
    public void updateOneAfter(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.updateOneAfter:{}", joinPoint);
    }

    @Before(value = "execution(* com.example.cyjworkflow.service.auto.LoanApprovalService.findAll(..))")
    public void findAllBefore(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.findAllBefore:{}", joinPoint);
    }

    @After(value = "execution(* com.example.cyjworkflow.service.auto.LoanApprovalService.findAll(..))")
    public void findAllAfter(JoinPoint joinPoint) {
        logger.info("LoanApprovalService.findAllAfter:{}", joinPoint);
    }

}
