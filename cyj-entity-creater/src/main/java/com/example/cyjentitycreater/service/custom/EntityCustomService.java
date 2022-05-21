package com.example.cyjentitycreater.service.custom;

import com.alibaba.fastjson.JSONObject;
import com.example.cyjcommon.entity.po.EntityPO;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
public interface EntityCustomService {

    void generateJavaFile(EntityPO po);

    void createComponentFile(EntityPO po);

    JSONObject findDataTableAndFormByName(String entityCode);

}
