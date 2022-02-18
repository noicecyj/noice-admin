package com.example.cyjentitycreater.service.custom;

import com.alibaba.fastjson.JSONObject;
import com.example.cyjentitycreater.entity.auto.po.EntityNamePO;

import java.io.IOException;
import java.util.List;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-10-16
 */
public interface EntityNameCustomService {

    List<EntityNamePO> findListByParentEntityName(String entityName);

    void generateJavaFile(String id);

    void createComponentFile(String id);

    JSONObject findDataTableAndFormByName(String entityCode);

}
