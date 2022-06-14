package com.example.cyjentitycreater.service.custom;

import com.alibaba.fastjson.JSONObject;
import com.example.cyjcommon.entity.Persistent;

/**
 * @author Noice
 * @version 1.0
 * @date 2021-10-16
 */
public interface EntityCustomService {

    void generateJavaFile(Persistent po);

    void entityHandler(Persistent persistent);

    JSONObject findDataTableAndFormByName(String entityCode);

}
