package com.example.cyjentitycreater.service.custom;

import com.alibaba.fastjson.JSONObject;

import java.io.IOException;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
public interface EntityNameCustomService {

        void generateJavaFile(String id) throws IOException;

        void createComponentFile(String id);

        JSONObject findDataTableAndFormByName(String entityCode);

}
