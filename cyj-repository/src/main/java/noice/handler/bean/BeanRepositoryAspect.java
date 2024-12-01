package noice.handler.bean;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.handler.dto.BaseDtoBean;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Aspect
@Component
public class BeanRepositoryAspect {

    private static final Logger logger = LoggerFactory.getLogger(BeanRepositoryAspect.class);

    @Pointcut("execution(* noice.repository.bean.*.add(..))")
    public void addPoint() {
    }

    @Around("addPoint()")
    public Object addCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanRepositoryAspectInterface beanRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Repository addBefore start ====================");
        JSONObject beforeInfo = beanRepositoryAspectInterface.addBefore(param);
        logger.debug("===================== bean Repository addBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Repository addAfter start ====================");
        beanRepositoryAspectInterface.addAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Repository addAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.repository.bean.*.delete(..))")
    public void deletePoint() {
    }

    @Around("deletePoint()")
    public Object deleteCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanRepositoryAspectInterface beanRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Repository deleteBefore start ====================");
        JSONObject beforeInfo = beanRepositoryAspectInterface.deleteBefore(param);
        logger.debug("===================== bean Repository deleteBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Repository deleteAfter start ====================");
        beanRepositoryAspectInterface.deleteAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Repository deleteAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.repository.bean.*.update(..))")
    public void updatePoint() {
    }

    @Around("updatePoint()")
    public Object updateCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanRepositoryAspectInterface beanRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Repository updateBefore start ====================");
        JSONObject beforeInfo = beanRepositoryAspectInterface.updateBefore(param);
        logger.debug("===================== bean Repository updateBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Repository updateAfter start ====================");
        beanRepositoryAspectInterface.updateAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Repository updateAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.repository.bean.*.count(..))")
    public void countPoint() {
    }

    @Around("countPoint()")
    public Object countCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanRepositoryAspectInterface beanRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Repository countBefore start ====================");
        JSONObject beforeInfo = beanRepositoryAspectInterface.countBefore(param);
        logger.debug("===================== bean Repository countBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Repository countAfter start ====================");
        beanRepositoryAspectInterface.countAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Repository countAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.repository.bean.*.find(..))")
    public void findPoint() {
    }

    @Around("findPoint()")
    public Object findCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanRepositoryAspectInterface beanRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Repository findBefore start ====================");
        JSONObject beforeInfo = beanRepositoryAspectInterface.findBefore(param);
        logger.debug("===================== bean Repository findBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Repository findAfter start ====================");
        beanRepositoryAspectInterface.findAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Repository findAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.repository.bean.*.findList(..))")
    public void findListPoint() {
    }

    @Around("findListPoint()")
    public Object findListCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanRepositoryAspectInterface beanRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Repository findListBefore start ====================");
        JSONObject beforeInfo = beanRepositoryAspectInterface.findListBefore(param);
        logger.debug("===================== bean Repository findListBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Repository findListAfter start ====================");
        beanRepositoryAspectInterface.findListAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Repository findListAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.repository.bean.*.findPage(..))")
    public void findPagePoint() {
    }

    @Around("findPagePoint()")
    public Object findPageCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanRepositoryAspectInterface beanRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Repository findListBefore start ====================");
        JSONObject beforeInfo = beanRepositoryAspectInterface.findPageBefore(param);
        logger.debug("===================== bean Repository findListBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Repository findListAfter start ====================");
        beanRepositoryAspectInterface.findPageAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Repository findListAfter end ====================");
        return proceed;
    }

    private JSONObject checkParam(ProceedingJoinPoint joinPoint) {
        JSONObject returnObj = new JSONObject();
        if (joinPoint.getArgs().length == 0) {
            return null;
        } else if (joinPoint.getArgs().length == 1) {
            if (joinPoint.getArgs()[0] instanceof List<?>) {
                returnObj.put("param<List<String>>", JSONArray.from(joinPoint.getArgs()[0]));
            } else if (joinPoint.getArgs()[0] instanceof BaseDtoBean) {
                returnObj.put("param<BasePoBean>", JSONObject.from(joinPoint.getArgs()[0]));
            } else if (joinPoint.getArgs()[0] instanceof String) {
                returnObj.put("param<String>", joinPoint.getArgs()[0]);
            } else if (joinPoint.getArgs()[0] instanceof QueryWrapper<?>) {
                returnObj.put("param<QueryWrapper<BasePoBean>>", joinPoint.getArgs()[0]);
            }
        } else if (joinPoint.getArgs().length == 2) {
            if (joinPoint.getArgs()[0] instanceof IPage<?> && joinPoint.getArgs()[1] instanceof QueryWrapper<?>) {
                returnObj.put("param<IPage<BasePoBean>>", JSONObject.from(joinPoint.getArgs()[0]));
                returnObj.put("param<QueryWrapper<BasePoBean>>", JSONObject.from(joinPoint.getArgs()[1]));
            } else if (joinPoint.getArgs()[0] instanceof IPage<?> && joinPoint.getArgs()[1] instanceof BaseDtoBean) {
                returnObj.put("param<IPage<BasePoBean>>", JSONObject.from(joinPoint.getArgs()[0]));
                returnObj.put("param<BasePoBean>", JSONObject.from(joinPoint.getArgs()[1]));
            }
        }
        return returnObj;
    }

    private JSONObject checkReturn(Object proceed) {
        JSONObject returnObj = new JSONObject();
        if (proceed == null) {
            return returnObj;
        } else if (proceed instanceof List<?>) {
            returnObj.put("return<List<BasePoBean>>", JSONArray.from(proceed));
        } else if (proceed instanceof BaseDtoBean) {
            returnObj.put("return<BasePoBean>", JSONObject.from(proceed));
        } else if (proceed instanceof IPage<?>) {
            returnObj.put("return<IPage<BasePoBean>>", JSONObject.from(proceed));
        } else if (proceed instanceof Integer) {
            returnObj.put("return<Integer>", proceed);
        } else if (proceed instanceof Long) {
            returnObj.put("return<Long>", proceed);
        }
        return returnObj;
    }

    private BeanRepositoryAspectInterface getMethodType(ProceedingJoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String classFullName = signature.getMethod().getDeclaringClass().getName();
        List<String> split = StrUtil.split(classFullName, ".");
        String name = split.get(split.size() - 1);
        logger.debug("signature:{}", name);
        Map<String, BeanRepositoryAspectInterface> beansOfType = SpringUtil.getBeansOfType(BeanRepositoryAspectInterface.class);
        BeanRepositoryAspectInterface beanRepositoryAspectInterface = beansOfType.get(StrUtil.lowerFirst(name) + "Aspect");
        if (beanRepositoryAspectInterface == null) {
            beanRepositoryAspectInterface = beansOfType.get("beanRepositoryAspectInterface");
        }
        return beanRepositoryAspectInterface;
    }

}