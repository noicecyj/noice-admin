package com.example.cyjentitycreater.service.custom;

import com.alibaba.fastjson.JSONObject;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
public interface EntityNameCustomService {

    void generateJavaFile(String id);

    void createComponentFile(String id);

    JSONObject findDataTableAndFormByName(String entityCode);

}
