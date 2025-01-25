package noice.handler.bean;

import com.alibaba.fastjson2.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface BeanServiceAspectInterface {

    Logger logger = LoggerFactory.getLogger(BeanServiceAspectInterface.class);

    default JSONObject addOneBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void addOneAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }

    default JSONObject deleteOneBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void deleteOneAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }

    default JSONObject updateOneBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void updateOneAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        logger.debug("param:{}", param.toJSONString());
        logger.debug("result:{}", result);
        logger.debug("beforeInfo:{}", beforeInfo.toJSONString());
    }

    default JSONObject findOneBefore(JSONObject param) {
        logger.debug("param:{}", param.toJSONString());
        return null;
    }

    default void findOneAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
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
