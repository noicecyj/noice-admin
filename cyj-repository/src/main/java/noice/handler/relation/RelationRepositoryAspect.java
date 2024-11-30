package noice.handler.relation;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
public class RelationRepositoryAspect {

    private static final Logger logger = LoggerFactory.getLogger(RelationRepositoryAspect.class);

    @Pointcut("execution(* noice.repository.relation.*.add(..))")
    public void addPoint() {
    }

    @Around("addPoint()")
    public Object addCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        RelationRepositoryAspectInterface relationRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== relation Repository addBefore start ====================");
        JSONObject beforeInfo = relationRepositoryAspectInterface.addBefore(param);
        logger.debug("===================== relation Repository addBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== relation Repository addAfter start ====================");
        relationRepositoryAspectInterface.addAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== relation Repository addAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.repository.relation.*.delete(..))")
    public void deletePoint() {
    }

    @Around("deletePoint()")
    public Object deleteCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        RelationRepositoryAspectInterface relationRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== relation Repository deleteBefore start ====================");
        JSONObject beforeInfo = relationRepositoryAspectInterface.deleteBefore(param);
        logger.debug("===================== relation Repository deleteBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== relation Repository deleteAfter start ====================");
        relationRepositoryAspectInterface.deleteAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== relation Repository deleteAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.repository.relation.*.count(..))")
    public void countPoint() {
    }

    @Around("countPoint()")
    public Object countCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        RelationRepositoryAspectInterface relationRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== relation Repository countBefore start ====================");
        JSONObject beforeInfo = relationRepositoryAspectInterface.countBefore(param);
        logger.debug("===================== relation Repository countBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== relation Repository countAfter start ====================");
        relationRepositoryAspectInterface.countAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== relation Repository countAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.repository.relation.*.find(..))")
    public void findPoint() {
    }

    @Around("findPoint()")
    public Object findCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        RelationRepositoryAspectInterface relationRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== relation Repository findBefore start ====================");
        JSONObject beforeInfo = relationRepositoryAspectInterface.findBefore(param);
        logger.debug("===================== relation Repository findBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== relation Repository findAfter start ====================");
        relationRepositoryAspectInterface.findAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== relation Repository findAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.repository.relation.*.findList(..))")
    public void findListPoint() {
    }

    @Around("findListPoint()")
    public Object findListCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        RelationRepositoryAspectInterface relationRepositoryAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== relation Repository findListBefore start ====================");
        JSONObject beforeInfo = relationRepositoryAspectInterface.findListBefore(param);
        logger.debug("===================== relation Repository findListBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== relation Repository findListAfter start ====================");
        relationRepositoryAspectInterface.findListAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== relation Repository findListAfter end ====================");
        return proceed;
    }

    private JSONObject checkParam(ProceedingJoinPoint joinPoint) {
        JSONObject returnObj = new JSONObject();
        if (joinPoint.getArgs().length == 0) {
            return null;
        } else if (joinPoint.getArgs().length == 1) {
            if (joinPoint.getArgs()[0] instanceof BaseDtoBean) {
                returnObj.put("param<BasePoRelation>", JSONObject.from(joinPoint.getArgs()[0]));
            } else if (joinPoint.getArgs()[0] instanceof String) {
                returnObj.put("param<String>", joinPoint.getArgs()[0]);
            } else if (joinPoint.getArgs()[0] instanceof QueryWrapper<?>) {
                returnObj.put("param<QueryWrapper<BasePoRelation>>", joinPoint.getArgs()[0]);
            }
        }
        return returnObj;
    }

    private JSONObject checkReturn(Object proceed) {
        JSONObject returnObj = new JSONObject();
        if (proceed == null) {
            return returnObj;
        } else if (proceed instanceof List<?>) {
            returnObj.put("return<List<BasePoRelation>>", JSONArray.from(proceed));
        } else if (proceed instanceof BaseDtoBean) {
            returnObj.put("return<BasePoRelation>", JSONObject.from(proceed));
        } else if (proceed instanceof Integer) {
            returnObj.put("return<Integer>", proceed);
        } else if (proceed instanceof Long) {
            returnObj.put("return<Long>", proceed);
        }
        return returnObj;
    }

    private RelationRepositoryAspectInterface getMethodType(ProceedingJoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String classFullName = signature.getMethod().getDeclaringClass().getName();
        List<String> split = StrUtil.split(classFullName, ".");
        String name = split.get(split.size() - 1);
        logger.debug("signature:{}", name);
        Map<String, RelationRepositoryAspectInterface> beansOfType = SpringUtil.getBeansOfType(RelationRepositoryAspectInterface.class);
        RelationRepositoryAspectInterface relationRepositoryAspectInterface = beansOfType.get(StrUtil.lowerFirst(name) + "Aspect");
        if (relationRepositoryAspectInterface == null) {
            relationRepositoryAspectInterface = beansOfType.get("relationRepositoryAspectInterface");
        }
        return relationRepositoryAspectInterface;
    }

}
