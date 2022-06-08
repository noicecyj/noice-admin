package com.example.cyjentitycreater.service.custom;

import com.alibaba.fastjson.JSONObject;
import com.example.cyjcommon.entity.Entity;

/**
 * @author Noice
 * @version 1.0
 * @date 2021-10-16
 */
public interface EntityCustomService {

    void generateJavaFile(Entity po);

    void entityHandler(Entity entity);

    JSONObject findDataTableAndFormByName(String entityCode);

}
