package noice.handler.bean;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
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
public class BeanServiceAspect {

    private static final Logger logger = LoggerFactory.getLogger(BeanServiceAspect.class);

    @Pointcut("execution(* noice.service.bean.*.addOne(..))")
    public void addPoint() {
    }

    @Around("addPoint()")
    public Object addCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanServiceAspectInterface beanServiceAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Service addOneBefore start ====================");
        JSONObject beforeInfo = beanServiceAspectInterface.addOneBefore(param);
        logger.debug("===================== bean Service addOneBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Service addOneAfter start ====================");
        beanServiceAspectInterface.addOneAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Service addOneAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.service.bean.*.deleteOne(..))")
    public void deletePoint() {
    }

    @Around("deletePoint()")
    public Object deleteCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanServiceAspectInterface beanServiceAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Service deleteOneBefore start ====================");
        JSONObject beforeInfo = beanServiceAspectInterface.deleteOneBefore(param);
        logger.debug("===================== bean Service deleteOneBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Service deleteOneAfter start ====================");
        beanServiceAspectInterface.deleteOneAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Service deleteOneAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.service.bean.*.updateOne(..))")
    public void updatePoint() {
    }

    @Around("updatePoint()")
    public Object updateCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanServiceAspectInterface beanServiceAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Service updateOneBefore start ====================");
        JSONObject beforeInfo = beanServiceAspectInterface.updateOneBefore(param);
        logger.debug("===================== bean Service updateOneBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Service updateOneAfter start ====================");
        beanServiceAspectInterface.updateOneAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Service updateOneAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.service.bean.*.findOne(..))")
    public void findPoint() {
    }

    @Around("findPoint()")
    public Object findCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanServiceAspectInterface beanServiceAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Service findOneBefore start ====================");
        JSONObject beforeInfo = beanServiceAspectInterface.findOneBefore(param);
        logger.debug("===================== bean Service findOneBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Service findOneAfter start ====================");
        beanServiceAspectInterface.findOneAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Service findOneAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.service.bean.*.findList(..))")
    public void findListPoint() {
    }

    @Around("findListPoint()")
    public Object findListCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanServiceAspectInterface beanServiceAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Service findListBefore start ====================");
        JSONObject beforeInfo = beanServiceAspectInterface.findListBefore(param);
        logger.debug("===================== bean Service findListBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Service findListAfter start ====================");
        beanServiceAspectInterface.findListAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Service findListAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.service.bean.*.findPage(..))")
    public void findPagePoint() {
    }

    @Around("findPagePoint()")
    public Object findPageCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        BeanServiceAspectInterface beanServiceAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== bean Service findListBefore start ====================");
        JSONObject beforeInfo = beanServiceAspectInterface.findPageBefore(param);
        logger.debug("===================== bean Service findListBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== bean Service findListAfter start ====================");
        beanServiceAspectInterface.findPageAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== bean Service findListAfter end ====================");
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
                returnObj.put("param<BaseDtoBean>", JSONObject.from(joinPoint.getArgs()[0]));
            } else if (joinPoint.getArgs()[0] instanceof String) {
                returnObj.put("param<String>", joinPoint.getArgs()[0]);
            }
        }
        return returnObj;
    }

    private JSONObject checkReturn(Object proceed) {
        JSONObject returnObj = new JSONObject();
        if (proceed == null) {
            return returnObj;
        } else if (proceed instanceof List<?>) {
            returnObj.put("return<List<BaseDtoBean>>", JSONArray.from(proceed));
        } else if (proceed instanceof BaseDtoBean) {
            returnObj.put("return<BaseDtoBean>", JSONObject.from(proceed));
        } else if (proceed instanceof IPage<?>) {
            returnObj.put("return<IPage<BaseDtoBean>>", JSONObject.from(proceed));
        } else if (proceed instanceof Integer) {
            returnObj.put("return<Integer>", proceed);
        }
        return returnObj;
    }

    private BeanServiceAspectInterface getMethodType(ProceedingJoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String classFullName = signature.getMethod().getDeclaringClass().getName();
        List<String> split = StrUtil.split(classFullName, ".");
        String name = split.get(split.size() - 1);
        logger.debug("signature:{}", name);
        Map<String, BeanServiceAspectInterface> beansOfType = SpringUtil.getBeansOfType(BeanServiceAspectInterface.class);
        BeanServiceAspectInterface beanServiceAspectInterface = beansOfType.get(StrUtil.lowerFirst(name) + "Aspect");
        if (beanServiceAspectInterface == null) {
            beanServiceAspectInterface = beansOfType.get("beanServiceAspectInterface");
        }
        return beanServiceAspectInterface;
    }

}