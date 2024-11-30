package noice.handler.relation;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import noice.handler.dto.BaseDtoRelation;
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
public class RelationServiceAspect {

    private static final Logger logger = LoggerFactory.getLogger(RelationServiceAspect.class);

    @Pointcut("execution(* noice.service.relation.*.get(..))")
    public void getPoint() {
    }

    @Around("getPoint()")
    public Object getCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        RelationServiceAspectInterface relationServiceAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== relation Service getBefore start ====================");
        JSONObject beforeInfo = relationServiceAspectInterface.getBefore(param);
        logger.debug("===================== relation Service getBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== relation Service getAfter start ====================");
        relationServiceAspectInterface.getAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== relation Service getAfter end ====================");
        return proceed;
    }

    @Pointcut("execution(* noice.service.relation.*.set(..))")
    public void setPoint() {
    }

    @Around("setPoint()")
    public Object setCutAround(ProceedingJoinPoint joinPoint) throws Throwable {
        RelationServiceAspectInterface relationServiceAspectInterface = this.getMethodType(joinPoint);
        JSONObject param = checkParam(joinPoint);
        logger.debug("===================== relation Service setBefore start ====================");
        JSONObject beforeInfo = relationServiceAspectInterface.setBefore(param);
        logger.debug("===================== relation Service setBefore end ====================");
        Object proceed = joinPoint.proceed();
        JSONObject result = checkReturn(proceed);
        logger.debug("===================== relation Service setAfter start ====================");
        relationServiceAspectInterface.setAfter(param, result, ObjectUtil.isNotNull(beforeInfo) ? beforeInfo : new JSONObject());
        logger.debug("===================== relation Service setAfter end ====================");
        return proceed;
    }

    private JSONObject checkParam(ProceedingJoinPoint joinPoint) {
        JSONObject returnObj = new JSONObject();
        if (joinPoint.getArgs().length == 0) {
            return returnObj;
        } else if (joinPoint.getArgs().length == 1) {
            if (joinPoint.getArgs()[0] instanceof BaseDtoRelation) {
                returnObj.put("param<BaseDtoRelation>", JSONObject.from(joinPoint.getArgs()[0]));
            }
        } else if (joinPoint.getArgs().length == 2) {
            if (joinPoint.getArgs()[0] instanceof List<?> && joinPoint.getArgs()[1] instanceof List<?>) {
                returnObj.put("paramList<String>", JSONArray.from(joinPoint.getArgs()[0]));
                returnObj.put("paramList<BaseDtoRelation>", JSONArray.from(joinPoint.getArgs()[1]));
            }
        }
        return returnObj;
    }

    private JSONObject checkReturn(Object proceed) {
        JSONObject returnObj = new JSONObject();
        if (proceed == null) {
            return null;
        } else if (proceed instanceof Integer) {
            returnObj.put("return<Integer>", proceed);
        }
        return returnObj;
    }

    private RelationServiceAspectInterface getMethodType(ProceedingJoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String classFullName = signature.getMethod().getDeclaringClass().getName();
        List<String> split = StrUtil.split(classFullName, ".");
        String name = split.get(split.size() - 1);
        logger.debug("signature:{}", name);
        Map<String, RelationServiceAspectInterface> beansOfType = SpringUtil.getBeansOfType(RelationServiceAspectInterface.class);
        RelationServiceAspectInterface relationServiceAspectInterface = beansOfType.get(StrUtil.lowerFirst(name) + "Aspect");
        if (relationServiceAspectInterface == null) {
            relationServiceAspectInterface = beansOfType.get("relationServiceAspectInterface");
        }
        return relationServiceAspectInterface;
    }

}
