package noice.handler.relation;

import com.alibaba.fastjson2.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface RelationServiceAspectInterface {

    static final Logger logger = LoggerFactory.getLogger(RelationServiceAspectInterface.class);

    default JSONObject getBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void getAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }

    default JSONObject setBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void setAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }
}
