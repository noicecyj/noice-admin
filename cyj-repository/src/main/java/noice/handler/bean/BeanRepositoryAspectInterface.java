package noice.handler.bean;

import com.alibaba.fastjson2.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface BeanRepositoryAspectInterface {

    Logger logger = LoggerFactory.getLogger(BeanRepositoryAspectInterface.class);

    default JSONObject addBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void addAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }

    default JSONObject deleteBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void deleteAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }

    default JSONObject updateBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void updateAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }

    default JSONObject countBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void countAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }

    default JSONObject findBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void findAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result.toJSONString());
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }

    default JSONObject findListBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void findListAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result.toJSONString());
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }

    default JSONObject findPageBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void findPageAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result.toJSONString());
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }

}
