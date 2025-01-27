package noice.handler.relation;

import com.alibaba.fastjson2.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface RelationRepositoryAspectInterface {

    static final Logger logger = LoggerFactory.getLogger(RelationRepositoryAspectInterface.class);

    default JSONObject addBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void addAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo);
    }

    default JSONObject deleteBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void deleteAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo);
    }

    default JSONObject countBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void countAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo);
    }

    default JSONObject findBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void findAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result.toJSONString());
        logger.debug("beforeInfo:{}", beforeInfo);
    }

    default JSONObject findListBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void findListAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result.toJSONString());
        logger.debug("beforeInfo:{}", beforeInfo);
    }

}
